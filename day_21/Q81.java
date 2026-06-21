import java.util.Scanner;
public class Q81{
    public static void main(String[] args){
          Scanner scanner= new Scanner(System.in);
          System.out.println("enter the string:");
          String n= scanner.nextLine();
          int count=0;
          for(char ch: n.toCharArray()){
           count++;
          }
          System.out.println("the length of the string is:"+count);
    }
}