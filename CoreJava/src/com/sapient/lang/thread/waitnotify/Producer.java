package com.sapient.lang.thread.waitnotify;

import java.util.List;

public class Producer implements Runnable{

	List<Integer> sharedQueue =null;
	final int SIZE =2;
	

	public Producer(List<Integer> sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
      for (int i = 0; i < 10; i++) {
		try {
			produce(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		
	}

	private void produce(int i) throws InterruptedException {
		synchronized (sharedQueue) {
			while(sharedQueue.size() == SIZE){
				System.out.println("Producer is wating for consumer to consume");
				sharedQueue.wait();
			}
		}
		synchronized (sharedQueue) {
			sharedQueue.add(i);
			System.out.println("PRODUCE:"+i);
			   Thread.sleep((long)(Math.random() * 1000));
			sharedQueue.notify();
		}
	}
	
}
