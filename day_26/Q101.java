import java.util.Random;
import java.util.Scanner;

public class Q101 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
          System.out.println("enter the number");
          int n= scanner.nextInt();
          Random rand=new Random();
          int num=rand.nextInt();
          if(num==n){
            System.out.println("you guessed it correct");
          }
          else{
            System.out.println("better luck next time");
          }
    }
}
