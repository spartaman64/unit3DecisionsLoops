import java.util.Scanner;

public class FindFirstMatch
{
    public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       
       System.out.print("Enter a String: ");
       String input = in.nextLine();
       
       boolean found = false;
       int index = 0;
       
       while(!found && index<input.length())
       {
           char ch = input.charAt(index);
           if (ch == ' ')
           {
               found = true;
            }
            else 
            {
                index++;
            }
            index++;
        }
        if(found)
        {
        System.out.print("Position of first space: "+index);

}
}
}
