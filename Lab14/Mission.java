package space;

import java.util.ArrayList;


public class Mission implements Comparable<Mission>
{
	private String			destination;
	private float			cost;
	
	
	public Mission(String destination, Float cost)
	{
		this.destination = destination;
		this.cost = cost;
	}
	
	
	public String getDestination()
	{
		return destination;
	}
	
	
	public float getCost()
	{
		return cost;
	}


	// Compare by cost, then by destination.
	public int compareTo(Mission that) 
	{ 		
		if(this.cost == that.cost) {
			return this.destination.compareTo(that.destination);
		}else if (this.cost < that.cost){
			return -1;
		}else {
			return 1;
		}

	}
	
	
	// Let compareTo() do the work. This method should just be 1 line.
	public boolean equals(Object x)
	{
		return this.compareTo((Mission) x)== 0;
	}
	
	
	// Return the destination’s hash code.
	public int hashCode()
	{
		return (int) (this.destination.hashCode() + this.cost);
		
	}
	
	
	public String toString()
	{
		return "Mission to " + destination + " will cost " + cost;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Equals");
		Mission a = new Mission("hello",  120.0f);
		System.out.println(a.hashCode());
		Mission b = new Mission("hello", 120.0f);
		System.out.println(b.hashCode());
		System.out.println(a.compareTo(b));
		
		System.out.println("Greater");
		Mission a1 = new Mission("blabal", 150.0f);
		System.out.println(a1.hashCode());
		Mission b1 = new Mission("closn", 120.0f);
		System.out.println(b1.hashCode());
		System.out.println(a1.compareTo(b1));
		
		System.out.println("Less");
		Mission a2 = new Mission("blkjfdnjabal", 10.0f);
		System.out.println(a2.hashCode());
		Mission b2 = new Mission("clojkfnsn", 120.0f);
		System.out.println(b2.hashCode());
		System.out.println(a2.compareTo(b2));
		
	}

}
