import java.util.Scanner;
public class Q52 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
         System.out.println("enter the length of array");
         int n=scanner.nextInt();
         int arr[]= new int[n];
         
        System.out.println("enter the elements in array:");
        for(int i=0;i<n;i++){
        arr[i]= scanner.nextInt();
        }
        int count_even=0;
        int count_odd=0;
    for (int i=0;i<n;i++){
        if(arr[i]%2==0){
            count_even++;
        }
        else{
            count_odd++;
        }
    }
    System.out.println("The count of even numbers is:"+count_even);
System.out.println("The count of odd numbers is:"+count_odd);
        
    }}
        
    
    

