import java.util.Scanner;
public class Q51 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
         System.out.println("enter the length of array");
         int n=scanner.nextInt();
         int arr[]= new int[n];
         
        System.out.println("enter the elements in array:");
        for(int i=0;i<n;i++){
        arr[i]= scanner.nextInt();
        }
        int max =arr[0];
         int min=arr[0];
        for(int i=0;i<n;i++){
        if(arr[i]>max){
          max=arr[i];

        }
        if(arr[i]<min){
          min=arr[i];
        }
        
        }
        System.out.println("the maximum element in array:"+max);
        System.out.println("the minimum element in array:"+min);
}}
