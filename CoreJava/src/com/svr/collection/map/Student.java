/**
 * 
 */
package com.svr.collection.map;

/**
 * @author Venkata Saripella
 *
 */
public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        System.out.println("Student hashcode invoked :: "+result);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Student equals method invoked");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }

    
}
