import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		
		if(Character.isLowerCase(a))
		{
			System.out.println(Character.toUpperCase(a));
		}
		else
		{
			System.out.println(Character.toLowerCase(a));
		}

	}

}
