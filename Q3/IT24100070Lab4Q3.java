import java.util.Scanner;
public class IT24100070Lab4Q3{
   public static void main(String[] args)
   {
     Scanner input = new Scanner(System.in);

     int number;
     String message;
     System.out.print("Enter a number:");
     number=input.nextInt();


     message =(number>0) ? "The number is: Positive" : (number<0) ? "The number is: Negative" : "The number is Zero";
      
      System.out.print(message);
    }
} 