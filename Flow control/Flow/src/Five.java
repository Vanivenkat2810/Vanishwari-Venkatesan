import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        char a ='#';
        if((a>=48 && a<=57) || a==45)
        {
            System.out.print("Number");

        }
        else if((a>='a' && a<='z')||(a>='A' && a<='Z'))
        {
            System.out.print("Alphabet");
        }
        else
        {
            System.out.print("special character");

        }
}
}
