import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next().toUpperCase();
		switch(a)
		{
		case "R":
			System.out.println("Red");
			break;
		case "B":
			System.out.println("Blue");
			break;
		case "G":
			System.out.println("Green");
			break;
		case "O":
			System.out.println("Orange");
			break;
		case "Y":
			System.out.println("Yellow");
			break;
		case "W":
			System.out.println("White");
		default:
		
		  System.out.println("Invalid Code");
			
		}	
			

	}

}
