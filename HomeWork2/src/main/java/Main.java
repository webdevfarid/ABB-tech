import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------first task--------");
        first();
        System.out.println("-------second task--------");
        second();
        System.out.println("-------forth task--------");
        forth();
        System.out.println("-------fifth task--------");
        fifth();
        System.out.println("-------sixth task--------");
        sixth();
        System.out.println("-------seventh task--------");
        seventh("1hghjh3kgy4jhcg5jg4jgc3j");
        System.out.println("-------eighth task--------");
        eighth();
        System.out.println("-------ninth task--------");
        ninth();
        System.out.println("-------tenth task--------");
        int[] array = {2,5,4,7,1,2,4,1,9,0,1,4,2,1,5,1};
        int value=1;
        int count = tenth(array, value);

        System.out.println("occurrences of-"+value +"=" + count);


    }

    static void first() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] indexes = new int[26];
        for (int i = 0; i < alphabet.length(); i++) {
            char letter = alphabet.charAt(i);
            int index = alphabet.indexOf(letter);
            indexes[i] = index;
        }
        for (int i = 0; i < indexes.length; i++) {
            System.out.println(alphabet.charAt(i) + "-" + indexes[i]);
        }
    }

    static void second() {
        String str = "The quick brown fox jumps over the lazy dog.";
        String fox = "fox";
        String cat = "cat";
        String newStr = str.replaceAll(fox, cat);
        System.out.println(str);
        System.out.println(newStr);
    }

    static void forth() {
        String str = "w3resource";
        removeDuplicate(str);
    }


    public static void removeDuplicate(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        System.out.println(result.toString());
    }

    static void fifth() {
        String str = "abcdefghijklmnopqrstuvwxyz";
        int n = 5;
        int partLength = str.length() / n;
        int start = 0;

        for (int i = 0; i < n; i++) {
            int end = start + partLength;
            if (i == n - 1) {
                end = str.length();
            }
            System.out.println(str.substring(start, end));
            start = end;
        }
    }
    static  void  sixth()
    {
        String word="hello";
        System.out.println(word);
        String reversed=new StringBuilder(word).reverse().toString();
        System.out.println(reversed);
    }
    static  void seventh(String input)
    {
        int sum=0;
        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if (Character.isDigit(ch))
            {
                sum += Character.getNumericValue(ch);
            }
    }
        System.out.println(sum);
    }
        static void eighth()
        {
            String[] colors = {"Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory"};
            System.out.println("Original unsorted colors: " + Arrays.toString(colors));
            Arrays.sort(colors, Comparator.comparingInt(String::length).reversed());
            System.out.println(Arrays.toString(colors));

            Arrays.sort(colors, Comparator.comparingInt(String::length));
            System.out.println(Arrays.toString(colors));
        }
        static void ninth()
        {
            int[] array = {1,9,7,4,2,0,7,5};
            int max = array[0];
            int min = array[0];
            for (int i = 1; i < array.length; i++)
            {
                if (array[i] > max)
                {
                    max = array[i];
                }
                if (array[i] < min)
                {
                    min = array[i];
                }
            }
            System.out.println("max-" + max);
            System.out.println("min-" + min);
        }
        static int tenth(int[] array, int value)
        {
            int count = 0;
            for (int i = 0; i < array.length; i++)
            {
                if (array[i] == value) {
                    count++;
                }
            }
            System.out.println(count);
            return count;
        }
    }

