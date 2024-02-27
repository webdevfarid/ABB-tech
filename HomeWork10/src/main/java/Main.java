import java.util.InputMismatchException;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        System.out.println("-----first task------");
        firstTask();
        System.out.println("-----second task------");
        secondTask();
    }
    static void firstTask()
    {
        System.out.println("write down an integer-");
        Scanner scanner=new Scanner(System.in);
        while (true)
        {
            try
            {
                if (scanner.hasNextInt())
                {
                    int input= scanner.nextInt();
                    System.out.println("your number is -"+ input);
                    if (isInteger(input))
                    {
                        System.out.println("your number square is "+input*input);
                        break;
                    }
                }
                else
                {
                    throw new InvalidInputException("this is not integer,try again T_T");
                }
            }
            catch (InvalidInputException e)
            {
                System.out.println(e.getMessage());
                scanner.next();
            }

        }

    }

    static boolean isInteger(int num) throws InvalidInputException
    {
        return num%1==0;
    }

    static void secondTask()
    {
        int min=1;
        int max=10;
        System.out.println("["+min+":"+max+"]");
        System.out.println("it will work until you find right number");
        while(true)
        {
            try
            {
                Scanner scanner = new Scanner(System.in);
                int userInput = scanner.nextInt();
                if (userInput < min || userInput > max)
                {
                    throw new InvalidInputException("this number is out of bounds");
                }
                else
                {
                    System.out.println("it's okay");
                    break;
                }
            }
            catch (InputMismatchException e1)
            {
                System.out.println("this is not even a number T_T");
            }
            catch (InvalidInputException e)
            {
                System.out.println(e.getMessage());
            }
        }
        }


}
