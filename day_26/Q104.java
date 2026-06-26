import java.util.Scanner;
public class Q104 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         
          int score=0;
          int ans;
          System.out.println("Get ready for the quiz");
          System.out.println("What is the capital of India?");
          System.out.println("1)Delhi");
          System.out.println("2)Kolkata");
          System.out.println("3)Jaipur");
          System.out.println("4)Mumbai");
          System.out.println("enter your answer:");
         ans= scanner.nextInt();
          if(ans==1){
            score++;
          }
       
          System.out.println("Who is the president of India?");
          System.out.println("1)Narendra modi");
          System.out.println("2)Draupadi Murmu");
          System.out.println("3)Amit shah");
          System.out.println("4)Yogi adityanath");
          System.out.println("enter your answer:");
         ans= scanner.nextInt();
          if(ans==2){
            score++;
          }
          
          System.out.println("Name the highest mountain peak in the world");
          System.out.println("1)Mount fuji");
          System.out.println("2)Mount everest");
          System.out.println("3)Mount Kilimanjaro");
          System.out.println("4)Mount kailash");
          System.out.println("enter your answer:");
         ans= scanner.nextInt();
          if(ans==2){
            score++;
          }
         
          System.out.println("Mahatma Gandhi is also called as:");
          System.out.println("1)iron man");
          System.out.println("2)nightangle of india");
          System.out.println("3)Father of nation");
          System.out.println("4)Poet of india");
          System.out.println("enter your answer:");
        ans= scanner.nextInt();
          if(ans==3){
            score++;
          }
          
          System.out.println("what is 42+90:");
          System.out.println("1)782");
          System.out.println("2)105");
          System.out.println("3)135");
          System.out.println("4)132");
          System.out.println("enter your answer:");
         ans= scanner.nextInt();
        if(ans==4){
            score++;
        }
        System.out.println("Test completed");
        System.out.println("your score is:"+score);
          
          if(score==5){
            System.out.println("excellent");
          }
          else if(score>=3&&score<5){
            System.err.println("good work");
          }
          else{
            System.out.println("better luck next time");
          }
}}
