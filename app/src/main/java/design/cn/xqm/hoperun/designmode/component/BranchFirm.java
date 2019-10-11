package design.cn.xqm.hoperun.designmode.component;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xueqiaoming on 2019/10/11.
 * 分公司对象
 */

public class BranchFirm extends Firm{
    private List<Firm> cList;

    public BranchFirm(String firmName) {
        super(firmName);
        cList = new ArrayList<Firm>();
    }

    @Override
    protected void append(Firm firm) {
        cList.add(firm);
    }

    @Override
    protected void remove(Firm firm) {
        cList.remove(firm);
    }

    @Override
    protected void show(int level) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i <level;i++){
            sb.append("*");
        }
        Log.e("xqm",new String(sb)+this.getFirmName());
        for(Firm c : cList){
            c.show(level + 2);
        }
    }
}
