package com.sapient.lang.arraylist;

import java.util.Arrays;

public class CustomeArrayList {

	private static final int INITIAL_CAPCITY =10;
	int size= 0;
	Object[] data=new Object[INITIAL_CAPCITY];

	public void add(Object element){
		ensureCapacity();
		data[size++] = element;
	}

	private void ensureCapacity() {
		if(size==INITIAL_CAPCITY){
			int newCapacity = data.length * 2;
			data = Arrays.copyOf(data, newCapacity);

		}

	}

	public Object remove(int index){
		if ( index <0 || index>= size) {  //if index is negative or greater than size of size, we throw Exception.
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}

		Object removedElement=data[index];
		for(int i=index;i<size;i++){
			data[i]=data[i+1];
		}
		size--;   //reduce size of ArrayListCustom after removal of element.

		return removedElement;
	}


	public Object get(int index){
		if(index>size){
			throw new ArrayIndexOutOfBoundsException();
		}

		Object element = data[index];
		return element;
	}


}
