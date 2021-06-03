package lab1.assignments;
import java.util.*;
public class NaturalNum {
	private int s=0;
	public static void main(String[] args) {
		System.out.println("Enter Number ");
		NaturalNum k = new NaturalNum();
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		
		System.out.println(k.calculateSum(n));
		
	}
	
	public int calculateSum(int n) {
		for(int i=0;i<=n;i++)
		{
			if( i%3==0 || i%5==0 ) {
				 s += i;
			}
		}
		return s;
	}

}
