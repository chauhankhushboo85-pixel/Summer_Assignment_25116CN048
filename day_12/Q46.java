import java.util.Scanner;
public class Q46 {
    static int armstrong(int x){
    int count =0;
    int sum=0;
    count = String.valueOf(x).length();
    while(x>0){
        int r=x%10;
        sum+=Math.pow(r,count);
        x/=10;
    }
    return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
       int result=armstrong(number);
      if(result==number){
        System.out.println("armstrong number");
      }
      else{
        System.out.println("not a armstrong number");
      }
}
}
