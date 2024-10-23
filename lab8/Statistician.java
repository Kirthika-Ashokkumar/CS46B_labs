package bubble;

import static org.junit.Assert.assertArrayEquals;

import java.util.*;


public class Statistician 
{
	private final static int N_REPETITIONS = 1000;
	
	
	//returns a array of random integers with values between -maxValue and maxValue
	private static int[] buildRandom(int length, int maxValue)
	{
		int[] array = new int[length];
		for (int i=0; i<length; i++)
			array[i] = (int)(Math.random()*(maxValue + 1));
		return array;
	}
	
	private static boolean isSorted(int[] a) {
		for(int i=0;i<a.length-2;i++) {
			if(a[i]>a[i+1]) {return false;}
		}
		return true;
	}
	
	private static void getStats(int arrayLength)
	{
		ArrayList<Long> visitCounts = new ArrayList<>();
		ArrayList<Long> swapCounts = new ArrayList<>();
		
		for (int i=0; i<N_REPETITIONS; i++)
		{
			int[] array = buildRandom(arrayLength, arrayLength*100);
			BubbleSorter sorter = new BubbleSorter(array);
			int[] sortedArr = array.clone();
			sorter.sort();
			assert(isSorted(sorter.getArray())): "Failed array noe sorted";
			visitCounts.add(sorter.getNVisits());
			swapCounts.add(sorter.getNSwaps());
			// Assert that the sorter sorted correctly.
			// Append # visits and # swaps to the array lists.
			Arrays.sort(sortedArr);
			
		}
		System.out.println("min: "+ getMin(visitCounts)+
						" max: "+ getMax(visitCounts)+ 
						" avg: "+getAvg(visitCounts));
		System.out.println("min: "+ getMin(swapCounts)+
				" max: "+ getMax(swapCounts)+ 
				" avg: "+getAvg(swapCounts));
		// Compute and print min/average/max number of visits.
		// Compute and print min/average/max number of swaps.

	}
	
	public static long getMin(ArrayList<Long> a) {
		long min = a.get(0);
		for(long i: a) {
			if(i < min) {
				min = i;
			}
		}
		return min;
	}
	
	public static long getMax(ArrayList<Long> a) {
		long max = a.get(0);
		for(long i: a) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
	
	public static float getAvg(ArrayList<Long> a) {
		long sum = 0;
		for(long i: a) {
			sum +=i;
		}
		return sum/((float) a.size());
	}
	
	public static void main(String[] args)
	{
		int[] tiny = {1,24,5,25};
		int[] alreadySorted = {};//fill in your example
		int[] backward = {};//fill in your example
		System.out.println("Tiny");
		BubbleSorter tinySorted = new BubbleSorter(tiny);
		tinySorted.sort();
		System.out.println(tinySorted);
		
		System.out.println("Already Sorted");
		
		
		System.out.println("Backward");
	
        System.out.println("1000:");
        getStats(1000);
        
		System.out.println("3000:");
		getStats(3000);
		
	}
}
