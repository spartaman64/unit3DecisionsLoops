import java.util.Scanner;
public class BDiamond
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Length");
        int sideLength = in.nextInt();
        for(int row = 1; row <= sideLength; row++)
        {
            for(int column = 1; column <= sideLength * 2 - 1; column++)
            {
                if(Math.abs(column - sideLength)<(row))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}