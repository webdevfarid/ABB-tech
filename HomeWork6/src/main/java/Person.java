public class Person {
    private static int nextId = 1;
    private int id;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
