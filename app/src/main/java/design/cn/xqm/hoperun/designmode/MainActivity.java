package design.cn.xqm.hoperun.designmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import design.cn.xqm.hoperun.designmode.adapter.MicroUsb;
import design.cn.xqm.hoperun.designmode.adapter.TypeCAdater;
import design.cn.xqm.hoperun.designmode.command.AddRequirementCommand;
import design.cn.xqm.hoperun.designmode.command.Command;
import design.cn.xqm.hoperun.designmode.command.Group;
import design.cn.xqm.hoperun.designmode.command.Invoker;
import design.cn.xqm.hoperun.designmode.command.RequirementGroup;
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
import design.cn.xqm.hoperun.designmode.mediator.ColleagueB;
import design.cn.xqm.hoperun.designmode.mediator.Colleagueclass;
import design.cn.xqm.hoperun.designmode.mediator.ConcreateMediator;
import design.cn.xqm.hoperun.designmode.memento.Han;
import design.cn.xqm.hoperun.designmode.memento.History;
import design.cn.xqm.hoperun.designmode.memento.SiMaQian;
import design.cn.xqm.hoperun.designmode.observable.TargetObservable;
import design.cn.xqm.hoperun.designmode.observable.TargetObserver;
import design.cn.xqm.hoperun.designmode.observable.TargetObserver01;
import design.cn.xqm.hoperun.designmode.prototype.PrototypeMode;
import design.cn.xqm.hoperun.designmode.proxy.ISinger;
import design.cn.xqm.hoperun.designmode.proxy.staticproxy.Singer;
import design.cn.xqm.hoperun.designmode.proxy.staticproxy.SingerProxy;
import design.cn.xqm.hoperun.designmode.purchaselink.Approver;
import design.cn.xqm.hoperun.designmode.purchaselink.Congress;
import design.cn.xqm.hoperun.designmode.purchaselink.President;
import design.cn.xqm.hoperun.designmode.purchaselink.PurchaseRequest;
import design.cn.xqm.hoperun.designmode.purchaselink.VicePresident;
import design.cn.xqm.hoperun.designmode.singleton.SignletonMode;
import design.cn.xqm.hoperun.designmode.state.BookedState;
import design.cn.xqm.hoperun.designmode.state.FreeState;
import design.cn.xqm.hoperun.designmode.state.HomeContext;
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

        //责任链模式
        Approver a1,a2,a3,a4;
        a1 = new design.cn.xqm.hoperun.designmode.purchaselink.Director("LW");
        a2 = new VicePresident("LWQ");
        a3 = new President("小木木");
        a4 = new Congress("海贼王");
        //创建审批链
        a1.setApprover(a2);
        a2.setApprover(a3);
        a3.setApprover(a4);
        //创建单据
        PurchaseRequest p1 = new PurchaseRequest("购买倚天剑",10001,9999);
        a1.handlePurchaseRequest(p1);
        p1 = new PurchaseRequest("购买屠龙刀",10002,49999);
        a1.handlePurchaseRequest(p1);
        p1 = new PurchaseRequest("购买葵花宝典",10003,99999);
        a1.handlePurchaseRequest(p1);
        p1 = new PurchaseRequest("购买桃花岛",10004,91239999);
        a1.handlePurchaseRequest(p1);
        //命令模式
        Group rg = new RequirementGroup();
        rg.find();//找到需求组
        rg.add();//新增需求
        rg.plan();//列出需求变更计划

        //定义张三为接头人
        Invoker zhangsan = new Invoker();

        //客户下命令
        Command command = new AddRequirementCommand();
        //接头人接受命令
        zhangsan.setCommand(command);
        zhangsan.action();

        //备忘录
        Han han = new Han();//大汉帝国
        Log.e("xqm","汉武帝建元年间，司马到长安任太史令");
        SiMaQian siMaQian = new SiMaQian();
        han.setThing("天下大旱");//公园前108年
        History h = new History(han.getThing());
        siMaQian.addHistoryList("公元前108年",h);

        han.setThing("汉朝立法改革，制定《汉历》");//公元前104年
        History h1 = new History(han.getThing());
        siMaQian.addHistoryList("公元前104年",h1);

        han.setThing("李陵率步兵五千涉单于庭以寡击众，粮尽矢绝后，被迫投降");//公元前99年
        History h2 = new History(han.getThing());
        siMaQian.addHistoryList("公元前99年",h2);

        Log.e("xqm","公元前108年"+siMaQian.getHistoryList("公元前108年").getThing());
        Log.e("xqm","公元前104年"+siMaQian.getHistoryList("公元前104年").getThing());
        Log.e("xqm","公元前99年"+siMaQian.getHistoryList("公元前99年").getThing());

        //状态模式
        HomeContext ctx = new HomeContext();
        ctx.setState(new FreeState());
        ctx.setState(new BookedState());

        //中介者模式
        ConcreateMediator mediator = new ConcreateMediator();
        Colleagueclass colleagueclass = new Colleagueclass("张三",mediator);
        ColleagueB colleagueB = new ColleagueB("李四",mediator);
        //中介者知晓每一个具体的Colleague类
        mediator.setCollA(colleagueclass);
        mediator.setCollB(colleagueB);

        colleagueclass.contact("我是A，我要和同事B说说工作的事情");
        colleagueB.contact("我是B，我下午有时间，下午商量吧");



    }



}
