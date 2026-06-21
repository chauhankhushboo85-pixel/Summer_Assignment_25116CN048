import java.util.Scanner;
public class Q82 {
   public static void main(String[] args){
          Scanner scanner= new Scanner(System.in);
          System.out.println("enter the string:");
          String n= scanner.nextLine();
  String reverse=" ";
    
          for(int i= n.length()-1;i>=0;i--){
          reverse+=n.charAt(i);
}
System.out.println("the reverse of string is:"+reverse);
}}
