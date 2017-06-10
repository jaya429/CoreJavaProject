package com.sapient.thread.prodcon;

import java.util.concurrent.BlockingQueue;

public class Consumer  implements Runnable{

	BlockingQueue<Message> queue =null;
	
	

	public Consumer(BlockingQueue<Message> queue) {
		super();
		this.queue = queue;
	}



	@Override
    public void run() {
        try{
            Message msg;
            //consuming messages until exit message is received
            while((msg = queue.take()).getMsg() !="exit"){
            Thread.sleep(10);
            System.out.println("Consumed "+msg.getMsg());
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}