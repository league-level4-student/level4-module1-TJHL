package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	T[] inputArray;
	
	public ArrayList() {
		
		inputArray = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return inputArray[loc];
	}
	
	public void add(T val) {
		
		T[] tempAdd = (T[])new Object[inputArray.length+1];
		tempAdd[tempAdd.length-1]=val;
		for (int i = 0; i < inputArray.length; i++) {
			tempAdd[i]=inputArray[i];
		}
		inputArray = tempAdd;
		
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
		T[] tempInsert = (T[])new Object[inputArray.length+1];
		for (int i = 0; i < loc; i++) {
			tempInsert[i]=inputArray[i];
		}
		
			tempInsert[loc]= val;
			
		for (int i = loc+1; i < tempInsert.length; i++) {
			tempInsert[i]=inputArray[i-1];
		}
		
		inputArray =tempInsert;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {

		inputArray[loc]=val;
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
		T[] tempRemove = (T[])new Object [inputArray.length-1];
		
		for (int i = 0; i < loc; i++) {
			tempRemove[i]=inputArray[i];
		}
		
		for (int i = loc; i < tempRemove.length; i++) {
			tempRemove[i] = inputArray[i];
		}
		inputArray = tempRemove;
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
	
	public int size() {
		return 0;
	}
}