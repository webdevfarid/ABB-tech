public class PartTimeEmployee implements Employee
{
    int id;
    String name;
    int hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(int id, String name, int hourlyRate, int hoursWorked) {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        System.out.println(name+"-"+hourlyRate*hoursWorked);

    }

    @Override
    public void displayDetails() {
        System.out.println("id-"+id+"\n"+"name-"+name+"\n"+"salary-"+hourlyRate*hoursWorked);
    }
}
