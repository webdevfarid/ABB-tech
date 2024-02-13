import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("------------Task1-----------------");
        System.out.println("Write down company name");
        Scanner user =new Scanner(System.in);
        String scanner=user.nextLine();
        Product product1=new Product(scanner);
        System.out.println(product1.priductID);
        System.out.println("Write down company name");
        Scanner user2 =new Scanner(System.in);
        String scanner2=user2.nextLine();
        Product product2=new Product(scanner2);
        System.out.println(product2.priductID);
        System.out.println("------------Task2-----------------");
        Counter counter1=new Counter();
        Counter counter2=new Counter();
        Counter counter3=new Counter();
        Counter counter4=new Counter();
        System.out.println(Counter.getCounter());
        System.out.println("------------Task3-----------------");
        Car car=new Car("BMV","M5",2022,"disel");
        System.out.println("---speed()");
        car.speed(24);
        System.out.println("---low()");
        car.low(2);
        System.out.println("---stop()");
        car.stop();
        System.out.println("------------Task4-----------------");
        PhoneNumber phoneNumber=new PhoneNumber("0555022402");
        phoneNumber.setPhoneNumber("0555022402");
        System.out.println("------------Task5-----------------");
        System.out.println("----non-weekend");
        DayOfWeek day=DayOfWeek.FRIDAY;
        System.out.println(day.isWeekend());
        System.out.println("----weekend");
        DayOfWeek day2=DayOfWeek.SUNDAY;
        System.out.println(day2.isWeekend());


    }
}
