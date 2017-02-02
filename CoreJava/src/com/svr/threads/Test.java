/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class Test extends Thread{

    B b= new B();
    public static void main(String ...s)throws Exception {
     Test t = new Test();
     Thread t1 = new Thread(t,"t1");
     Thread t2 = new Thread(t,"t2");
     t1.start();
     t2.start();
    }
    public void run(){
        if(Thread.currentThread().getName().equals("t1")){
            b.printName();
        }else{
            b.printValue();
        }
    }
}
