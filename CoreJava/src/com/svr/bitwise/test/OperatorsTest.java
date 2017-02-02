/**
 * 
 */
package com.svr.bitwise.test;

/**
 * @author Venkata Saripella
 *
 */
public class OperatorsTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Assignment operator check");
        int a,b,c,d;
        a=b=c=d=20;
        System.out.println(a+" "+b+" "+c+" "+d);
        a+=b-=c*=d/=2;
        System.out.println(a+" "+b+" "+c+" "+d);
        
        Integer x =10;
        x= x++;
        System.out.println(x);
        
        byte value =10;
        value=(byte)(value+1);
        System.out.println(value);
        
        
        Byte value1 =12;
        value1=(byte)(value1+1);
        System.out.println(value1);
        
        byte value3 =(byte)130;
        System.out.println(value3);
        
        short value4 = 150;
        System.out.println(value4);
        
        
        
        
    }

}
