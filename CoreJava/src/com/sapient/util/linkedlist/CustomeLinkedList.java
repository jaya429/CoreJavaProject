package com.sapient.util.linkedlist;

public class CustomeLinkedList {

	Node head;
	int counter;


	public CustomeLinkedList() {
		super();
		this.head = new Node(null);
		counter =0;
	}

	public void add(Object elemnt){
		Node temp= new Node(elemnt);

		if(head == null){
			head = temp;
		}
		Node current = head;
		if(current!=null){
			while(current.getNext()!=null){
				current = current.getNext();
			}
		}
		current.setNext(temp);
		getIncrement();
	}

	public void add(Object element,int index){
		Node temp= new Node(element);
		Node current =head;
		if(current!=null){
			for(int i=0;i<index && current.getNext()!=null;i++){
				current=current.getNext();
			}
			temp.setNext(current.getNext());
			current.setNext(temp);
			getIncrement();
		}
	}

	public  Object get(int index){
		Node current =head;
		Object data=null;
		if(current!=null){
			for(int i=0;i<index && current.getNext()!=null;i++){
				current=current.getNext();
			}
			data = current.getData();
		}
		return data;
	}

	public Object remove(int index){
		Node current =head;
		Object data=null;
		if(current!=null){
			for(int i=0;i<index && current.getNext()!=null;i++){
				current=current.getNext();
			}
			data=current.getData();
			current.setNext(current.getNext().getNext());
		}
		getDecrement();
		return data;
	}

	private void getDecrement() {
		counter-=1;
	}

	private void getIncrement() {
		counter+=1;		
	}

	public int size(){
		return counter;
	}
	class Node{
		Object data;
		Node next;
		public Node(Object data) {
			super();
			this.data = data;
		}
		public Object getData() {
			return data;
		}
		public void setData(Object data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}

	}

	public static void main(String[] args) {
		CustomeLinkedList list=new CustomeLinkedList();
		list.add(10);
		list.add(20);
		list.add(70);
		System.out.println("Linked list size"+ list.size());
		System.out.println("Data at 2 nd position"+ list.get(2));
		System.out.println("remove data in the 1st"+ list.remove(1));
		
		
	}
}
