import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Employee partTimeEmployee1=new PartTimeEmployee("p1",4,11,200);
        Employee partTimeEmployee2=new PartTimeEmployee("p2",1,6,4500);
        Employee fullTimeEmployee1=new FullTimeEmployee("f1",3,3000);
        Employee fullTimeEmployee2=new FullTimeEmployee("f2",3,6000);

        partTimeEmployee1.getSalary();
        partTimeEmployee2.getSalary();
        fullTimeEmployee1.getSalary();
        fullTimeEmployee2.getSalary();

        ArrayList<Employee>employeeArrayList=new ArrayList<>();
        employeeArrayList.add(partTimeEmployee1);
        employeeArrayList.add(partTimeEmployee2);
        employeeArrayList.add(fullTimeEmployee1);
        employeeArrayList.add(fullTimeEmployee2);

        for (int i = 0; i < employeeArrayList.size() ; i++)
        {
            if (employeeArrayList.get(i).getExperience()<=2)
            {
                employeeArrayList.remove(employeeArrayList.get(i));
            }
        }

        Map<String,Integer> maxSalary=new HashMap<>();












    }
}
