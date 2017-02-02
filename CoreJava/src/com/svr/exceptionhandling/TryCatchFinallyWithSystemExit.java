/**
 * 
 */
package com.svr.exceptionhandling;

/**
 * @author Venkata Saripella
 *
 */
public class TryCatchFinallyWithSystemExit {
    
    public static Integer test(){
        try {
            System.out.println("entered into try");
            System.exit(0);
            return 1;
            
//            System.out.println("");   // Unreachable code 
        } catch (Exception e) {
            return 2;
//            System.out.println("");   // Unreachable code 
        }
        finally{
            return 3;                  // out put is 3
        }
//        return 10;                   // Unreachable code 
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("started");
        System.out.println("system.exit::"+test());
        System.out.println("exited");
    }

}
