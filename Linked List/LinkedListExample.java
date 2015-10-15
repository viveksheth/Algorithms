// LinkedListExample.java
// demonstrates Linked List: Insert, Delete and Display Elements
// to run this program: $java LinkedListExample

class Link
{
	public int iData;
	public double dData;
	public Link next;
	
	public Link(int id, double dd)
	{
		iData=id;
		dData=dd;
	}
	
	public void displayLink()
	{
		System.out.print("{"+iData+", "+dData+"}");		
	}
}

class LinkedListImpl
{
	private Link first; 
	
	public LinkedListImpl()
	{
		first = null;
	}
	
	public boolean isEmpty()
	{
		return(first==null);
	}
	
	public void insertElem(int id, double dd)
	{
		Link nLink = new Link(id, dd);
		nLink.next=first;
		first = nLink;
	}
	
	public Link deleteElem()
	{
		Link temp = first; 	// save reference to link
		first = first.next; // delete it: first-->old next
		return temp; 		// return deleted link		
	}
	public void displayList()
	{
		System.out.print("List (first-->last): ");
		Link current = first; // start at beginning of list
		while(current != null) // until end of list,
		{
			current.displayLink(); // print data
			current = current.next; // move to next link
		}
		System.out.println("");
	}
	
}

class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedListImpl theList = new LinkedListImpl(); // make new list
		theList.insertElem(22, 2.99); // insert four items
		theList.insertElem(44, 4.99);
		theList.insertElem(66, 6.99);
		theList.insertElem(88, 8.99);
		theList.displayList(); // display list
		theList.deleteElem();
		theList.displayList(); // display list
		theList.deleteElem();
		theList.displayList(); 
		
	}

}
