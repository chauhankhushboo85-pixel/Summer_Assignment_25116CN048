import java.util.Scanner;
public class Q9 {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
         int r=0;
        int number = scanner.nextInt();
        for(int i=2;i<number;i++){
            if(number%i==0){
         r=1;
                
            }
        }
        if(r==1){
            System.out.println("Not a prime number");
        }else{
            System.out.println("Prime number");
        }
    }}
