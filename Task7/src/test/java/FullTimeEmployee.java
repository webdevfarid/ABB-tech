public class FullTimeEmployee extends Employee
{
    private int salary;

    public FullTimeEmployee(String name, int experience, int salary)
    {
        super(name, experience);
        this.salary = salary;
    }

    @Override
    public void getSalary() {
        System.out.println("salary of full time employee "+getName()+"-"+salary);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
