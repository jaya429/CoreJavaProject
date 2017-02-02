package com.svr.logical;

/**
 * @author Venkata Saripella
 *
 */
public class ReverseNumber {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Integer      num   = 2643;
       /* Integer      len   = num.toString().length();
        Integer[]    res   = new Integer[len];
        Integer      index =  0;*/
        String s = "";
        while(num > 0){
//            res[index++] = num%10;
            s            += num%10;
            num          /= 10;
        }
        System.out.println(s);
//        System.out.println(Arrays.toString(res));
    }

}
