/**
 * 
 */
package com.svr.strings;

/**
 * @author Venkata Saripella
 *
 */
public class SubString {

    /**
     * 
     * @return substring form zero to -1
     */
    public static String getSubString(String stringValue){
        return stringValue.substring(2,1);
    }
    public static void main(String[] args) {

        System.out.println(SubString.getSubString("rama"));
    }

}
