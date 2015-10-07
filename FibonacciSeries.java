import java.util.Scanner;

public class FibonacciSeries {
	
	private static Scanner scanner;

	public static void main(String [] arg)
	{
		//input to print Fibonacci series upto how many numbers 
		System.out.println("Enter number upto which Fibonacci series to print: "); 
		
		scanner = new Scanner(System.in);
		int number = scanner.nextInt(); 
		
		System.out.println("Fibonacci series upto " + number +" numbers : "); 
		
		//printing Fibonacci series upto number 
		
		for(int i=1; i<=number; i++)
		{ 
			System.out.print(fibo(i) +" "); 
		}

		
	}
	
	private static int fibo(int n)
	{
		if(n <=1)
		{
			return n;
		}
		else
			return fibo(n-1) + fibo (n-2);		
	}
}
