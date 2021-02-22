import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("apple","orange","avocado","banana","grapefruit","kiwi","lime","lemon","mango","watermelon","apple","orange","banana","grapefruit"));
        System.out.println("Task 1: Array");
        System.out.println("Our fruits: " + fruits);

        Set<String> unique = new HashSet<>(fruits);

        System.out.println("Non-recurring fruits: "+ unique);

        Map<String,Integer> summTypeofFruits = new HashMap<>();

        for (String fruit : fruits) {
            int value = summTypeofFruits.getOrDefault(fruit,0) +1;
            summTypeofFruits.put(fruit,value);
        }
        System.out.println("Amount of each type of fruit " + summTypeofFruits);


        System.out.println();

        System.out.println("Task 2: PhoneBook");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Nick","+981456331");
        phoneBook.add("Elizabet","+12312412413");
        phoneBook.add("Nick","+51251412312");
        phoneBook.add("Robert","+1412312");

        System.out.println("Nick: " + phoneBook.get("Nick"));
        System.out.println("Elizabet: " + phoneBook.get("Elizabet"));
        System.out.println("Robert: " + phoneBook.get("Robert"));



    }
}
