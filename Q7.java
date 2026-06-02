package day_2;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		int r;
		int product=1;
		Scanner sc=new Scanner(System.in);
		
     System.out.println("Enter your number:");
     int n= sc.nextInt();
     for(int i=0;i<=n;i++) {
    	 r=n%10;
    	 product=product*r;
    	 n=n/10;
    	 
     }
     System.out.printf("the product of digits of number is:%d",product);
    	 
	}

	}


