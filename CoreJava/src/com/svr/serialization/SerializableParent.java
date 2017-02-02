/**
 * 
 */
package com.svr.serialization;

import java.io.Serializable;

/**
 * @author Venkata Saripella
 *
 */
public class SerializableParent implements Serializable {

    private int animalId;
    private String animalName;
    private Integer animalAge;
    
    public SerializableParent(){
        System.out.println("Animal constructor ");
    }
    public int getAnimalId() {
        return animalId;
    }
    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }
    public String getAnimalName() {
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
    public Integer getAnimalAge() {
        return animalAge;
    }
    public void setAnimalAge(Integer animalAge) {
        this.animalAge = animalAge;
    }
    @Override
    public String toString() {
        return "Animal [animalId=" + animalId + ", animalName=" + animalName + ", animalAge=" + animalAge + "]";
    }
    
    
    
}
