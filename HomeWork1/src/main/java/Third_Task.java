import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;

public class Third_Task
{
    static void thirdTask(int number)
    {
        int cem=0;
        while(number>0)
        {
            int a=number%10;
            cem+=a;
            number/=10;
        }
        System.out.println(cem);
    }
}
