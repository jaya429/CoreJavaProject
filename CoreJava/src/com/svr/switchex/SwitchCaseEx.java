/**
 * 
 */
package com.svr.switchex;

/**
 * @author Venkata Saripella
 *
 */
public class SwitchCaseEx {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int val = 6;
        switch(val){
        case 1:
            System.out.println("1");
        default :
            System.out.println("default");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
        }
    }

}