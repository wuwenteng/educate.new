package com.example.edu.jpeople.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author ASUS
 * @date 2018/11/10
 * 服务于DateCountdown类
 */
public class CountdownTask extends TimerTask {

    @Override
    public void run() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss.SSS");
        System.out.println("当前时间" + dateFormat.format(new Date()));
    }
}
