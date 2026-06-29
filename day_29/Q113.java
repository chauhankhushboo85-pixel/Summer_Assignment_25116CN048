import java.util.Scanner;
public class Q113 {
   public static void main(String[]args){
Scanner scanner= new Scanner(System.in);
     float num1;
     float num2;
     int choice;
     do { 
         System.out.println("CALCULATOR");
         System.out.println("Choose any of the following option:");
         System.out.println("1. Add");
         System.out.println("2. Subtract");
         System.out.println("3. Multiply");
         System.out.println("4. Divide");
         System.out.println("5. exit");
         choice=scanner.nextInt();
         System.out.println("enter first digit");
         int m= scanner.nextInt();
         System.out.println("enter second digit");
         int n= scanner.nextInt();
         switch(choice){
          case 1:
            int sum = m+n;
            System.out.println("addition="+sum);
            break;
          case 2:
            
              int sub =m-n;
              System.out.println("subtraction="+sub);
              break;
            
          case 3:
            int multi =m*n;
            System.out.println("mutltiplication="+multi);
            break;
          case 4:
            float div=m/n;
            System.out.println("division="+div);
            break;
         }

     } while (choice!=5);
   }}