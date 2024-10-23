package tournament;
//complete this class
import java.util.*;
//complete this class - 3.5 pts
public class StackLinkedList<T> extends MyLinkedList<T> implements Iterable<T>{ //your code
	
	public void push (T newData) {
		//your code
		prepend(newData);
	}
	
	
	public T pop() {
		//your code
		return removeAtHead();
	}
	
	public T peek() {
		//your code
		T val = removeAtHead();
		push(val);
		return val;
	}


	ArrayList<T> toArrayList(){
		//your code
		ArrayList<T> arr = new ArrayList<T>();
		while(peek() != null) {
			arr.add(pop());
		}
		for(int i = arr.size() -1 ; i>-1; i--) {
			push(arr.get(i));
		}
		return arr;
	}

	//your code
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return toArrayList().iterator();
	}


}
