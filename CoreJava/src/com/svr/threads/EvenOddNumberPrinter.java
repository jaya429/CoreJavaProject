package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class EvenOddNumberPrinter {

    private static class NumberPrienter{
        private boolean isEvenPrinted = true;
        
        public void printOdd(int number) throws InterruptedException{

            //Get lock on numer priente
            synchronized (this){
                if(!isEvenPrinted){
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
                if(isEvenPrinted)
                    wait();
                System.out.println("Thread Two :: "+number);
                isEvenPrinted = true;
                notify();
            }
        }
    }
    
   private static class OddNumberGenerator implements Runnable{

     private NumberPrienter q;
     private Integer       max;
     
     public OddNumberGenerator(NumberPrienter q, Integer max){
         this.q   = q;
         this.max = max;
     }
     @Override
     public void run() {
        
         for(Integer i=1; i<max; i+=2){
             try {
                 q.printOdd(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
         }
     }
   }
   
   private static class EvenNumberGenerator implements Runnable{

       private NumberPrienter q;
       private Integer        max;
       
       public EvenNumberGenerator(NumberPrienter q, Integer max){
           this.q   = q;
           this.max = max;
       }
       @Override
       public void run() {
          
           for(Integer i=2; i<max; i+=2){
               try {
                   q.printEven(i);
              } catch (Exception e) {
                  e.printStackTrace();
              }
           }
       }
       
   }
   
   public static void main(String ... args){
       
       Integer        maxNumber      = 10;
       NumberPrienter numberPrienter = new NumberPrienter();
       
       new Thread(new EvenNumberGenerator(numberPrienter, maxNumber)).start();
       new Thread(new OddNumberGenerator(numberPrienter, maxNumber)).start();
       
   }
}
