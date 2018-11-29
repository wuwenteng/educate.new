package com.example.edu.jpeople.util;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author ASUS
 * @date 2018/11/13
 */
public class DateCountdown {

    /**
     * 倒计时
     */
    public void countdown() {
        //倒计时
        System.out.println("倒计时");
        long start = System.currentTimeMillis();
        long end = start + 10 * 1000;

        Timer t = new Timer();
        CountdownTask task = new CountdownTask();
        t.schedule(task,0,1000);
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                t.cancel();
            }
        },new Date(end));
    }
}
