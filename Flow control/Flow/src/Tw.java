import java.util.Scanner;

public class Tw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=0;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("it is a prime number");
		}
		else
		{
			System.out.println("Not a prime");
		}
		
	}
}
		
	

		

	
