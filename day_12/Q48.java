import java.util.Scanner;
public class Q48 {
    static int perfect(int x){
        int sum=0;
        for(int i=1;i<x;i++){
            if(x%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int result=perfect(number);
        if(result==number){
            System.out.println("It is a perfect number");

        }
        else{
        System.out.println("not a perfect number");
        }
}}
