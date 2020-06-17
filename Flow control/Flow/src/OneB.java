import java.util.Scanner;

public class OneB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i1=sc.nextInt();
		int i2=sc.nextInt();
		int i3=i1%10;
		int i4=i2%10;
		if(i3==i4)
		{
			System.out.println("true");
		}
		else
		{
			
		System.out.println("false");
		}
		
	}
}
