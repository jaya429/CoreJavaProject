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
import java.io.Serializable;

/**
 * @author Venkata Saripella
 *
 */
public class SerializableChild extends NonSerializableParent implements Serializable {

    Integer dogId;
    short   dogAge;
    String  dogName;

    public SerializableChild(){
        System.out.println("Dog constructor");
    }
    public Integer getDogId() {
        return dogId;
    }


    public void setDogId(Integer dogId) {
        this.dogId = dogId;
    }


    public short getDogAge() {
        return dogAge;
    }


    public void setDogAge(short dogAge) {
        this.dogAge = dogAge;
    }


    public String getDogName() {
        return dogName;
    }


    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public String toString() {
        return "Dog [dogId=" + dogId + ", dogAge=" + dogAge + ", dogName=" + dogName + ", toString()="
                + super.toString() + "]";
    }


    /**
     * @param args
     * @throws IOException 
     * @throws FileNotFoundException 
     * @throws ClassNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectOutputStream oos    = new ObjectOutputStream(new FileOutputStream("dog.ser"));
        SerializableChild             dog = new SerializableChild();
        dog.setAnimalAge(10);
        dog.setAnimalId(1);
        dog.setAnimalName("petty");
        dog.setDogAge((short)2);
        dog.setDogId(2);
        dog.setDogName("doberman");
        System.out.println("Before serialization dog object :: "+dog);
        oos.writeObject(dog);
        
        ObjectInputStream ois      = new ObjectInputStream(new FileInputStream("dog.ser"));
        SerializableChild               dog1      = (SerializableChild)ois.readObject();
        System.out.println("After deserialization dog object :: "+dog1);
    }

}
