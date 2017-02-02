/**
 * 
 */
package com.svr.serialization;

import java.io.Serializable;

/**
 * @author Venkata Saripella
 *
 */
public class Rat implements Serializable{

    int j = 20;

    @Override
    public String toString() {
        return "Rat [j=" + j + "]";
    }
    
}
