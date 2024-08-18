import java.util.Scanner;
public class IT24100070Lab4Q2{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);

      double exammarks, labmarks, exampercentage, labpercentage, finalexammark;

      System.out.println("Please enter exam marks(out of 100):");
      exammarks=input.nextDouble();

       if(exammarks >=0 && exammarks >=100)
       {
       System.out.print("invalid input for the exam marks. Terminating the program.");
       return;
       }

      System.out.println("Please enter lab submission marks(out of 100):");
      labmarks=input.nextDouble();

       if(labmarks >=0 && labmarks >=100)
       {
       System.out.print("invalid input for the lab marks. Terminating the program.");
       return;
       }

      System.out.println("Please enter the percentage given for the exam:");
      exampercentage=input.nextDouble();

      System.out.println("Please enter the precentage given for the lab submission:");
      labpercentage=input.nextDouble();

        if (exampercentage + labpercentage != 100)
        {
	System.out.print("The percentages must add up to 100. Terminating program.");
        return;	
        }

      finalexammark = (exammarks*(exampercentage/100)) + (labmarks*(labpercentage/100));
        
      System.out.print("Final Exam Mark is:"+finalexammark);
      
    }
} 