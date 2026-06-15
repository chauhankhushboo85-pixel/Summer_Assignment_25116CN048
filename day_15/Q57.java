import java.util.Scanner;
public class Q57{
    public static void main(String[] args){
          Scanner scanner= new Scanner(System.in);
          System.out.println("enter the size of array");
          int n= scanner.nextInt();
          int arr[]= new int[n];
        System.out.println("enter the elements in array:");
        for(int i=0;i<n;i++){
        arr[i]= scanner.nextInt();
        }
        int l=n/2;
       int temp=0;
      System.out.println("the reverse of elements in array are:");
        for (int i=0; i<l;i++) {
          temp=arr[i];
          arr[i]=arr[n-i-1];
          arr[n-i-1]=temp;
           
        } 
        for (int element:arr){
          System.out.println(element);
        }
    }
}