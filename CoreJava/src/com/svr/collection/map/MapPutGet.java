/**
 * 
 */
package com.svr.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Venkata Saripella
 *
 */
public class MapPutGet {

    public void mapInternals1(){
        
        Map<Employee,String> maps = new HashMap<Employee,String>();
        
        Employee e1 = new Employee();
        e1.setId(1);
        Employee e2 = new Employee();
        e2.setId(1);
        maps.put(e1, "raju");
        maps.put(e2, "svr");
        System.out.println("Results :: "+maps);
        System.out.println("Employee 1 data "+maps.get(e1));
        Employee e3 = new Employee();
        System.out.println("If hashcode not exist of key return null ");
        System.out.println(maps.get(e3));
    }
    public void mapInternals2(){
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();
        s1.setName("Aa");
        s2.setName("BB");
        s3.setName("AaAa");
        s4.setName("BBBB");
        s5.setName("AaBB");
        s6.setName("BBAa");
        
        Map<Student,String> students = new HashMap<Student,String>();
        System.out.println("s3 is adding");
        students.put(s3,"s3 object");
        
        System.out.println("s4 is adding");
        students.put(s4,"s4 object");
        
        System.out.println("s2 is adding");
        students.put(s2, "s2 object");
        
        System.out.println("s1 is adding");
        students.put(s1, "s1 object");
        
        System.out.println("s5 is adding");
        students.put(s5,"s5 object");
        
        System.out.println("s6 is adding");
        students.put(s6,"s6 object");
        
        System.out.println("get Student s3");
        System.out.println("Student s3  value :: "+students.get(s3));

        System.out.println("get Student s1");
        System.out.println("Student s1  value :: "+students.get(s1));
        
        System.out.println("get Student s6");
        System.out.println("Student s6  value :: "+students.get(s6));
        
        System.out.println("get Student s4");
        System.out.println("Student s4  value :: "+students.get(s4));
        
        System.out.println("Results :: "+students);
    }
    
    public static void main(String[] args) {

        MapPutGet maptest = new MapPutGet();
//        maptest.mapInternals1();
            
        maptest.mapInternals2();
    }

}
