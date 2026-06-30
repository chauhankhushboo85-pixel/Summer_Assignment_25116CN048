import java.util.Scanner;

public class Q119 {
     public static void main(String[]args){

     Scanner scanner= new Scanner(System.in);
     int[] employee_id=new int[100];
     String[] name =new String[100];
     int[] salary=new int[100];
     System.out.println("employee managment system");
     int choice;
     int count=0;
      do{
        System.out.println("enter your choice:");
        System.out.println("1.Add an employee");
        System.out.println("2.Display all the employee");
        System.out.println("3. Search an employee");
        System.out.println("4. Update an employee");
        System.out.println("5. exit");
          choice= scanner.nextInt(); 
          switch(choice){
       case 1:
         System.out.println("Enter  employee id:");
         employee_id[count]=scanner.nextInt();
         scanner.nextLine();
         System.out.println("Enter  name:");
         name[count]=scanner.nextLine();
         System.out.println("Enter  salary:");
         salary[count]=scanner.nextInt();
         count++;
         System.out.println("Added sucessfully!");
       
       break;
       case 2:
            System.out.println("\nemployee id\tName\tsalary");
          for(int i=0;i<count;i++){
           System.out.println(employee_id[i]+"\t"+name[i]+"\t"+salary[i]);
          }
          break;
       case 3:
          System.out.println("Enter  employee id of the employee to be searched:");
          int m=scanner.nextInt();
          for(int i=0;i<count;i++){
          if(employee_id[i]==m){
            System.out.println("employee_id="+employee_id[i]);
            
            System.out.println("name="+name[i]);
            System.out.println("salary="+salary[i]);
            break;
          }
          else{
            System.out.println("record not found");
            break;
          }
         }
         break;
       case 4:
          System.out.println("Enter  employee id to update:");
          int w=scanner.nextInt();
          for(int i=0;i<count;i++){
            if(employee_id[i]==w){
              
          System.out.println("Enter new name:");
             scanner.nextLine();
          name[i]=scanner.nextLine();
          System.out.println("Enter new salary:");
          salary[i]=scanner.nextInt();
          System.out.println("record updated sucessfully");
          break;
            }
          }
          case 5:
                System.out.println("exiting...");
                break;

         }

      }while(choice!=5);

}}


