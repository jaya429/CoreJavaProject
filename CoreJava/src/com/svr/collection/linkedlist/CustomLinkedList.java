/**
 * 
 */
package com.svr.collection.linkedlist;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @author Venkata Saripella
 *
 */
public class CustomLinkedList<E> implements Serializable, Cloneable{

    
    private static final long serialVersionUID = 769491310967544435L;
    
        transient int size = 0;
        protected transient int modCount = 0;
        
       /**
        * Pointer to first node.
        * Invariant: (first == null && last == null) ||
        *            (first.prev == null && first.item != null)
        */
       transient Node<E> first;
   
       /**
        * Pointer to last node.
        * Invariant: (first == null && last == null) ||
        *            (last.next == null && last.item != null)
        */
       transient Node<E> last;
  
      /**
       * Constructs an empty list.
       */
      public CustomLinkedList() {
      }

      private static class Node<E> {
          E item;
          Node<E> next;
          Node<E> prev;

          Node(Node<E> prev, E element, Node<E> next) {
              this.item = element;
              this.next = next;
              this.prev = prev;
          }
      }
      
      /**
       * Appends the specified element to the end of this list.
       *
       * <p>This method is equivalent to {@link #addLast}.
       *
       * @param e element to be appended to this list
       * @return {@code true} (as specified by {@link Collection#add})
       */
      public boolean add(E e) {
          linkLast(e);
          return true;
      }
      
      /**
       * Links e as last element.
       */
      void linkLast(E e) {
          final Node<E> l = last;
          final Node<E> newNode = new Node<>(l, e, null);
          last = newNode;
          if (l == null)
              first = newNode;
          else
              l.next = newNode;
          size++;
          modCount++;
      }
      
      public static void main(String[] args) {

          LinkedList<Integer> ll = new LinkedList<Integer>();
          ll.add(1);
          ll.add(2);
          ll.add(3);
      }
}
