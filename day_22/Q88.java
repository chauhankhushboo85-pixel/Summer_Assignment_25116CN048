import java.util.Scanner;
public class Q88 {
    public static void main(String[] args){
          Scanner scanner= new Scanner(System.in);
          System.out.println("enter the sentence:");
          String n= scanner.nextLine();
          String noSpace=n.replaceAll("\\s+", "");
          System.out.println(noSpace);
}}
