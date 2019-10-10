package design.cn.xqm.hoperun.designmode.directorcreate;

import android.util.Log;


/**
 * Created by xueqiaoming on 2019/10/8.
 */

public class Director {
    /**
     * 建造一部手机
     */

    public MobilePhone createMobilePhone(IBuilePhone builePhone){

        builePhone.buildBattery();
        builePhone.buildMicrophone();
        builePhone.buildScreen();
        builePhone.buildPhoneReceiver();
        builePhone.buildPhoneBody();

        return builePhone.createMobilePhone();
    }


}
