package com.svr.strings;

import java.util.Arrays;

/**
 * @author Venkata Saripella
 *
 */
public class StringOperations {

    /**
     * @param args
     */
    public static void main(String[] args) {
//        This is (true) one and ((false)) (((this))) one
        String inputString = "((";
        checkBalanceWithSplit(inputString);
//        checkBalanceWithToCharArray(inputString);
        check();
    }
    
    public static void checkBalanceWithSplit(String inputString){
        
        String[] open  = inputString.split("\\(");
        String[] close = inputString.split("\\)");
        System.out.println(Arrays.asList(open));
        System.out.println(Arrays.asList(close));
        System.out.println(open.length);
        System.out.println(close.length);
        if(open.length == close.length){
            System.out.println("Given string is balanced");
        }else{
            System.out.println("Given string is not balanced");
        }
    }
    
    public static void checkBalanceWithToCharArray(String inputString){
        
        char[]   charArr = inputString.toCharArray();
        Integer  open    = 0;
        Integer  close   = 0;
        for(char c : charArr){
            if(c == '('){
                open++;
            }else if(c == ')'){
                close++;
            }
        }
        if(open ==0 && close ==0){
            System.out.println("The input string doesn't contain '(' and ')' brackets ");
        }else if(open == close){
            System.out.println("Given string is balanced");
        }else{
            System.out.println("Given string is not balanced");
        }
    }
    
    public static void check(){
        String str = "rama raju";
        char[] chr = {'r','a','m','a','r','a','j'};
        System.out.println(chr.length);
        System.arraycopy(chr, 1, chr, 1, 1);
        System.out.println("**********");
        System.out.println(chr);
        System.out.println("**********");
        System.out.println(chr.length);
        System.out.println(str.charAt(0));
        System.out.println(str.substring(2,8));
        System.out.println(String.valueOf(1));
        System.out.println("-------------");
        System.out.println(Arrays.copyOf(chr, 2));
        System.out.println("-------------");
    }

}
