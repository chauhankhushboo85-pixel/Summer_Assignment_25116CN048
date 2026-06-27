import java.util.Scanner;

public class Q108 {
    public static void main(String[]args){

     Scanner scanner= new Scanner(System.in);
     int[] roll=new int[100];
     String[] name =new String[100];
     int[] english_marks=new int[100];
     int[] hindi_marks=new int[100];
     int[] maths_marks=new int[100];
     int[] science_marks=new int[100];
     int[] total_marks=new int[100];
     float[] percentage=new float[100];
     
     int choice;
     int count=0;
     do { 
         System.out.println("1.create a marksheet");
         System.out.println("2.generate the marksheet");
         System.out.println("3.exit");
         choice= scanner.nextInt(); 
         switch(choice){
            case 1:
         System.out.println("Enter  roll no:");
         roll[count]=scanner.nextInt();
         scanner.nextLine();
         System.out.println("Enter  name:");
         name[count]=scanner.nextLine();
         System.out.println("Enter  english marks:");
         english_marks[count]=scanner.nextInt();
         System.out.println("Enter  hindi marks:");
         hindi_marks[count]=scanner.nextInt();
         System.out.println("Enter  maths marks:");
         maths_marks[count]=scanner.nextInt();
         System.out.println("Enter  science marks:");
         science_marks[count]=scanner.nextInt();
         total_marks[count]=english_marks[count]+hindi_marks[count]+maths_marks[count]+science_marks[count];
         percentage[count]=(total_marks[count]/4)*100;
         count++;
         System.out.println("Added sucessfully!");
         break;
         case 2:
            System.out.println("Marksheet:");
           for (int i=0;i<count;i++){
            System.out.println("roll no:"+roll[i]);
            System.out.println("Name:"+name[i]);
            System.out.println("english marks:"+english_marks[i]);
            System.out.println("hindi marks:"+hindi_marks[i]);
            System.out.println("math marks:"+maths_marks[i]);
            System.out.println("science marks:"+science_marks[i]);
            System.out.println("total marks:"+total_marks[i]);
            System.out.println("percentage:"+percentage[i]);
            
           }

         }   
     } while (choice!=3);
}}
