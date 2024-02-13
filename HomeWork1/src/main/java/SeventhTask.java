public class SeventhTask
{
    static void seventhTask(int a,int b,int c)
    {
        if(a+b>c)
        {
            System.out.println("true triangle");
            System.out.println("Perimeter="+ a+b+c);
            double square=(a + b + c) / 2.0;
            square=Math.sqrt(square * (square - a) * (square - b) * (square - c));
            System.out.println("Square="+square);
        }
        else
        {
            System.out.println("triangle is wrong");
        }
    }
}
