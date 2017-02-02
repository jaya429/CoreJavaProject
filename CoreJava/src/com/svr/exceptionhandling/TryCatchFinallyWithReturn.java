/**
 * 
 */
package com.svr.exceptionhandling;

/**
 * @author Venkata Saripella
 *
 */
public class TryCatchFinallyWithReturn {
    
    public static Integer test(){
        try {
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

        System.out.println(test());
    }

}
