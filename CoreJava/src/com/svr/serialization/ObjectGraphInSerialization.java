/**
 * 
 */
package com.svr.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Venkata Saripella
 *
 */
public class ObjectGraphInSerialization {

    /**
     * @param args
     * @throws IOException 
     * @throws FileNotFoundException 
     * @throws ClassNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        Dog d = new Dog();
        ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("abc.scr"));
        oos.writeObject(d);
        ObjectInputStream  ois  = new ObjectInputStream(new FileInputStream("abc.scr"));
        Dog                d1   = (Dog) ois.readObject();
        System.out.println(d1);
        
    }

}
