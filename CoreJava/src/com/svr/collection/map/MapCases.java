package com.svr.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Venkata Saripella
 *
 */
public class MapCases {

    /**
     * @param args
     */
    public static void main(String[] args) {

        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();
        Employee e6 = new Employee();
        
        e1.setId(1);
        e2.setId(2);
        e3.setId(3);
        e4.setId(4);
        e5.setId(5);
        e6.setId(6);
        
        Map<Employee, Integer> maps = new HashMap<Employee,Integer>();
        maps.put(e1, e1.getId());
        maps.put(e2, e2.getId());
        maps.put(e3, e3.getId());
        maps.put(e4, e4.getId());
        maps.put(e5, e5.getId());
        maps.put(e6, e6.getId());

        System.out.println("Map size is :: "+maps.size()); 
        
        System.out.println("Get e6 objcet :: "+maps.get(e6));
        
        /**
         * public V get(Object key) {
            Node<K,V> e;
            return (e = getNode(hash(key), key)) == null ? null : e.value;
           }
         */
        /**
         * static final int hash(Object key) {
            int h;
            return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        }*/
        /**
         *  The following line gives NullPointerException when we the key.hashCode() method gives null as hashcode
         *   
         */
        
        System.out.println("Get new object:: "+maps.get(new Employee()));
        
        System.out.println("Contains new objects :: "+maps.containsKey(new Employee()));   
        
        System.out.println("Contains e6 object :: "+maps.containsKey(e6));
        
    }
}
