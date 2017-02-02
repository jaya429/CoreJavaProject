/**
 * 
 */
package com.svr.exceptionhandling;

import java.io.FileNotFoundException;

/**
 * @author Venkata Saripella
 *
 */
public class ThrowEx {

    /**
     * @param args
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException {

        throw new FileNotFoundException();
    }

}
