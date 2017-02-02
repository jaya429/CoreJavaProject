package com.svr.logical;

/**
 * @author Venkata Saripella
 *
 */
public class DivisableRule {

    public static void check(Integer value){
        if((value%3 ==0 || value%4 == 0) && !(value%3==0 && value%4 ==0)){
         
            System.out.println(value + " is divisable by either one but not both");
        }else{
            System.out.println(value + " is divisable by 3 and 4 ");
        }
    }
    public static void main(String[] args) {

        DivisableRule.check(12);
        
        DivisableRule.check(9);
        
    }
}
