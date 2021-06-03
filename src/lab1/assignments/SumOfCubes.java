package lab1.assignments;
import java.util.Scanner;

public class SumOfCubes {
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner n= new Scanner(System.in);
		int num=n.nextInt();
		int sum=0;
		
		while(num!=0) {
			int digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		System.out.println("The sum of cubes of digits of the n digit number is " +sum);
	}
	
}
