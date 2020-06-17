import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String Gender=sc.next();
		int Age=sc.nextInt();
		if(Gender.equals("Female") && Age>1 && Age<58)
		{
			System.out.println("the percentage of interest is 8.2%.");	
		}
		if(Gender.equals("Female") && Age>58 && Age<100)
		{
			System.out.println("the percentage of interest is 9.2%.");	
		}
		if(Gender.equals("male") && Age>1 && Age<58)
		{
			System.out.println("the percentage of interest is 8.4%.");
			
		}
		if(Gender.equals("male") && Age>58 && Age<100)
		{
			System.out.println("the percentage of interest is 10.5%.");	
		}
		
		}

	}
