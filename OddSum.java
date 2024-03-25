import java.util.Scanner;

public class OddSum
{
    public static void main (String args [])
    {
        int num;
        int hold;
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        input.close();
        hold = num;
        for(int i = 1; i <= num; i++)
        {
            if(hold != 0)
            {
                if(hold % 2 != 0)
                {
                    total += hold;
                }
                hold--;
            }
        }
        System.out.println(total);

    }
}