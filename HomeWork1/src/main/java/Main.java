import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("---------------First task------------------");
        First_Task.firstTask(27);
        System.out.println("---------------Second task------------------");
        Second_Task.secondTask(5);
        System.out.println("---------------Third task------------------");
        Third_Task.thirdTask(12345);
        System.out.println("---------------Forth task------------------");
        ForthTask.forthTask();
        System.out.println("---------------Fifth task------------------");
        FifthTask.fifthTask(36458219);
        System.out.println("---------------Sixth task------------------");

        Scanner scanner =new Scanner(System.in);
        int user= scanner.nextInt();
        SixTask.sixTask(user);
        System.out.println("---------------Seventh task------------------");
        SeventhTask.seventhTask(2,4,5);
        System.out.println("---------------Eighth task------------------");
        EighthTask.eighthTask();
        System.out.println("---------------Ninth task------------------");
        NinthTAsk.ninthTask(3);
        System.out.println("---------------Tenth task------------------");
        TenthTask.tenthTask(3);
    }
}
