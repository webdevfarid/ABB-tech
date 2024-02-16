public class Main
{
    public static void main(String[] args)
    {
        Student student1=new Student("a",21);
        Student student2=new Student("b",22);
        Student student3=new Student("c",23);
        Student student4=new Student("d",24);
        Student student5=new Student("d",24);
        Student student6=new Student("d",24);
        GenericStorage<Person> genericStorage=new GenericStorage<Person>(4);
        genericStorage.addItem(student1);
        genericStorage.addItem(student2);
        genericStorage.addItem(student3);
        genericStorage.addItem(student4);
        genericStorage.addItem(student5);
        genericStorage.addItem(student6);
        genericStorage.displayAllItems();
        genericStorage.searchItem(3);

    }
}
