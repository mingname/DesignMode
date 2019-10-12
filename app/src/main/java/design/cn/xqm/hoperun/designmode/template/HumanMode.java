package design.cn.xqm.hoperun.designmode.template;

/**
 * Created by xueqiaoming on 2019/10/12.
 */

public abstract class HumanMode {
    //起床
    protected abstract void getUp();
    //早饭
    protected abstract void breakFast();
    //工作
    protected abstract void work();
    //睡觉
    protected abstract void sleep();

    /**
     * 一天的
     */
    public final void lifeDay(){
        getUp();
        breakFast();
        work();
        sleep();
    }

    //是否休假一天（钩子方法）
    protected boolean isWork(){

        return true;
    };

}
