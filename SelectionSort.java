// SelectionSort.java
// Author: Vivek Sheth
// demonstrates selection sort
// to run this program: $java SelectionSort

class ArraySelection
{
	private long[] a; // ref to array a
	private int nElems; // number of data items
	
	public ArraySelection(int max) // constructor
	{
		a = new long[max]; // create the array
		nElems = 0; // no items yet
	}
	
	public void insert(long value) // put element into array
	{
		a[nElems] = value; // insert it
		nElems++; // increment size
	}
	
	public void display() // displays array contents
	{
		for(int j=0; j<nElems; j++) // for each element,
		System.out.print(a[j] + " "); // display it
		System.out.println("");
	}
	
	public void selectionSort()
	{
		int out, in, min; 
		
		for(out=0;out<nElems-1;out++)
		{
			min=out;
			for(in=out;in<nElems;in++)
			{
				if(a[in]<a[min])
					min=in;
				swap(out,min);
			}
		}
	} // end selectionSort()
	
	private void swap(int one, int two)
	{
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	} 
}
	
public class SelectionSort {

	public static void main(String[] args)
	{
		int maxSize = 100; // array size
		ArraySelection arr; // reference to array
		arr = new ArraySelection(maxSize); // create the array
		
		arr.insert(77); // insert 10 items
		arr.insert(99);
		arr.insert(44);
		arr.insert(255);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(100);
		arr.insert(66);		
		
		arr.display(); // display items		
		arr.selectionSort(); // selection-sort them	
		arr.display(); // display them again
		} // end main()
	} // end class SelectSort
