/**
 * 
 */
package com.svr.generics;

import java.io.Serializable;

import com.svr.serialization.Cat;

/**
 * @author Venkata Saripella
 *
 */
public class BoundriesForMethodLevelTypeP {

    public static <T extends Number> T m1(T t){
        return t;
    }
    public static <T extends Number & Runnable> T m2(T t){
        return t;
    }
    
    public static <T extends Serializable> T m2(T t){
        return t;
    }
    
    public static <T extends  Runnable & Cloneable> T m2(T t){
        return t;
    }
    
    public static <T extends Number & Serializable & Runnable & Cloneable> T m3(T t){
        return t;
    }
    
    /*
     *
     * We cann't use super & implements 
     public static <T super Number> T m2(T t){
        return t;
    }
    public static <T implements Number> T m3(T t){
        return t;
    }*/
    /**
     * @param args
     */
    public static void main(String[] args) {

        m2(new Cat());
    }

}
