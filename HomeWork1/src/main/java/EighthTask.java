import java.util.Scanner;

public class EighthTask
{
    static void eighthTask()
    {
        System.out.println("First number-");
        Scanner scanner =new Scanner(System.in);
        int num1= scanner.nextInt();
        System.out.println("Second number-");
        Scanner scanner2 =new Scanner(System.in);
        int num2= scanner2.nextInt();
        System.out.println("operation-");
        Scanner scanner3 =new Scanner(System.in);
        String operation=scanner3.nextLine();
        switch (operation)
        {
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            case "%":
                System.out.println(num1%num2);
                break;
        }

    }
}
