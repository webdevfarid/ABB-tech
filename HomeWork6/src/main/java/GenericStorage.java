import java.util.ArrayList;

public class GenericStorage<T extends Person> {
    private T[] items;
    private int capacity;
    private int size;

    public GenericStorage(int capacity) {
        this.capacity = capacity;
        this.items = (T[]) new Person[capacity];
        this.size = 0;
    }

    public void addItem(T item) {
        if (size < capacity) {
            items[size] = item;
            size++;
            System.out.println(item+" has been added");
        }
        else {
            System.out.println("Storage is full");
        }
    }

    public void removeItem(int id)
    {
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                size--;
                break;
            }
        }
        System.out.println("has been removed");
    }

    public T searchItem(int id) {
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                return items[i];
            }
        }
        return null;
    }

    public void displayAllItems() {
        for (int i = 0; i < size; i++) {
            System.out.println(items[i]);
        }
    }
}

