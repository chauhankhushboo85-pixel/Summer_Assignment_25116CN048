import java.util.Scanner;
public class Q110 {
     public static void main(String[]args){

     Scanner scanner= new Scanner(System.in);

     int []accountNo=new int[100];
     String []accountName=new String[100];
     int []total_money=new int[100];
     int count=0;
     int choices;
     do { 
         System.out.println("BANK ACCOUNT SYSTEM");
         System.out.println("Please select from following options");
         System.out.println("1. Create a bank account");
         System.out.println("2. See account details");
         System.out.println("3. Credit money to account");
         System.out.println("4. Debit money to account");
         System.out.println("5. exit");
         choices =scanner.nextInt();
         switch(choices){
            case 1:
                System.out.println("Add acount no:");
                accountNo[count]=scanner.nextInt();
              scanner.nextLine();
              System.out.println("Enter  account name:");
              accountName[count]=scanner.nextLine();
               System.out.println("enter amount in account:");
               total_money[count]=scanner.nextInt();
               count++;
               break;
            case 2:
                System.out.println("enter the account no whose details want to see:");
                int j= scanner.nextInt();
                
                for(int i=0;i<count;i++){
                if(accountNo[i]==j){
                  System.out.println("Account id="+accountNo[i]);
                 System.out.println("name="+accountName[i]);
                  System.out.println("money in account ="+total_money[i]);
                 break;
                }
               else{
                 System.out.println("record not found");
                 break;
              }
               }
               break;
        
            case 3:
                System.out.println("enter the account no where amount is to be credited:");
                int n= scanner.nextInt();
                System.out.println("enter the amount to be credited:");
                int m=scanner.nextInt();
                for(int i=0;i<count;i++){
                if(accountNo[i]==n){
                    total_money[i]+=m;
                } 
            }
            System.out.println("Credited sucessfully!!!");
             break;
            case 4:
             System.out.println("enter the account no where amount is to be debited:");
                int k= scanner.nextInt();
                System.out.println("enter the amount to be credited:");
                int b=scanner.nextInt();
                for(int i=0;i<count;i++){
                if(accountNo[i]==k){
                    total_money[i]-=b;
                }
                }
                System.out.println("Debited sucessfully!!!");
                 break;
            }
    } while (choices!=5);
}}
