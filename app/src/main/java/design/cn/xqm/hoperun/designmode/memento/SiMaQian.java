package design.cn.xqm.hoperun.designmode.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xueqiaoming on 2019/10/14.
 * 负责人角色 司马迁
 */

public class SiMaQian {
    private Map<String,History> historyMap = new HashMap<String,History>();

    public void addHistoryList(String year,History history){
        historyMap.put(year,history);
    }

    public History getHistoryList(String year){
        if(historyMap.containsKey(year)){
            return historyMap.get(year);
        }

        return null;
    }
}
