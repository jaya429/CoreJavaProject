/**
 * 
 */
package com.svr.logical;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Venkata Saripella
 *
 */
public class Fibonacci {

    public static List<Integer> buildFibonacciNumbers(FibonacciConfiguration configuration){
        List<Integer>  fibnoccis = new ArrayList<Integer>();
        Integer first     = configuration.getFirstNumber();
        Integer second    = configuration.getSecondNumber();
        for(Integer index=0; index <configuration.limit; index++){
            fibnoccis.add(first);
            first  = first + second;
            second = first - second;
            first  = first - second;
            
            second = first + second;
        }
        return fibnoccis;
    }
    public static void main(String[] args) {

        FibonacciConfiguration configuration = new FibonacciConfiguration();
        configuration.setFirstNumber(5);
        configuration.setSecondNumber(7);
        configuration.setLimit(10);
        
       System.out.println(Fibonacci.buildFibonacciNumbers(configuration))
       ;
    }
}
