import java.util.Scanner;
public class Q64 {
    public static void main(String[] args){
          Scanner scanner= new Scanner(System.in);
          System.out.println("enter the size of array");
          int n= scanner.nextInt();
          int arr[]= new int[n];
        System.out.println("enter the elements in array:");
        for(int i=0;i<n;i++){
        arr[i]= scanner.nextInt();
        }
        System.err.println("removed duplicate array:");
        for (int i = 0; i < n; i++) {
         for(int j=i+1;j<n;j++){
           if(arr[i]==arr[j]){
            for(int k=j;k<n-1;k++){
                arr[k]=arr[k+1];
            }
            n--;
            j--;
           }
         }  

            
        }
        for (int i = 0; i < n; i++) {
            
          System.out.println(arr[i]+" ");  
        }

    }}
    
     
      

