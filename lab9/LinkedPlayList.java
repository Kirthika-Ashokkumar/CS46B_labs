package playlist;

public class LinkedPlayList {
	
	static class Node {
		private Song song;
		private Node next;
		
		public Node(Song song,Node next) {
			this.song = song;
			this.next = next;
		}
		
		public Song getSong() {
			return song;
		}
		
		public Node getNode() {
			return next;
		}

	}
	
	private Node head;
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public int size() {
		int size=0;
		Node current = head;
		while(current!=null) {
			size++;
			current = current.next;
		}
		return size;
	}
	
	public void insertAtHead(Song song) {
		Node node = new Node(song,null);//new head points to old head
		node.next = head;
		head = node;	
	}
	
	public boolean equals(Object o) {
		LinkedPlayList pl = (LinkedPlayList)o;
		if(pl.size() != size()) {return false;}
		Node current1 = pl.head;
		Node current2 = head;
		while(current1!=null) {
			if(!current1.song.equals(current2.song))
				return false;
			current1 = current1.next;
			current2 = current2.next;
		}
		return true;
	}
	
	public int hashCode() {
		int hc = 0;
		Node current = head;
		while(current!=null) {
			hc = hc + (current.getSong()).hashCode();
		}
		return hc;
	}
    
    public String toString() {
        String s = "";
        Node current=head;
        while(current!=null) {
            s = s + current.song;
            current = current.next;
            s = s+"->";
        }
        return s;
    }
	
	//****IMPLEMENT THIS*******//
	//Returns true if the LinkedPlayList contains a Node with Song s
	//Returns false otherwise
	public boolean contains(Song s) {
		Node current = head;
		while(current != null) {
			if(current.getSong().equals(s)) {
				return true;
			}
			current = current.getNode();
		}
		return false;
	}
	
	//****IMPLEMENT THIS*******//
	//Note that there is no tail instance variable
	//You should add a new Node containing Song, song 
	//to the end of the PlayList
	public void append(Song song) {
		Node newNode = new Node(song, null);
		if(!isEmpty()) {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}else {
			head = newNode;
		}
	
	}
	
	//****IMPLEMENT THIS*******//
	//Returns that Node at the specified index in the List. 
	//Remember the first element in the list has an index of 0
	//Throws an indexOutOfBoundsException if the index is less than 0
	// or greater than or equal to the size of the list
	public Node get(int index) {
		if(index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("index is out of bound");
		}
		Node retNode = head;
		
		for(int i = 0; i < index; i++) {
			retNode = retNode.getNode();
		}
		return retNode;
	}
	
	//****IMPLEMENT THIS*******//
	//Adds a new Node containing the Song song to the LinkedPlayList
	//at the current location. If I want to add a Song at the index 1,
	//the node at index 0 should be updated to point at the new Node and 
	//the remaining nodes should shift down one. This is very similar to
	//insertAt method we completed in class
	//If the index is invalid, throw an IndexOutOfBoundsException
	//Think about how to use the get method to implement the add method
	public void add(int loc,Song song) {
		if(loc < 0 || loc > size()) {
			throw new IndexOutOfBoundsException("index is out of bound");
		}
		
		if(loc == 0) {
			insertAtHead(song);
		}else {
			Node current = get(loc-1);
			Node newNode = new Node(song, current.next);
			current.next = newNode;
		}
	
	}
	
	//****IMPLEMENT THIS*******//
	//remove the first node that contains the specified song and return true
	//if the list is empty throw an illegal argument exception
	//if the list doesn't contain the song, return false	
	public boolean removeOne(Song song) {
		if(isEmpty()) {
			throw new IllegalArgumentException("list is empty");
		}
		Node current = head;
		Node previous  = null;
		
		
		while(current != null) {

			if(current.getSong().equals(song)) {
				if(previous == null){
					head = current.next;
				}else {
					previous.next = current.next;
				}
				return true;
			}
			previous= current;
			current = current.next;
		}
        return false;
	}
	
	//****IMPLEMENT THIS*******//
	//remove the all the nodes that contain the specified song and return true;
	//if the list is empty throw an illegal argument exception
	//if the list doesn't contain the song, 
	//then print a useful message to the console
	public boolean removeAll(Song song) {
		return false;
	}
	
    //****IMPLEMENT THIS*******//
    //Look for the node in the list that contains dataBefore
    //Create a new node that contains data and insert it immediately after the dataBefore node
    //For example if I call insertAfter(2,7) with the list [1,2,3]
    //the new list would be [1,2,7,3]
    //Returns true if the method successfully inserts the song and false otherwise
    public boolean insertAfter(Song prevSong, Song songToAdd) {
      return false;
        }
        
}

