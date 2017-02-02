/**
 * 
 */
package com.svr.oops;

/**
 * @author Venkata Saripella
 *
 */
public class SameConstantsTypes implements Interface1, Interface2{
     static int b=23;
     static int a =99;
    public SameConstantsTypes(){
        System.out.println("comming from interface1 :: "+x);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        SameConstantsTypes sameConstantsTypes = new SameConstantsTypes();
        System.out.println("Variable 'a'  comming form interface1 & 2 but considered only current class 'a' value :: "+a);
        System.out.println("Variable 'b'  comming form inteface1 but considered the current class 'b' value :: "+b);   // 0
        System.out.println("comming from interface2 "+c);
    }

}
