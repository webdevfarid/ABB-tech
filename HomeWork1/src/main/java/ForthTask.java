public class ForthTask
{
    static void forthTask()
    {
        int a = 5;
        int b = 10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("new a = " + a);
        System.out.println("new b = " + b);
    }
}
