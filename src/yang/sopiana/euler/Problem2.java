package yang.sopiana.euler;

public class Problem2 
{
	/*
	 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
	 * By starting with 1 and 2, the first 10 terms will be:
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum 
	 * of the even-valued terms.
	 */
	public static final int MAX = 4000000;
	public static void main(String[]args)
	{
		int fib[] = {0,1};
		int fibNext = 0;
		int sum = 0;
		int counter = 0;
		do
		{
			
			if(fibNext%2==0)
				sum+=fibNext;
			if(counter++%2==0)
				fib[0]=fibNext;
			else
				fib[1]=fibNext;
			
			fibNext=fib[0]+fib[1];
		}while(fibNext<MAX);
		System.out.println(sum);
		
	}
}
