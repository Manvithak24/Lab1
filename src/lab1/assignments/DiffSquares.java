package lab1.assignments;
import java.util.*;
public class DiffSquares {
	private int n, sum, sqsum;
	public static void main(String[] args) {
		DiffSquares ds= new DiffSquares();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		System.out.println(ds.calculateDifference(n));
		
	}
	
	public int calculateDifference(int n)
	{
		for(int i=1;i<=n;i++)
		{
			sum +=i;
		
		}
		sum = sum*sum;
		for(int i=1;i<=n;i++)
		{
			sqsum = sqsum+(i*i);
			
		}
		return sum-sqsum;
	}
	
	

}
