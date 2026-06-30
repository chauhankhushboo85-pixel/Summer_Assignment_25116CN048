import java.util.Scanner;
public class Q117 {
    
public static void main(String[]args){

     Scanner scanner= new Scanner(System.in);
     
     int[] roll=new int[100];
     String[] name =new String[100];
     int[] marks=new int[100];
     int choice;
     int count=0;
     System.out.println("student managment record");
     do{
        System.out.println("enter your choice:");
        System.out.println("1.Add a student");
        System.out.println("2.Display all the student");
        System.out.println("3. Search a student");
        System.out.println("4. Update a atudent");
        System.out.println("5. exit");
        choice= scanner.nextInt(); 
       switch(choice){
       case 1:
         System.out.println("Enter  roll no:");
         roll[count]=scanner.nextInt();
         scanner.nextLine();
         System.out.println("Enter  name:");
         name[count]=scanner.nextLine();
         System.out.println("Enter  marks:");
         marks[count]=scanner.nextInt();
         count++;
         System.out.println("Added sucessfully!");
       
       break;
       case 2:
            System.out.println("\nRoll\tName\tMarks");
          for(int i=0;i<count;i++){
           System.out.println(roll[i]+"\t"+name[i]+"\t"+marks[i]);
          }
          break;
       case 3:
          System.out.println("Enter  roll no of the student to be searched:");
          int m=scanner.nextInt();
          for(int i=0;i<count;i++){
          if(roll[i]==m){
            System.out.println("roll no="+roll[i]);
            
            System.out.println("name="+name[i]);
            System.out.println("marks="+marks[i]);
            break;
          }
          else{
            System.out.println("record not found");
            break;
          }
         }
         break;
       case 4:
          System.out.println("Enter  roll no to update:");
          int w=scanner.nextInt();
          for(int i=0;i<count;i++){
            if(roll[i]==w){
              
          System.out.println("Enter new name:");
             scanner.nextLine();
          name[i]=scanner.nextLine();
          System.out.println("Enter new marks:");
          marks[i]=scanner.nextInt();
          System.out.println("record updated sucessfully");
          break;
            }
          }
          case 5:
                System.out.println("exiting...");
                break;


         }
      } while(choice!=5);
   
   }}
