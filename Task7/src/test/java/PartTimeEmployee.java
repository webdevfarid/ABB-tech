public class PartTimeEmployee extends Employee
{

    private int hours;
    private int hourlySalary;

    public PartTimeEmployee(String name, int experience, int hours, int hourlySalary)
    {
        super(name, experience);
        this.hours = hours;
        this.hourlySalary = hourlySalary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    @Override
    public void getSalary() {
        System.out.println("salary of part time employee "+this.getName()+"-"+this.hours+this.hourlySalary);
    }
}
