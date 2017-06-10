package com.sapient.thread.waitnotify;

import java.util.List;

public class Consumer implements Runnable{

	List<Integer> sharedQueue =null;
	
	
	
	public Consumer(List<Integer> sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		try {
			consume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void consume() throws InterruptedException {
     synchronized (sharedQueue) {
		while(sharedQueue.size() == 0){
			System.out.println("Consumer is waiting for producer to produce");
			sharedQueue.wait();
		}
	}	
     synchronized (sharedQueue) {
    	   Thread.sleep((long)(Math.random() * 2000));
		System.out.println("CONSUME:"+sharedQueue.remove(0));
		sharedQueue.notify();
	}
	}

}
