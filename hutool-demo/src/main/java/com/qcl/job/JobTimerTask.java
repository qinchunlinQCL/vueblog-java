package com.qcl.job;

import java.util.Timer;
import java.util.TimerTask;

/**
 * TODO  使用 TimerTask 创建job定时任务
 *
 * @author 王松
 * @date 2019/9/14 0014 20:50
 */
public class JobTimerTask {

    static long count = 0;
    public static void main(String[] args) {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                count++;
                System.out.println(count);
            }
        };
        //创建timer对象设置间隔时间
        Timer timer = new Timer();
        // 间隔天数
        long delay = 0;
        // 间隔毫秒数
        long period = 1000;
        timer.scheduleAtFixedRate(timerTask, delay, period);
    }
}