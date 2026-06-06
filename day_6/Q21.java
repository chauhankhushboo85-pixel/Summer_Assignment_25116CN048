import java.util.Scanner;
public class Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimalnumber: ");
        int number = scanner.nextInt();
        int binary = 0;
        if(number==0){
            binary=0;
        }
        else{
            while(number>0){
                binary = binary*10 + number%2;
                number = number/2;
            }

        }
        System.out.println("Binary representation: " + binary);
       
    }
    
}
