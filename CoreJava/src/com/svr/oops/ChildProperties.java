/**
 * 
 */
package com.svr.oops;

/**
 * @author Venkata Saripella
 *
 */
public class ChildProperties extends ParentProperties {

    int i;
    
    public void foo(){
        super.i = 10;
        System.out.println(super.i);
        System.out.println(j);
        System.out.println(i);
    }
    
    public static void main(String... strings){
        ChildProperties ch = new  ChildProperties();
        ch.i =1;
        ch.j =2;
        ch.foo();
    }
}
