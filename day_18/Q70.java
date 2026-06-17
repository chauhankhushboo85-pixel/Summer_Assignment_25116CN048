import java.util.Scanner;
public class Q70 {
    public static void main(String[]args){
     Scanner scanner= new Scanner(System.in);
          System.out.println("enter the size of  array");
          int n= scanner.nextInt();
          int arr[]= new int[n];
        System.out.println("enter the elements in  array:");
        for(int i=0;i<n;i++){
        arr[i]= scanner.nextInt();
        }
        System.out.println("the sorted array is:");
        for(int i=0;i<n-1;i++){
            int smallest_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[smallest_index]){
                     smallest_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest_index];
            arr[smallest_index]=temp;
        }
        for(int element:arr){
            System.out.println(element);
        }
    }
}
