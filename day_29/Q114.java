import java.util.Scanner;

public class Q114 {
    public static void main(String[]args){
Scanner scanner= new Scanner(System.in);
     int arr[]= new int[100];
     int size = 0;
     int choices;
     int sum=0;
     
    
     do { 
         System.out.println("MENU DRIVEN ARRAY POERATION SYSTEM");
         System.out.println("Choose any of the following option:");
         System.out.println("1. Create an array");
         System.out.println("2. Display the elements of array");
         System.out.println("3. Sum of elements in array");
         System.out.println("4. Find the maximum element in array");
         System.out.println("5. Find the minimum element in array");
         System.out.println("6. search elements in array");
         System.out.println("7. exit");
          choices=scanner.nextInt();
         switch(choices){
            case 1:
                System.out.println("enter the size of array");
                 size=scanner.nextInt();
                System.out.println("enter the elements in array:");
                for (int i=0;i<size;i++){
                 arr[i]= scanner.nextInt();
                }
              System.out.println("Array created sucessfully!!!");
              break;
            case 2:
                 System.out.println("the elements are:");
                 for(int i=0;i<size;i++){
                  System.out.println(arr[i]);
                }
                break;
            case 3:
               System.out.println("the sum of elements in array are:");
               for (int i = 0; i < size; i++) {
                    sum+=arr[i];
               }
               System.out.println(sum);
               break;
            case 4:
               System.out.println("the maximum element in array:");
               int max=arr[0];
               for(int i=0;i<size;i++){
                if(arr[i]>max){
                 max=arr[i];
                }
                }
               System.out.println(max);
               break;
            case 5:
                System.out.println("the minimum element in array:");
                 int min=arr[0];
                for (int i=0;i<size;i++){
                    if(arr[i]<min){
                         min =arr[i];
                    }
                }
                  System.out.println(min);  
                break;
            case 6:
                System.out.println("enter the element to be searched:");
                int o=scanner.nextInt();
                int search=0;
                int index=0;
                for (int i = 0; i < size; i++) {
                  if(arr[i]==o){
                    index=i;
                      search=1;
                  }   
                }
                if(search==1){
                   System.out.println("Element found at index:"+index+1);
                }
                else{
                    System.out.println("not found");
                }

            }
     } while (choices!=7);
    }}