import java.util.Scanner;

public class Factorial
{
    public static void main (String args [])
    {
        int num;
        int hold;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        input.close();
        hold = num;
        System.out.print(num + "! = " + num);
        for(int i = 1; i <= num; i++)
        {
            if(hold != 1)
            {
                hold--;
                System.out.print("*"+hold);
            }
        }

    }
}