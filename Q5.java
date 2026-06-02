package day_2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		int r;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		
     System.out.println("Enter your number:");
     int n= sc.nextInt();
     for(int i=0;i<=n;i++) {
    	 r=n%10;
    	 sum=sum+r;
    	 n=n/10;
    	 
     }
     System.out.printf("the sum of digits of number is:%d",sum);
    	 
	

	}

}
