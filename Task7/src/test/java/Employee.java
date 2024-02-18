import java.util.ArrayList;

public  class Employee implements EmployeeInterface

{
    private String name;
    private int experience;

    public Employee(String name, int experience)
    {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public void getSalary()
    {
    }



}
