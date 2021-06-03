package lab1.assignments;
import java.util.*;
public class TrafficLights {
	
	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.println("Enter color to see");
		System.out.println("red");
		System.out.println("yellow");
		System.out.println("go");
		String color = input.nextLine();
		switch(color) {
		case "red":
			System.out.println("stop");
			break;
		case "yellow":
			System.out.println("Ready");
			break;
			
		case "green":
			System.out.println("Go");
			break;
		default:
			System.out.println("Error");
			break;
		}
	}
}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any color Green, Yellow, Red");)
//		String str = sc.nextLine();
//		String st = "";
//		switch(st)
//		{
//			case 1 : st="Go";
//					//System.out.println("Go");
//					break;
//			case 2 : st="Ready";
//					//System.out.println("Ready ");
//					break;
//			case 3 : st="Stop";
//					//System.out.println("Stop");
//					break;
//			default: st="invalid";
//			
//		}
//		System.out.println(st);
//	}
//}
////		if(str.equals("red")) {
////			System.out.println("Stop");
////		}else if(str.equals("yellow")) {
////			System.out.println("Ready");
////		}else {
////			System.out.println("go");
////		}
////	}
////	
////			
////}


