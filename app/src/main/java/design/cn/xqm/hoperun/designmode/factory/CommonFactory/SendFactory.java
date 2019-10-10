package design.cn.xqm.hoperun.designmode.factory.CommonFactory;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/8.
 * 工厂类
 */

public class SendFactory {
    /**
     * 静态工厂方法模式
     * @return
     */
    public static SenderI mailProduce(){
        return new MailSender();
    }

    public static SenderI smsProduce(){
        return new SmsSender();
    }


}
