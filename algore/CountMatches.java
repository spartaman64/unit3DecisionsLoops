import java.util.Scanner;

public class CountMatches
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       
       System.out.print("Enter a String: ");
       String input = in.nextLine();
       
       int spaces = 0;
       
       for(int index = 0; index < input.length();index++)
       {
           char ch = input.charAt(index);
           if(ch == ' ')
           {
               spaces++;
            }
        }
       System.out.print("Number of spaces: "+spaces);
       
    }
}
