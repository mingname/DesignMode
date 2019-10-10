package design.cn.xqm.hoperun.designmode.singleton;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/8.
 * 单例模式
 */

public class SignletonMode {
    private volatile static SignletonMode signletonMode;
    private SignletonMode(){

    }

    public static SignletonMode getSignletonMode(){
        if(signletonMode == null){
            synchronized (SignletonMode.class){
                if(signletonMode == null){
                    signletonMode = new SignletonMode();
                }
            }
        }

        return signletonMode;
    }

    public void getInput(){
        Log.e("xqm","输出");
    }
}
