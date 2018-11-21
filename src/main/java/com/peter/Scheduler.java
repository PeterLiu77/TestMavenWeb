package com.peter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Scheduler {
	public void doWork() {
		Date currentTime = new Date();
		// 时间格式指定
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
		System.out.println("每十秒自动运行一次此调度器，当前运行时间为：" + simpleDateFormat.format(currentTime));
	}

}