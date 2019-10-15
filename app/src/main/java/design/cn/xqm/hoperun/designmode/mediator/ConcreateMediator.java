package design.cn.xqm.hoperun.designmode.mediator;

/**
 * Created by xueqiaoming on 2019/10/15.
 */

public class ConcreateMediator extends Mediator{
    Colleagueclass collA;
    ColleagueB collB;

    public Colleagueclass getCollA() {
        return collA;
    }

    public void setCollA(Colleagueclass collA) {
        this.collA = collA;
    }

    public ColleagueB getCollB() {
        return collB;
    }

    public void setCollB(ColleagueB collB) {
        this.collB = collB;
    }

    @Override
    public void contact(String content, Colleague coll) {
        if(coll == collA){
            collB.getMEssage(content);
        }else{
            collA.getMessage(content);
        }
    }
}
