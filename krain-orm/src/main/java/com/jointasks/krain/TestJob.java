package com.jointasks.krain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestJob {
	
	public void test() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("job start at" + format.format(new Date()));
		
		for (int i = 0; i < 100; i++) {
			int j = i * 100;
		}
		
		System.out.println("job end at" + format.format(new Date()));
	}

}
