package bubble;

public class BubbleSorter 
{
	private int[]		a;
	private long		nVisits;
	private long		nSwaps;
	
	
	public BubbleSorter(int[] a)
	{
		this.a = a; 
	}
	
	
	public void sort()
	{
		nVisits = 0;
		nSwaps = 0;
		int count = 0;
		for(int i = 1; i< a.length ; i++) {
			count = 0;
			for(int  j = a.length-1; j >=i; j--) {
				nVisits = nVisits+2;
				if(a[j-1] > a[j]) {
//					nVisits = nVisits+2;
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
					nSwaps++;
					count++;
				}
			}
			if(count == 0) {
				return;
			}
		}
	}
	
	
	public String toString()
	{
		String s = nVisits + " visits, " + nSwaps + " swaps\n{";
		for (int n: a)
			s += " " + n;
		s += " }";
		return s;
	}
	
	public long getNVisits()
	{
		return nVisits;
	}
	
	
	public long getNSwaps()
	{
		return nSwaps;
	}
	
	
	public int[] getArray()
	{
		return a;
	}
	
	
	
}
