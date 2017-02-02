/**
 * 
 */
package com.svr.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Venkata Saripella
 *
 */
public class MapIterators {

        /**
        * @param args
        */
        public static void main(String[] args) {

        Map<Integer, Map<String,Integer>> map = new HashMap<Integer, Map<String,Integer>>();
        Map<String, Integer> map1 = new HashMap<String,Integer>();
        map1.put("venkat", 1);
        Map<String, Integer> map2 = new HashMap<String,Integer>();
        map2.put("venkat s", 2);
        Map<String, Integer> map3 = new HashMap<String,Integer>();
        map3.put("venkat rama raju", 222);
        map.put(1, map1);
        map.put(2, map2);
        map.put(3, map3);
        System.out.println("-------------------------------------------------------");
        for(Map.Entry<Integer, Map<String,Integer>> entry : map.entrySet()){
        System.out.println("Key : " + entry.getKey() + " Value :" + entry.getValue());
        for(Map.Entry<String, Integer> subEntry : entry.getValue().entrySet()){
        System.out.println("Key : " + subEntry.getKey() + " Value :" + subEntry.getValue());
        }
        }
        System.out.println("-------------------------------------------------------");
        for(Integer key : map.keySet()){
        System.out.println("Key : " + key+ " Value :" + map.get(key));
        Map<String,Integer> sub =  map.get(key);
        for(String subkey : sub.keySet()){
        System.out.println("Key : " + subkey+ " Value :" +  sub.get(subkey));
        }
        }
        System.out.println("--------------------------------------------------------");
        Iterator<Map.Entry<Integer, Map<String,Integer>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
        Map.Entry<Integer, Map<String,Integer>> entry =  iterator.next();
        System.out.println("Key : " + entry.getKey() + " Value :" + entry.getValue());
        Iterator<Map.Entry<String,Integer>> subIterator = entry.getValue().entrySet().iterator();
        while(subIterator.hasNext()){
        Map.Entry<String,Integer> subEntry = subIterator.next();
        System.out.println("Key : " + subEntry.getKey() + " Value :" + subEntry.getValue());
        }
        }
        System.out.println("--------------------------------------------------------");
        Iterator<Integer> keySetiterator = map.keySet().iterator();
        while (keySetiterator.hasNext()) {
        Integer key =  keySetiterator.next();
        System.out.println("Key : " + key + " Value :" + map.get(key));
        Map<String,Integer> sub =  map.get(key);
        Iterator<String> subKeyIterator =  sub.keySet().iterator();
        while (subKeyIterator.hasNext()) {
        String subKey =  subKeyIterator.next();
        System.out.println("Key : " + subKey + " Value :" + sub.get(subKey));
        }
        }
        System.out.println("--------------------------------------------------------");
        map.forEach((key,value)->{
        System.out.println("Key : " + key + " Value : " + value);
        value.forEach((k,v)-> System.out.println("Key : " + k + " Value : " + v));
        });
        }

 }
