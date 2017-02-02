/**
 * 
 */
package com.svr.oops;

/**
 * @author Venkata Saripella
 *
 */
public class VariableOverride {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Parent p = new Child();
        System.out.println("calling parent class variable  p.a = "+p.a);
        System.out.println("calling parent class   static  p.s = "+p.s);
//        System.out.println(p.b);     CE
        
    }

}
