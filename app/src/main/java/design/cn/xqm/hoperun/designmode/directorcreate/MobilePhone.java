package design.cn.xqm.hoperun.designmode.directorcreate;

import android.text.TextUtils;

/**
 * Created by xueqiaoming on 2019/10/8.
 */

public class MobilePhone {
    //手机屏幕
    private String screen;
    //电池
    private String battery;
    //话筒
    private String microphone;
    //听筒
    private String phoneReceiver;
    //机身
    private String phoneBody;

    public String getScreen() {
        return TextUtils.isEmpty(screen) ? "" : screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getBattery() {
        return TextUtils.isEmpty(battery) ? "" : battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getMicrophone() {
        return TextUtils.isEmpty(microphone) ? "" : microphone;
    }

    public void setMicrophone(String microphone) {
        this.microphone = microphone;
    }

    public String getPhoneReceiver() {
        return TextUtils.isEmpty(phoneReceiver) ? "" : phoneReceiver;
    }

    public void setPhoneReceiver(String phoneReceiver) {
        this.phoneReceiver = phoneReceiver;
    }

    public String getPhoneBody() {
        return TextUtils.isEmpty(phoneBody) ? "" : phoneBody;
    }

    public void setPhoneBody(String phoneBody) {
        this.phoneBody = phoneBody;
    }
}
