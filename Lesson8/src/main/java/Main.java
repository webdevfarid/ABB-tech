import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        var names = "12";
        var age = 13+"";
        FunctionInterface<String, Integer> functional = (name, c) ->{
            System.out.println(Integer.parseInt(name));
            System.out.println(c+"");
        };
//        functional.func(names, age);
        System.out.println(age.getClass().getName());
    }
}

