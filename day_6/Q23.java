import java.util.Scanner;
public class Q23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a  number: ");
        int number = scanner.nextInt();
      int binary = 0;
        int count = 0;
        if(number==0){
            binary=0;
        }
        else{
            while(number>0){
                binary = binary*10 + number%2;
                number = number/2;
            }

        }
        while(binary>0){
            int digit = binary%10;
            if(digit==1){
               count++;
            }
            
            binary = binary/10;
        }
        System.out.println("Number of set bits in binary representation: " + count);
    
    }
      
}