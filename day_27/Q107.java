import java.util.Scanner;


public class Q107 {
     public static void main(String[]args){

     Scanner scanner= new Scanner(System.in);
     int []id=new int[100];
     String[] name=new String[100];
     double[]basic=new double[100];
     double[]hra=new double[100];
     double[]da=new double[100];
     double[]pf=new double[100];
     double[]net=new double[100];
     int choice;
     int count=0;

      do{
        System.out.println("enter your choice:");
        System.out.println("1.Add an employee");
        System.out.println("2.calculate salary");
        System.out.println("3.display employee ");
        System.out.println("4. exit");
          choice= scanner.nextInt(); 
        switch(choice){
            case 1: 
                 System.out.println("Enter id:");
              id[count]=scanner.nextInt();
              scanner.nextLine();
              System.out.println("Enter name :");
              name[count]=scanner.nextLine();
              System.out.println("Enter  basic salary:");
              basic[count]=scanner.nextInt();
             hra[count]=basic[count]*0.20;
             da[count]=basic[count]*0.10;
             pf[count]=basic[count]*0.10;
         
             count++;
              System.out.println("Added sucessfully!");
        
            break;
         
          case 2:
            for(int i=0;i<count;i++){
                net[i]=basic[i]+hra[i]+da[i]-pf[i];
            }
            System.out.println("calculated sucessfully");
            break;
              case 3:
         System.out.println("\nemployee id\tName\tbasic salary\thra\tda\tpf\tnet salary");
          for(int i=0;i<count;i++){
           System.out.println(id[i]+"\t"+name[i]+"\t"+basic[i]+"\t"+hra[i]+"\t"+da[i]+"\t"+pf[i]+"\t"+net[i]);
          }
          break;
            case 4:
                System.out.println("exiting...");
                break;
               
        }
         
      }while(choice!=4);
}}
