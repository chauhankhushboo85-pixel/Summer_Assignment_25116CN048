import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First no: ");
        int first_no = scanner.nextInt();   
        System.out.println("Enter the second no: ");
        int second_no = scanner.nextInt();
    
        int lcm=0;
        for(int i=1;i<=first_no*second_no;i++){
             if(i%first_no==0 && i%second_no==0){
                 lcm = i;
                 break;
             }
         }
         System.out.printf("the LCM of %d and %d is %d",first_no,second_no,lcm);
    }
}