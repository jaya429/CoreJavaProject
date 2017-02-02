package com.sapient.lang.thread.waitnotify;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(2);
		Producer p = new  Producer(list);
		Consumer c =new Consumer(list);
		
		Thread t = new Thread(p);
		Thread t1 =new Thread(c);
		t.start();
		t1.start();
		
	}
}
