import java.util.Scanner;

public class Q120 {
     static Scanner scanner= new Scanner(System.in);
     static int[] patient_id=new int[100];
      static String[] patient_name =new String[100];
     static int[] age=new int[100];
     static int[] room_no=new int[100];
     static int count=0;
     static void addPatients(){
       System.out.println("enter patients id");
       patient_id[count]=scanner.nextInt();
       scanner.nextLine();
       System.out.println("enter patients name:");
       patient_name[count]=scanner.nextLine();
       System.out.println("enter patients age:");
       age[count]=scanner.nextInt();
       System.out.println("enter patients room no");
       room_no[count]=scanner.nextInt();
       count++;
       System.out.println("patient added sucessfully!!!");
    }
    static void searchPatient(){
        System.out.println("enter patient id to be searched");
        int m=scanner.nextInt();
        for(int i=0;i<count;i++){
          if(patient_id[i]==m){
            System.out.println("patient_id="+patient_id[i]);
            
            System.out.println("name="+patient_name[i]);
            System.out.println("age="+age[i]);
            System.out.println("room no="+room_no[i]);
            break;
          }
          else{
            System.out.println("record not found");
            break;
          }
    }
  }
  static void displayPatient(){
      System.out.println("\n patient id\t Name\t age\t room no");
          for(int i=0;i<count;i++){
           System.out.println(patient_id[i]+"\t"+patient_name[i]+"\t"+age[i]+"\t"+room_no[i]);
          }
          
  }
  static void updatePatient(){
    System.out.println("Enter  employee id to update:");
          int w=scanner.nextInt();
          for(int i=0;i<count;i++){
            if(patient_id[i]==w){
              
          System.out.println("Enter new name:");
             scanner.nextLine();
          patient_name[i]=scanner.nextLine();
          System.out.println("Enter new age:");
          age[i]=scanner.nextInt();
          System.out.println("Enter new room no:");
          room_no[i]=scanner.nextInt();
          System.out.println("record updated sucessfully");
          break;
            }
          }
   }
     public static void main(String[]args){
     int choice;
     do{
       System.out.println("HOSPITAL MANAGMENT SYSTEM");
        System.out.println("enter your choice:");
        System.out.println("1.Add a patient");
        System.out.println("2.Display all the patient");
        System.out.println("3. Search a patient");
        System.out.println("4. Update a patient");
        System.out.println("5. exit");
          choice= scanner.nextInt(); 
          switch(choice){
       case 1:
        addPatients();
        break;
      case 2:
        displayPatient();
        break;
      case 3:
        searchPatient();
        break;
      case 4:
        updatePatient();
        break;
      case 5:
        System.out.println("THANK YOU");
        break;
     
          }
     
       }while(choice!=5);
     }
    }
