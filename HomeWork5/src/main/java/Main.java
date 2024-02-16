public class Main
{
    public static void main(String[] args)
    {
        System.out.println("----------Task1-------");
        Employee[] employees=new Employee[3];
        employees[0]=new PartTimeEmployee(1,"John",10,24);
        employees[1]=new FullTimeEmployee(2,"Jack",300);
        employees[2]=new PartTimeEmployee(3,"Mike",20,30);
        System.out.println("salaries");
        employees[0].calculateSalary();
        employees[1].calculateSalary();
        employees[2].calculateSalary();
        System.out.println("Details");
        employees[0].displayDetails();
        employees[1].displayDetails();
        employees[2].displayDetails();
        System.out.println("----------Task2-------");
        Outer.Inner inner1 = new Outer.Inner();
        Outer.Inner inner2 = new Outer.Inner();
        Outer.Inner inner3 = new Outer.Inner();
        Outer.Inner inner4 = new Outer.Inner();
        Outer.Inner inner5 = new Outer.Inner();
        System.out.println("count inners-"+Outer.Inner.getCount());

    }
}
