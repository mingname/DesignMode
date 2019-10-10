package design.cn.xqm.hoperun.designmode.directorcreate;

/**
 * Created by xueqiaoming on 2019/10/8.
 * 创建手机的工具
 */

public class IphoneX implements IBuilePhone{

    private MobilePhone mobilePhone;

    public IphoneX(){
        mobilePhone = new MobilePhone();
    }

    @Override
    public void buildScreen() {
        mobilePhone.setScreen("OLED显示屏");
    }

    @Override
    public void buildBattery() {
        mobilePhone.setBattery("2700mAh电池容量");
    }

    @Override
    public void buildMicrophone() {
        mobilePhone.setMicrophone("听筒");
    }

    @Override
    public void buildPhoneReceiver() {
        mobilePhone.setPhoneReceiver("话筒");
    }

    @Override
    public void buildPhoneBody() {
        mobilePhone.setPhoneBody("iphoneX机身");
    }

    @Override
    public MobilePhone createMobilePhone() {
        return mobilePhone;
    }

    /**
     * 创建手机
     */

    public MobilePhone build(){
        return mobilePhone;
    }
}
