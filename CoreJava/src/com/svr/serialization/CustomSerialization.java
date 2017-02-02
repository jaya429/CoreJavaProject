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
public class CustomSerialization implements Serializable{

    private static final long serialVersionUID = 631305119839881538L;
    
    private           String     userName ;
    private transient String     password ;
    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    private void writeObject(ObjectOutputStream oos)throws Exception{
        System.out.println("writeObject invoked");
        oos.defaultWriteObject();
        String pass = "123"+password;
        oos.writeObject(pass);
    }
    
    private void readObject(ObjectInputStream ois)throws Exception{
        System.out.println("readObject invoked");
        ois.defaultReadObject();
        String     pass     = (String)ois.readObject();
                   password = pass.substring(3); 
    }
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        CustomSerialization customSerialization = new CustomSerialization();
        if(customSerialization instanceof Serializable){
            System.out.println("type is serializable");
        }
        customSerialization.setUserName("svr");
        customSerialization.setPassword("root");
        System.out.println("Before serialization :: "+customSerialization.getUserName() +"  "+customSerialization.getPassword());
        ObjectOutputStream  oos                 = new ObjectOutputStream(new FileOutputStream("customserialization.scr"));
        oos.writeObject(customSerialization);
        ObjectInputStream   ois                 = new ObjectInputStream(new FileInputStream("customserialization.scr"));
        CustomSerialization customSerialization2= (CustomSerialization)ois.readObject();
        System.out.println(customSerialization2.getUserName() +"  "+customSerialization2.getPassword());
        oos.close();
        ois.close();
    }
}
