import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        for(int i=10; i < 100; i++){

                boolean isPrime = true;

                for(int j=11; j < i ; j++){

                        if(i % j == 0){
                                isPrime = false;
                                break;
                        }
                }
                // print the number
                if(isPrime)
                        System.out.println(i + " ");
        }
	}
}


