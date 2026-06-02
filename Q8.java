package day_2;

import java.util.Scanner;

public class Q8 {

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
     if(rev==n) {
    	 System.out.println("it is a palindrome number");
     }
     else {
    	 System.out.println("it is not a palindrome number");
     }

	}

}
