package com.svr.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Venkata Saripella
 *
 */
public class RemoveDuplicateInList {

/**
* @param args
*/
        static List<String> wordDulicate ;
        static List<String> nonDupList;
        public static void main(String[] args) {
        /*
         * Remove list of all elements using removeAll method      
         */
           
        wordDulicate = getDuplicateList();
        System.out.println("Duplicate List before removeAll(Collection c):: "+wordDulicate);
        wordDulicate.removeAll(wordDulicate);

        System.out.println("Duplicate List is Empty After removeAll(Collection c) , size -> "+wordDulicate);
         
        /*
         * Remove list elements with indexed for loop
         * 
         * 
         */
       
        wordDulicate = getDuplicateList();
               
        System.out.println("Duplicate List before remove(Object obj):: "+wordDulicate);       
               
        for(int i=0; i <  wordDulicate.size(); i++){
               
        wordDulicate.remove(i); 
               
        i = -1;
               
        }
               
        System.out.println("Removed all List elements with indexed based for loop and remove(Object obj) :: "+wordDulicate);
        /*
         * Remove elements with enhanced for loop
         *
         */
       
        wordDulicate = getDuplicateList();
        System.out.println("Original list before remove with foreach loop ::"+wordDulicate);
        try {
               
        for(String name :wordDulicate){
               
        wordDulicate.remove(name);        //java.util.ConcurrentModificationException
               
        }
        } catch (Exception e) {
        System.out.println("can't remove list of ele with foreach loop "+e);
        }
       
        System.out.println("Unable to remove List elements with enhanced for loop :: "+wordDulicate);
        

        /**
         * Remove elements from list with iterator
         * 
         */
        
        wordDulicate                       = getDuplicateList();
        System.out.println("Before remove ele from list with iterator :: "+wordDulicate);
        Iterator<String> duplicateIterator = wordDulicate.iterator();
        while(duplicateIterator.hasNext())
        {
            duplicateIterator.next();
            duplicateIterator.remove();   // If you comment this above line we are getting java.lang.IllegalStateException
        }
        System.out.println("Removed List with iterator:: "+wordDulicate);
        
        
        /**
         * Remove elements from list with Listiterator
         * 
         */
        
        wordDulicate                           = getDuplicateList();
        System.out.println("Before remove ele from list with listIterator :: "+wordDulicate);
        ListIterator<String> duplicateListIter = wordDulicate.listIterator();
        while(duplicateListIter.hasNext())
        {
         duplicateListIter.next();
         duplicateListIter.remove(); // If you comment this above line we are getting java.lang.IllegalStateException
        }
        System.out.println("Removed List with ListIterator :: "+wordDulicate);
        
        
        /*
         *     Remove duplicates in list with Iterator
         *     
         */
       nonDupList   = new ArrayList<String>();
       wordDulicate = getDuplicateList();
       System.out.println("Duplicate list before remove:: "+wordDulicate);
       Iterator<String> dupIter = wordDulicate.iterator();
       while(dupIter.hasNext())
       {
       String dupWord = dupIter.next();
       if(nonDupList.contains(dupWord))
       {
           dupIter.remove();
       }else
       {
           nonDupList.add(dupWord);
       }
       }
       System.out.println("Duplicate list after remove:: "+wordDulicate);
       System.out.println("Removed duplicates in list with iterator and new List :: "+nonDupList);
       
        /*
         *    Remove duplicates in list with ListIterator
         *    
         */
       nonDupList   = new ArrayList<String>();
       wordDulicate = getDuplicateList();
       System.out.println("Duplicate list before remove:: "+wordDulicate);
       ListIterator<String> dupListIter = wordDulicate.listIterator();
       while(dupListIter.hasNext())
       {
       String dupWord = dupListIter.next();
       if(nonDupList.contains(dupWord))
       {
       
           dupListIter.remove();
       }else
       {
           nonDupList.add(dupWord);
       }
       }
       
       System.out.println("Duplicate list after remove:: "+wordDulicate);
       System.out.println("Removed duplicates in list with List Iterator and new List :: "+nonDupList);
       
       /**
        * Remove duplicates with  with foreach loop extralist
        */
       nonDupList   = new ArrayList<String>();
       wordDulicate = getDuplicateList();
       System.out.println("Duplicate list before remove:: "+wordDulicate);
       for(String dupWord : wordDulicate){
           if(!nonDupList.contains(dupWord))
               nonDupList.add(dupWord);
       }
       System.out.println("Duplicate list after remove:: "+wordDulicate);
       System.out.println("Result with foreach:: "+nonDupList);   
       
       wordDulicate = getDuplicateList();
       System.out.println("orginal :: "+wordDulicate);
       ListIterator<String> itr  = wordDulicate.listIterator();
//       Collections.sort(wordDulicate);           //because this call we are getting java.util.ConcurrentModificationException while invoking iterator.next()
//       System.out.println("sort "+wordDulicate);
       Collections.reverse(wordDulicate);  
       System.out.println("reverse "+wordDulicate);
       while(itr.hasNext()){
           System.out.println(itr.next()); 
           itr.remove(); 
           itr.add("a"); 
       }
       System.out.println("final list :: "+wordDulicate);
      }
        

        public static List<String>  getDuplicateList(){
        List<String> wordDulicate = new ArrayList<String>();

        wordDulicate.add("Tom");
        wordDulicate.add("Anup");
        wordDulicate.add("Jones");
        wordDulicate.add("Sam");
        wordDulicate.add("Jamie");
        wordDulicate.add("Robie");
        wordDulicate.add("Helen");
        wordDulicate.add("Tom");
        wordDulicate.add("Troy");
        wordDulicate.add("Mika");
        wordDulicate.add("Tom");
        wordDulicate.add("Zama");
        return wordDulicate;
}
}
