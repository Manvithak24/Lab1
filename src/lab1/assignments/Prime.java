/**
 * 
 */
package lab1.assignments;
import java.util.*;


/**
 * @author Manvitha
 *
 */
public class Prime {
	public static void main(String[] args)
	{	
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.print("Enter number ");
			n = sc.nextInt();
			System.out.println("Prime numbers are : ");
			for(int i=2;i<=n; i++)
				{
					int count=2;
					for(int j=2;j<1;j++)
						{
							if(i%j==0)
								{
									count++;
					
								}
						}
			
					if(count==2)
						{
							System.out.println(i+ " ");
							count++;
						}
	
		
				}
		
		
	}

}
