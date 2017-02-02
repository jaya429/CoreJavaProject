package com.svr.collection.map;

/**
 * @author Venkata Saripella
 *
 */
public class CustomMap<k,v> {
    
    private Integer size =16;
    private Node<k,v> bucketArray[] = new Node[size];
    
    
    class Node<k,v>{
        
        private k key;
        private v value;
        private Node<k,v> next;
        
        public Node(){
            
        }
        public Node(k key, v value){
            this.key   = key;
            this.value = value;
        }
        
        public k getKey() {
            return key;
        }
        public void setKey(k key) {
            this.key = key;
        }
        public v getValue() {
            return value;
        }
        public void setValue(v value) {
            this.value = value;
        }
        public Node<k, v> getNext() {
            return next;
        }
        public void setNext(Node<k, v> next) {
            this.next = next;
        }
        
    }
    
    /**
     * Used to put a key-value pair into the data structure.
     * @param key Key string that is used identify the key-value pair
     * @param value Value string in which the key string maps to.
     */
    public void put(String key, String value){
        /* Get the hash code */
        int hash = Math.abs(key.hashCode() % size);
        /* Create the Node to add to the linked list */
        Node<k,v> entry = new Node(key,value);
 
        /* Insert the node to the bucket array at the hash index */
        if(bucketArray[hash] == null){
            /* No collision detected. Insert the node. */
            bucketArray[hash] = entry;
        }else{
            /* Collision detected. We must place the node at the end of the linked list. */
            Node<k,v> current = bucketArray[hash];
            while(current.next != null){
                /* Check if the key already exists */
                if(current.getKey().equals(entry.getKey())){
                    /* Replace the keys value with the new one */
                    current.setValue(entry.getValue());
                    return;
                }
                current = current.next;
            }
            /* When the code gets here current.next == null */
            /* Insert the node */
            current.next = entry;
        }
    }
 
    /**
     * Returns the value that is mapped to the given key.
     * @param key The key string which is used to search for the value it
     *            is mapped to.
     * @return The value string
     */
    public v get(k key){
        /* Get the hash */
        int hash = Math.abs(key.hashCode() % size);
        /* Search for key in linked list */
        Node<k,v> node = bucketArray[hash];
        /* Traverse linked list */
        while(node != null){
            if(node.getKey().equals(key)){
                return node.getValue();
            }
            node = node.getNext();
        }
        /* Not found? then return null */
        return null;
    }

}
