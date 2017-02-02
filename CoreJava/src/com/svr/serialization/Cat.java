/**
 * 
 */
package com.svr.serialization;

import java.io.Serializable;

/**
 * @author Venkata Saripella
 *
 */
public class Cat implements Serializable{

    private Rat r = new Rat();

    @Override
    public String toString() {
        return "Cat [r=" + r + "]";
    }
    
 }
