import java.util.Scanner;
public class FindMax
{
       public static void main(String[] args)
       {
          Scanner in = new Scanner(System.in);
          System.out.println("Type in series of numbers(Press q to exit)");
        
         double currentMax = in.nextDouble();
        
       while(in.hasNextDouble())
        {
           double value = in.nextDouble();
            if(value > currentMax)
            {
                currentMax = value;
           }

         }
System.out.println("Maximum value: "+currentMax);
      }
    }
