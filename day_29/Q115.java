import java.util.Scanner;

public class Q115 {
    public static void main(String[]args){
Scanner scanner= new Scanner(System.in);
       String string=" ";
     int choices;
     do { 
         System.out.println("MENU DRIVEN STRINGS OPERATION");
         System.out.println("Please select from following options");
         System.out.println("1. create a string");
         System.out.println("2. display the string");
         System.out.println("3. length of string");
         System.out.println("4. convert it into uppercase");
         System.out.println("5. convert it into lowercase");
         System.out.println("6. exit");
         choices =scanner.nextInt();
        switch (choices) {
          case 1:
            System.out.println("enter the string:");
             string=scanner.next();
            System.out.println("String added suceesfully");
            break;
            
          case 2:
            System.out.println("the string is:"+string); 
            break;
         case 3:
            System.out.println("The length of string is:"+string.length());
            break;
         case 4:
            String upper_string=string.toUpperCase();
            System.out.println(upper_string);
            break;
         case 5:
            String lower_string=string.toLowerCase();
            System.out.println(lower_string);
            break;
        }
     }while(choices!=6);
}}
