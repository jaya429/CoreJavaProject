/**
 * 
 */
package com.svr.strings;

/**
 * @author Venkata Saripella
 *
 */
public class ReverseRecursively {

    public static String reverseRecursively(String str) {
//        System.out.println(str);

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }

    public static void main(String[] args) {

//        System.out.println(ReverseRecursively.reverseRecursively("kasi"));
        String rev = ReverseRecursively.reverseRecursively("kasi");
        System.out.println(rev);
//        System.out.println(/*2306996*/1&15);
    }
}
