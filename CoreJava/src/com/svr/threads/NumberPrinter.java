package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class NumberPrinter {

    private boolean isEvenPrinted = true;
    
    public void printOdd(int number) throws InterruptedException{

        //Get lock on numer priente
        synchronized (this){
            if(!isEvenPrinted){
//                System.out.println(" odd wait");
                wait();
            }
            System.out.println("Thread One :: "+number);
            isEvenPrinted = false;
            //Notify the other waiting thread which is waiting on
            //NumberPrinter
            //Other thread will get out of waiting state
            notify();
        }
        
    }
    
    public void printEven(int number) throws InterruptedException{
        synchronized (this) {
            if(isEvenPrinted){
//                System.out.println(" even wait");
                wait();
            }
            System.out.println("Thread Two :: "+number);
            isEvenPrinted = true;
            notify();
        }
    }
}
