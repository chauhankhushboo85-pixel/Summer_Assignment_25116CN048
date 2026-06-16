import java.util.Scanner;
public class Q62 {
    public static void main(String[] args){
          Scanner scanner= new Scanner(System.in);
          System.out.println("enter the size of array");
          int n= scanner.nextInt();
          int arr[]= new int[n];
        System.out.println("enter the elements in array:");
        for(int i=0;i<n;i++){
        arr[i]= scanner.nextInt();
        }
        int maximum =0;
        System.out.println("maximum frequency element is:");
        for (int i=0;i<n; i++) {
            for(int j=i+1;j<n;j++){
            if(arr[i]== arr[j]){
              maximum =arr[i];
               j++;
            }
            
            }
        }
        System.out.println(maximum);
        
    }
    
}
