/**
 * 
 */
package com.svr.oops;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author Venkata Saripella
 *
 */
public class StaticFlow {
    static int j=func1();
    static int i=10;
    static int func1(){
        return i;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        PrintStream out;
        try {
            out = new PrintStream(new FileOutputStream("D:/workspace/console.txt"));
            System.setOut(out);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("i="+i);
        System.out.println("j="+j);
    }

}
