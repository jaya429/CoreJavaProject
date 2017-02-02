/**
 * 
 */
package com.svr.strings;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Venkata Saripella
 *
 */
public class FindDuplicatesInString {

    /**
     * @param args
     * @throws IllegalAccessException 
     * @throws IllegalArgumentException 
     * @throws SecurityException 
     * @throws NoSuchFieldException 
     */
    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

        findDuplicatesInString("venkata rama raju");
        findDuplicatesInString1("venkata rama raju");
        findDuplicatesInString2("venkata rama raju");
        findDuplicatesInString3("venkata rama raju");
        findDuplicatesInString4("venkata rama raju");
    }

    public static void findDuplicatesInString(String name){
        /**
         * 
         *  First we need to construct char array
         */
        char[]                  chars     = name.toCharArray();
        Map<Character,Integer>  charCount = new LinkedHashMap<Character,Integer>();
        for(char c : chars){
            charCount.put(c, charCount.containsKey(c) ? charCount.get(c)+1 : 1);
        }
        charCount.forEach((k,v )->{
            if(v>1){
                System.out.println(k +"- "+v);
            }
        });
        System.out.println("-----------------------------");
    }
    
    public static void findDuplicatesInString1(String name){
        /**
         * 
         *  First we need to construct char array
         */
        String[]                chars     = name.split("");
        Map<String,Integer>  charCount = new LinkedHashMap<String,Integer>();
        for(String c : chars){
            charCount.put(c, charCount.containsKey(c) ? charCount.get(c)+1 : 1);
        }
        charCount.forEach((k,v )->{
            if(v>1){
                System.out.println(k +"- "+v);
            }
        });
        System.out.println("-----------------------------");
    }
    
 
    public static void findDuplicatesInString2(String name){
        /**
         * 
         *  First we need to construct char array
         */
        Integer                  length    = name.length();
        char[]                   chars     = new char[length];
        Map<Character,Integer>   charCount = new LinkedHashMap<Character,Integer>();
        for(int i=0; i<length; i++){
            chars[i] = name.charAt(i);
        }
        for(char c : chars){
            charCount.put(c, charCount.containsKey(c) ? charCount.get(c)+1 : 1);
        }
        charCount.forEach((k,v )->{
            if(v>1){
                System.out.println(k +"- "+v);
            }
        });
        System.out.println("-----------------------------");
    }
    
    public static void findDuplicatesInString3(String myString) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{

         // Use reflection to get at the char array field
         Field value = String.class.getDeclaredField("value");
         // It's private so we need to explicitly make it accessible.
         value.setAccessible(true);
         char[]                   chars     = (char[])value.get(myString);
         Map<Character,Integer>   charCount = new LinkedHashMap<Character,Integer>();
         for(char c : chars){
             charCount.put(c, charCount.containsKey(c) ? charCount.get(c)+1 : 1);
         }
         charCount.forEach((k,v )->{
             if(v>1){
                 System.out.println(k +"- "+v);
             }
         });
         System.out.println("-----------------------------");
    }
    
    public static void findDuplicatesInString4(String myString) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{

        // Use reflection to get at the char array field
        Field value = String.class.getDeclaredField("value");
        // It's private so we need to explicitly make it accessible.
        value.setAccessible(true);
        char[]                   chars      = (char[])value.get(myString);
        List<Character>          elements   = new ArrayList<Character>();
        List<Character>          duplicates = new ArrayList<Character>();
        for(char c : chars){
            if(elements.contains(c)){
                duplicates.add(c);
            }else{
                elements.add(c);
            }
        }
        duplicates.forEach((v )->{
                System.out.println(v);
        });
        System.out.println("-----------------------------");
   }
   
}
