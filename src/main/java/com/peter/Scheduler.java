package com.peter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Scheduler {
	public void doWork() {
		Date currentTime = new Date();
		// ʱ���ʽָ��
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
		System.out.println("ÿʮ���Զ�����һ�δ˵���������ǰ����ʱ��Ϊ��" + simpleDateFormat.format(currentTime));
	}

}