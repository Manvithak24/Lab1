package lab1.assignments;
import java.util.*;

public class StringToken {
	public static void main(String[] args) {
		
	
	System.out.println("Enter integers");
	int number; 
	int sum=0;
	Scanner sc=new Scanner(System.in);
	String s = sc.nextLine();
	StringTokenizer st = new StringTokenizer(s ," ");
	while(st.hasMoreTokens()) {
		String t=st.nextToken();
		number=Integer.parseInt(t);
		System.out.println(number);
		sum=sum+number;
	}
	System.out.println("sum of intergers is "+sum);
	
}
}
