package design.cn.xqm.hoperun.designmode.component;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/11.
 * leaf节点类 公司技术部
 */

public class MinTechDepartment extends Firm{
    public MinTechDepartment(String firmName) {
        super(firmName);
    }

    @Override
    protected void append(Firm firm) {

    }

    @Override
    protected void remove(Firm firm) {

    }

    @Override
    protected void show(int level) {
        StringBuilder stringBuilder = new StringBuilder("");
        for(int i = 0;i<level;i++){
            stringBuilder.append("*");
        }
        Log.e("xqm",new String(stringBuilder)+this.getFirmName());
    }
}
