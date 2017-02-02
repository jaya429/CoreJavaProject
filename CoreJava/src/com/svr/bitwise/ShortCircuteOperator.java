/**
 * 
 */
package com.svr.bitwise;

/**
 * @author Venkata Saripella
 *
 */
public class ShortCircuteOperator {

    static Integer x = 10;
    static Integer y = 15;

    public static void shortCircuteAnd(){
        if(++x > 10 && ++y < 15){
            x++;
        }else{
            y++;
        }
        System.out.println(x+"       "+y);
    }
    
    public static void shortCircuteOR(){
        x=10; y=15;
        if(++x > 10 || ++y < 15){
            x++;
        }else{
            y++;
        }
        System.out.println(x+"       "+y);
    }
    
    public static void shortCircuteAndWithPreincreament(){
        x=10; 
        if(++x < 10 && x/0>10){
          System.out.println("Hello");
        }else{
            System.out.println("Hi");
        }
    }
}
