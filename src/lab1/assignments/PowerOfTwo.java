package lab1.assignments;
import java.util.*;

public class PowerOfTwo {
		public static void main(String[] args)
		{
			int n; 
			System.out.println("Enter the number " );
			Scanner sc= new Scanner(System.in);
			n = sc.nextInt();
			
			if(n>0)
			{
				//System.out.println("Number is not power of two");
				while(n!=1)
				{
					if(n%2!=0) {
						System.out.println("Number is not power of two");
				}
				}
			}
			else
			{
			System.out.println("Number is a power of 2");
			}
			
			
			
		}
				
}				
		