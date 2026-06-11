import java.util.Scanner;
public class Q41 {
    static int sum(int a,int b){
        int d=a+b;
        return d;

    }
     public static void main(String[] args) {
        System.out.println("Enter the first no: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Enter the second no: ");
        int y = scanner.nextInt();
        int result;
        result=sum(x,y);
        System.out.println("the result of the sum is :"+ result);

     }
    }
 