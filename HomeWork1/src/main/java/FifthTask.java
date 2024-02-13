public class FifthTask
{
    static void fifthTask(int number)
    {
        int count=0;
        while(number>0)
        {
            number/=10;
            count+=1;
        }
        System.out.println(count);
    }

}
