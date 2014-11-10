import java.util.Scanner;
public class Diamond
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Length");
        int length = in.nextInt();
        int num = length;
        String printStat = new String("*");
        
        for (;length>=num; length--)
        {
            System.out.println(printStat);
            if(length>0)
            {
                printStat += "**";
            }
        }
        for(;num>=1;num--)
        {
            System.out.println(printStat);
            if(num>= 0)
            {
                int length2 = printStat.length();
                int newlen = length - 2;
                printStat = printStat.substring(0,newlen);
            }
        }
    }
}