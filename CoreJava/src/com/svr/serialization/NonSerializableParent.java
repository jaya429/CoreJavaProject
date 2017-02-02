/**
 * 
 */
package com.svr.serialization;

/**
 * @author Venkata Saripella
 *
 */
public class NonSerializableParent {

    private int animalId;
    private String animalName;
    private Integer animalAge;
    
    public NonSerializableParent(){
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
