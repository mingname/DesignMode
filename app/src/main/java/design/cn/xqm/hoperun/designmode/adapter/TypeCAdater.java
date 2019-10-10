package design.cn.xqm.hoperun.designmode.adapter;

/**
 * Created by xueqiaoming on 2019/10/9.
 */

public class TypeCAdater extends TypeCImpl implements MicroUsb{
    @Override
    public void isMicroUsb() {
        isTypeC();
    }
}
