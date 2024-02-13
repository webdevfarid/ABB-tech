public class Counter
{
    static int counter=0;

    public Counter() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
