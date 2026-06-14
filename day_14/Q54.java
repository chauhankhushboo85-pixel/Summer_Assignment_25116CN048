import java.util.Scanner;
public class Q54 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("enter the size of the array:");
            int n=scanner.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the elements in array:");
        for(int i=0;i<n;i++){
        arr[i]= scanner.nextInt();
        }
        System.out.println("Enter the element whose frequency has to be found: ");
         int a=scanner.nextInt();
        int frequency=0;
        for(int i=0;i<n;i++){
            if(arr[i]==a){
                
                frequency++;
            }

        }
        System.out.println("the frequency of "+ a +" is:"+frequency);
            
        }}
    

