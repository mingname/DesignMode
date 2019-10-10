package design.cn.xqm.hoperun.designmode.directorcreate;

/**
 * Created by xueqiaoming on 2019/10/8.
 * 给建造手机定义规范
 */

public interface IBuilePhone {
    /**
     * 建造手机屏幕
     */
    void buildScreen();
    /**
     * 建造手机电池
     */
    void buildBattery();
    /**
     * 建造手机听筒
     */
    void buildMicrophone();
    /**
     * 建造手机话筒
     */
    void buildPhoneReceiver();
    /**
     * 建造手机机身
     */
    void buildPhoneBody();

    MobilePhone createMobilePhone();
}
