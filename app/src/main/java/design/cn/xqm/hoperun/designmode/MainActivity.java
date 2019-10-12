package design.cn.xqm.hoperun.designmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import design.cn.xqm.hoperun.designmode.adapter.MicroUsb;
import design.cn.xqm.hoperun.designmode.adapter.TypeCAdater;
import design.cn.xqm.hoperun.designmode.component.BranchFirm;
import design.cn.xqm.hoperun.designmode.component.Firm;
import design.cn.xqm.hoperun.designmode.component.Test;
import design.cn.xqm.hoperun.designmode.decorator.AddDrumstickFriedRice;
import design.cn.xqm.hoperun.designmode.decorator.AddEggFriedRice;
import design.cn.xqm.hoperun.designmode.decorator.FriedRice;
import design.cn.xqm.hoperun.designmode.decorator.ShaXianFriedRice;
import design.cn.xqm.hoperun.designmode.directorcreate.Director;
import design.cn.xqm.hoperun.designmode.directorcreate.IphoneX;
import design.cn.xqm.hoperun.designmode.facade.Computer;
import design.cn.xqm.hoperun.designmode.factory.CommonFactory.SendFactory;
import design.cn.xqm.hoperun.designmode.factory.CommonFactory.SenderI;
import design.cn.xqm.hoperun.designmode.observable.TargetObservable;
import design.cn.xqm.hoperun.designmode.observable.TargetObserver;
import design.cn.xqm.hoperun.designmode.observable.TargetObserver01;
import design.cn.xqm.hoperun.designmode.prototype.PrototypeMode;
import design.cn.xqm.hoperun.designmode.proxy.ISinger;
import design.cn.xqm.hoperun.designmode.proxy.staticproxy.Singer;
import design.cn.xqm.hoperun.designmode.proxy.staticproxy.SingerProxy;
import design.cn.xqm.hoperun.designmode.singleton.SignletonMode;
import design.cn.xqm.hoperun.designmode.strategy.BussCar;
import design.cn.xqm.hoperun.designmode.strategy.Car;
import design.cn.xqm.hoperun.designmode.strategy.Person;
import design.cn.xqm.hoperun.designmode.strategy.SmallCar;
import design.cn.xqm.hoperun.designmode.template.HumanMode;
import design.cn.xqm.hoperun.designmode.template.HumanModeIm;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //单例
        SignletonMode.getSignletonMode().getInput();
        //工厂
        SendFactory factory = new SendFactory();
        SenderI senderI = factory.mailProduce();
        senderI.Send();
        //建造
        Director director = new Director();
        Log.e("xqm",director.createMobilePhone(new IphoneX()).getBattery()+"");
        director.createMobilePhone(new IphoneX()).getBattery();
        //原型
        PrototypeMode prototypeMode = new PrototypeMode();
        prototypeMode.setName("小红");
        PrototypeMode prototypeMode1 = null;
        try {
            prototypeMode1 = prototypeMode.clone();
            prototypeMode1.setName("小芬");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        Log.e("xqm",prototypeMode1.getName()+"");
        //适配器
        MicroUsb microUsb = new TypeCAdater();
        microUsb.isMicroUsb();
        //装饰
        FriedRice base = new ShaXianFriedRice();
        Log.e("xqm",base.description()+base.calPrice());

        AddEggFriedRice eggFriedRice = new AddEggFriedRice(base);
        Log.e("xqm",eggFriedRice.description()+eggFriedRice.calPrice());

        AddDrumstickFriedRice addDrumstickFriedRice = new AddDrumstickFriedRice(base);
        Log.e("xqm",addDrumstickFriedRice.description()+addDrumstickFriedRice.calPrice());

        //静态代理
        final ISinger target = new Singer();
        ISinger proxy = new SingerProxy(target);
        proxy.sing();
        //动态代理
        ISinger proxyRun = (ISinger) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        Log.e("xqm","向观众问好");
                        Object returnValue = method.invoke(target,args);
                        Log.e("xqm","谢谢大家");

                        return returnValue;
                    }
                });
        proxyRun.sing();

        //外观模式
        Computer computerss = new Computer();
        computerss.start();
        Log.e("xqm","================");
        computerss.shutDown();

        //组合模式
        Test dd = new Test();
        dd.testDemo();

        //策略模式
        Car smallcar = new SmallCar("路虎","黑色");
        Car busscar = new BussCar("公交车","白色");
        Person person = new Person("小明","20");
        person.driver(smallcar);
        person.driver(busscar);

        //模板模式
        HumanMode humanMode = new HumanModeIm();
        humanMode.lifeDay();

        //观察者模式
        TargetObservable observable = new TargetObservable();
        TargetObserver one = new TargetObserver();
        one.setObserverName("我是观察者A");

        TargetObserver01 two = new TargetObserver01();
        two.setObserverName("我是观察者B");
        //注册观察者
        observable.addObserver(one);
        observable.addObserver(two);

        observable.setMessage("****我要更新的数据***");
    }



}
