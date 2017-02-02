/**
 * 
 */
package com.svr.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Venkata Saripella
 *
 */
public class TrickyEX {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<? extends Number> list1 = new ArrayList<Integer>();
    }

    public  void  m(List<? > list){
        list.add(null);
    }
    
    public  void  m1(List<? extends Number> list){
        list.add(null);
    }
    
    public  void  m2(List<? super String> list){
        list.add(null);
        list.add("");
    }
    
    public  void  m3(List<String > list){
        list.add("");
        list.add(null);
    }
}
