import java.util.Scanner;

public class RewriteLoops
{
    public static void main(String[] args)
    {
//         int s = 0;
//         for(int i = 1; i <= 10; i++)
//         {
//             s += i;
//         }
      int s = 0;
      int i = 1;
      
      while(i <= 10)
      {
          s += i;
          i++;
        }
    }
    
    public static void main2(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        double x = 0;
        double s = 1;
        
        do
        {
            s = 1.0 / (1 + n*n);
            n++;
            x += s;
        }
        while( s > 0.01);
        
        while(s > 0.01)
        {
            s = 1.0 / (1 + n * n);
            n++;
            x += s;
        }
    }
    
}
