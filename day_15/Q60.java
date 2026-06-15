import java.util.Scanner;
public class Q60 {
    public static void main(String[] args){
          Scanner scanner= new Scanner(System.in);
          System.out.println("enter the size of array");
          int n= scanner.nextInt();
          int arr[]= new int[n];
        System.out.println("enter the elements in array:");
        for(int i=0;i<n;i++){
        arr[i]= scanner.nextInt();
        }
        int j=0;
         System.out.println("array after moving zeros:");
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for (int element:arr){
          System.out.println(element);
        }
    } 
}
