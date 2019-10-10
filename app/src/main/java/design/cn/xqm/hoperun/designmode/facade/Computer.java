package design.cn.xqm.hoperun.designmode.facade;

import android.util.Log;

/**
 * Created by xueqiaoming on 2019/10/10.
 */

public class Computer {
    private Cpu cpu;
    private Disk disk;
    private Memory memory;

    public Computer(){
        cpu = new Cpu();
        disk = new Disk();
        memory = new Memory();
    }

    public void start(){
        Log.e("xqm","computer start begin");
        cpu.start();
        disk.start();
        memory.start();
        Log.e("xqm","computer start end...");
    }

    public void shutDown(){
        Log.e("xqm","computer shutDown begin");
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
        Log.e("xqm","computer shutDown end...");
    }
}
