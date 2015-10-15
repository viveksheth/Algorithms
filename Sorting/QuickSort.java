// QuickSort.java
// simple version of quick sort
// to run this program: $>java QuickSort

class ArrayQuick
{
	private long[] theArray; 
	private int nElems; 
	
	public ArrayQuick(int max) // constructor
	{
		theArray = new long[max]; // create the array
		nElems = 0; // no items yet
	}
	
	public void insert(long value) // put element into array
	{
		theArray[nElems] = value; // insert it
		nElems++; 
	}
	
	public void display() // displays array contents
	{
		for(int i=0; i<nElems; i++) // for each element,
			System.out.print(theArray[i] + " "); // display it
		System.out.println("");
	}
	
	public void quickSort()
	{
		recQuickSort(0, nElems-1);
	}
	
	public void recQuickSort(int left, int right)
	{
		if(right-left <= 0) // if size <= 1,
		return; // already sorted
		else // size is 2 or larger
		{
			long pivot = theArray[right]; // rightmost item
			//partition range
			int partition = partitionIt(left, right, pivot);
			recQuickSort(left, partition-1); // sort left side
			recQuickSort(partition+1, right); // sort right side
		}
	} // end recQuickSort()

	public int partitionIt(int left, int right, long pivot)
	{
		int leftPtr = left-1; 
		int rightPtr = right; 
		while(true)
		{ // find bigger item
			while( theArray[++leftPtr] < pivot ) ; // (nop)
			//find smaller item
			while(rightPtr > 0 && theArray[--rightPtr] > pivot)	; // (nop)
			
			if(leftPtr >= rightPtr)
				break; 
			else 
				swap(leftPtr, rightPtr); 
		} // end while(true)
		swap(leftPtr, right); // restore pivot
		return leftPtr; // return pivot location
	} // end partitionIt()

	public void swap(int a, int b) // swap two elements
	{
		long temp = theArray[a]; 
		theArray[a] = theArray[b]; 
		theArray[b] = temp; 
	} // end swap(

} // end class ArrayQuick

class QuickSort
{
public static void main(String[] args)
{
	int maxSize = 10; // array size
	ArrayQuick aQuick;
	aQuick = new ArrayQuick(maxSize); // create array
	for(int i=0; i<maxSize; i++) // fill array with
	{ // random numbers
		long n = (int)(java.lang.Math.random()*99);
		aQuick.insert(n);
	}
	System.out.println("Array before sorting: ");
	aQuick.display(); // display items
	aQuick.quickSort(); // quicksort them
	System.out.println("Array after sorting: ");
	aQuick.display(); // display them again
} // end main()
} // end class QuickSort