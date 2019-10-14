package design.cn.xqm.hoperun.designmode.memento;

/**
 * Created by xueqiaoming on 2019/10/14.
 * 备忘录角色 历史事件
 */

public class History {
    private String thing;

    public History(String thing) {
        this.thing = thing;
    }

    public String getThing(){
        return thing;
    }
}
