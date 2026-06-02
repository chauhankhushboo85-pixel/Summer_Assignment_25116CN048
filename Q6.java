package day_2;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		int r;
		int rev=0;
		Scanner sc=new Scanner(System.in);
		
     System.out.println("Enter your number:");
     int n= sc.nextInt();
     for(int i=0;i<=n;i++) {
    	 r=n%10;
    	 rev= rev*10+r;
    	 n=n/10;
    	 
     }
     System.out.printf("the reverse no is:%d",rev);
	}

}
