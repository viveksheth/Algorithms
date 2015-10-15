// shellSort.java
// demonstrates shell sort
// to run this program: $>java ShellSortApp

class ArrayShell
{
	private long[] theArray; 
	private int nElems; 
	
	public ArrayShell(int max) // constructor
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
		
		for(int i=0; i<nElems; i++)
			System.out.print(theArray[i] + " "); 			
		System.out.println("");
	}

	public void shellSort()
	{
		int inner, outer;
		long temp;
		int h = 1; // find initial value of h
		while(h <= nElems/3)
		h = h*3 + 1; 
		while(h>0) 
		{
			for(outer=h; outer<nElems; outer++)
			{
				temp = theArray[outer];
				inner = outer;
			
				while(inner > h-1 && theArray[inner-h] >= temp)
				{
					theArray[inner] = theArray[inner-h];
					inner -= h;
				}
				theArray[inner] = temp;
			} // end for
			h = (h-1) / 3; 
		} 
	} // end shellSort()
} // end class ArrayShell

class ShellSort
{
	public static void main(String[] args)
	{
		int maxSize = 15; // array size
		ArrayShell ashell;
		ashell = new ArrayShell(maxSize); // create the array
		for(int i=0; i<maxSize; i++) // fill array with
		{
			long n = (int)(Math.random()*200); //generates random numbers
			ashell.insert(n);
		}
		System.out.println("Array before sorting: ");
		ashell.display(); // display unsorted array
		ashell.shellSort(); // shell sort the array
		System.out.println("Array after sorting: ");
		ashell.display(); // display sorted array
	} // end main()
} // end class ShellSort