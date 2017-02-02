package com.svr.bitwise;

/**
 * @author Venkata Saripella
 *
 */
public class BitwiseOperator {

    static Integer x = 10;
    static Integer y = 15;

    public static void bitwiseAnd(){
        if(++x > 10 & ++y < 15){
            x++;
        }else{
            y++;
        }
        System.out.println(x+"       "+y);
    }
    
    public static void bitwiseOR(){
        x=10; y=15;
        if(++x > 10 | ++y < 15){
            x++;
        }else{
            y++;
        }
        System.out.println(x+"       "+y);
    }
    
    public static void bitwiseAndWithPostIncr(){
        x=10; y=15;
        if(x++ > 10 & y++ < 15){
            x++;
        }else{
            
            y++;
        }
        System.out.println(x+"       "+y);
    }
    
    public static void bitwiseORWithPostIncr(){
        x=10; y=15;
        if(x++ > 10 | y++ < 15){
            x++;
        }else{
            y++;
        }
        System.out.println(x+"       "+y);
    }
}
