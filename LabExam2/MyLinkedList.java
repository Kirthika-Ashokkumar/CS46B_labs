package tournament;
import java.util.*;
//No need to edit this class 
public class MyLinkedList<T> {
	
	class Node<T> {
		T data;
		Node<T> next;
		
		Node (T data, Node<T> next){
			this.data = data;
			this.next = next;
		}
	}
	
	Node<T> head;
	Node<T> tail;
	
	public MyLinkedList (){
		head=tail=null;
	}
	
	public void append(T newData) {
		Node<T> newNode = new Node<T>(newData, null);
		
		if (head==null) {
			head = tail = newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
		
	}
	
	public void prepend(T newData) {
		Node<T> newNode = new Node<T>(newData, null);
		
		if (head==null) {
			head = tail = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		
	}
	
	public T removeAtHead(){
		
		if ( head==null)//list empty
			return null;
		
		
		T removedData = head.data;
		
		if ( head==tail) //list has only one node
			head = tail = null;
		
		else
			head = head.next;//list has more than one node
		
		
		return removedData;
		
	}
	

}
