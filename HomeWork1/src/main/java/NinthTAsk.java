public class NinthTAsk
{
    static  void ninthTask(int a)
    {
        int number = a;
        int factorial = 1;
        for (int i = 1; i <= number; ++i)
        {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
