import java.util.Scanner;
public class Q103 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int balance= 10000;
        int pin=3456;
        System.out.println("Insert your card in the machine");
          System.out.println("enter your bank account no:");
          int n= scanner.nextInt();
          System.out.println("enter your pin number");
          int r=scanner.nextInt();
          if(r==pin){
          System.out.println("enter the amount to be debited:");
          int m=scanner.nextInt();
          System.out.println(m+ " is debited from your bank account");
          int remaining_balance=balance-m;
          System.out.println("Please collect you cash");
          System.out.println("Remaining balance:"+remaining_balance);
          
          }
          else{
            System.out.println("Incorrect pin");
          }
}}
