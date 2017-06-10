package com.sapient.thread.prodcon;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<Message> queue =null;



	public Producer(BlockingQueue<Message> q) {
		super();
		this.queue = q;
	}


	@Override
	public void run() {

		for(int i=0; i<100; i++){
			Message msg = new Message(""+i);
			try {
				Thread.sleep(i);
				queue.put(msg);
				System.out.println("Produced "+msg.getMsg());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//adding exit message
		Message msg = new Message("exit");
		try {
			queue.put(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

