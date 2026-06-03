import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting range no: ");
        int starting_no = scanner.nextInt();
        System.out.println("Enter the ending range no: ");
        int ending_no = scanner.nextInt();
            

       for(int i=starting_no;i<=ending_no;i++){
             int r=0;
           for(int j=2;j<i;j++){
               if(i%j==0){
                   r=1;
                   break;
               }
           }
           if(r==0){
               System.out.println(i);
           }
        }
    }
}