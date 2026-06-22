import java.util.Scanner;
public class Q85 {
    public static void main(String[] args){
          Scanner scanner= new Scanner(System.in);
          System.out.println("enter the string:");
          String n= scanner.nextLine();
           String reverse="";
           String original_string=n;
          for(int i= n.length()-1;i>=0;i--){
          reverse+=n.charAt(i);    
}

if(original_string.equals(reverse)){
    System.out.println("the string is palindrome");
}
else{
    System.out.println("the string is not palindrome");
}
}}
