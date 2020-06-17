import java.util.Scanner;

public class Seventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String a=sb.toString();
		if(a.equals(s))
		{
			System.out.println(s+" "+"is a palindrome"); 
					
		}
		else
		{
			System.out.println(s+" "+"is not a palindrome");
		}
		
		
		

	}

}
