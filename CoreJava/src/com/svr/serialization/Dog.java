/**
 * 
 */
package com.svr.serialization;

import java.io.Serializable;

/**
 * @author Venkata Saripella
 *
 */
public class Dog implements Serializable{

    private Cat cat = new Cat();

    @Override
    public String toString() {
        return "Dog [cat=" + cat + "]";
    }
    
}
