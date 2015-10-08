// ArrayExample.java
// demonstrates Array operations
// to run this program: $java ArrayExample

class HighArray
{
	
	private long[] a;
	private int nElem;
	
	public HighArray(int max) 
	{		
		a = new long[max];
		nElem=0;		
	}
		
	public boolean findElem(long searchKey)
	{
		int i;
		for(i=0; i<nElem; i++)
		{
			if(a[i]==searchKey)
				break;
		}
		
		if(i==nElem)
			return false;
		else 
			return true;
	} //end findElem	
	
	public void insertElem(long value)
	{		
		a[nElem] = value;
		nElem++;	
	} //end insertElem
	
	public boolean deleteElem(long value)
	{
		int i;
		for(i=0;i<nElem;i++)
		{
			if(a[i]==value)
				break;
		}
		
		if(i==nElem)
			return false;
		else
		{
			for(int j=i; j<nElem;j++)
			{
				a[j]=a[j+1];
			}
			nElem--;
			return true;
		}
	} //end deleteElem
		
	public void displayElem()
	{
		for(int i=0; i<nElem;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	} // end displayElem
			
} //end HighArray
	
public class ArrayExample {

	public static void main(String[] args) 
	{
		int maxSize = 100; // array size
		HighArray arr; // reference to array
		arr = new HighArray(maxSize); // create the array
		arr.insertElem(70); // insertElem 10 items
		arr.insertElem(90);
		arr.insertElem(80);
		arr.insertElem(55);
		arr.insertElem(40);
		arr.insertElem(88);
		arr.insertElem(20);
		arr.insertElem(00);
		arr.insertElem(60);
		arr.insertElem(33);
		arr.displayElem(); // display items
		int searchKey = 33; // search for item
		
		if( arr.findElem(searchKey))
		System.out.println("Found " + searchKey);
		else
		System.out.println("Can’t find " + searchKey);

		arr.deleteElem(00); // delete 3 items
		arr.deleteElem(55);
		arr.deleteElem(90);
		arr.displayElem();
		} // end main()
} //end ArrayExample()
