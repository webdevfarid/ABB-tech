public class Car

{
    String brand;
    String model;
    int year;
    String oil;
   static double speed=0;

    public Car(String brand, String model, int year, String oil) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.oil = oil;
    }
    public void speed(int a)
    {
        this.speed=speed+a;
        System.out.println(speed);
    }
    public void low(int a)
    {
        this.speed=speed-a;
        System.out.println(speed);
    }
    public void stop()
    {
        this.speed=0;
        System.out.println(speed);
    }
    public void checkLimit(double a)
    {
        if (speed>a)
        {
            System.out.println("too fast");
        } else if (speed<a)
        {
            System.out.println("it's okay");
        }
    }
}
