import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i1=sc.nextInt();
		int i2=sc.nextInt();
		int i3=i1+i2;
		System.out.println(i3);
		if(i3%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}

	}

}
