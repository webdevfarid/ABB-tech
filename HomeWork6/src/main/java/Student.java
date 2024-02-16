public class Student extends Person
{
    private static int firstID=1;
    private int id;
    private int age;
    private String name;
    {
        id=firstID++;
    }


    public Student(String name, int age) {
        super(name, age);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
