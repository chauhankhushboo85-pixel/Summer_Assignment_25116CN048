import java.util.Scanner;
public class Q102 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
          System.out.println("enter your age:");
          int n= scanner.nextInt();
          if(n>=18){
            System.out.println("you are eligible to vote");
          }
          else{
            System.out.println("you are not eligible to vote");
          }
}}
