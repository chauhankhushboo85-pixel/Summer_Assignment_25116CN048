import java.util.Scanner;
public class Q86 {
    public static void main(String[] args){
          Scanner scanner= new Scanner(System.in);
          System.out.println("enter the sentence:");
          String n= scanner.nextLine();
          int countwords = n.split("\\s").length;
          System.out.println("the number of words in the sentence are:"+countwords);

}}
