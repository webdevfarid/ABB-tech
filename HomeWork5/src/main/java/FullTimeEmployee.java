public class FullTimeEmployee implements Employee
{
    int id;
    String name;
    int monthlySalary;

    public FullTimeEmployee(int id, String name, int monthlySalary) {
        this.id = id;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateSalary() {
        {

            System.out.println(name+"-"+monthlySalary);
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("id-"+id+"\n"+"name-"+name+"\n"+"salary-"+monthlySalary);
    }
}
