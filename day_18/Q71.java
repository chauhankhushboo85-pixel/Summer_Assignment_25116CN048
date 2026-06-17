import java.util.Scanner;
public class Q71 {
     public static void main(String[]args){
     Scanner scanner= new Scanner(System.in);
          
        int[]arr={2,3,4,56,78,90};
        System.out.println("enter the element to be searched:");
        int element = scanner.nextInt();
        int low=0,mid,high=arr.length-1;
        int found=0;
         
        while(low<=high){
            mid = (low+high)/2;
        if(arr[mid]==element){
           found =mid;
           break;
        }
        if(arr[mid]<element){
            low=mid+1;
        }
        else{
            high=mid-1;
        }

    }
    if(found!=0){
        System.out.println("the number is founded");
    }
    else{
        System.out.println("not found");
    }
    }
}
