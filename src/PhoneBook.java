import java.util.*;

public class PhoneBook {
    private final Map<String, List<String>> numberPhoneBook = new HashMap<>();

    void add(String name,String phoneNumber) {
        List<String> numbers = numberPhoneBook.getOrDefault(name,new ArrayList<>());
        numbers.add(phoneNumber);
        numberPhoneBook.put(name,numbers);
    }

    List<String> get(String name) {
        return numberPhoneBook.getOrDefault(name,new ArrayList<>());
    }
}
