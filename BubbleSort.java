
public class BubbleSort {
	
	public static void main(String[] arg)
	{
		int a [] = {1,22,72,8,21,54,98,644,003};
		
		//by default flag will be set to ascending order
		int t [] = bubblesortFunc(a,true);
		showArray(t);
	}
	
	static void showArray(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" | ");
		}
	}
	
	static int[] bubblesortFunc(int []unsorted, boolean flag)
	{
		for(int i =0; i<unsorted.length;i++)
		{
			for(int j=i+1; j<unsorted.length;j++)
			{
				if(flag)
				{
					if(unsorted[j]<unsorted[i])
					{
						int temp = unsorted[i];
						unsorted[i]=unsorted[j];
						unsorted[j]= temp;
					}
				}
				else
				{
					if(unsorted[j]>unsorted[i])
					{
						int temp = unsorted[i];
						unsorted[i]=unsorted[j];
						unsorted[j]= temp;
					}
				}
			}
		}
		return unsorted;
	}
}
