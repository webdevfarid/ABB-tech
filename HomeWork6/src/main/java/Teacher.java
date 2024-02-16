public class Teacher extends Person
{
    private static int firstID=1;
    private int id;
    private int age;
    private String name;
    {
        id=firstID++;
    }

    public Teacher(int age, String name) {
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
