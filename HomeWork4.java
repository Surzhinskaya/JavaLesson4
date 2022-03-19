package HomeWork4;

import java.util.*;

public class HomeWork4 {
    public static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Cat", "Apple", "Tree",
                "Bag", "Water", "Java",
                "Dog", "Game", "Java",
                "Own", "Street", "Admin",
                "TV", "Dog", "TV",
                "Cat", "Java", "Pharmacy", "Bus"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);

        System.out.println("********************");


        Phonebook phonebook=new Phonebook();
        phonebook.add(1234567, "Vasiliev");
        phonebook.add(1112233, "Popov");
        phonebook.add(5469878, "Vlasova");
        phonebook.add(8882131, "Petrov");
        phonebook.add(2345678, "Vasiliev");
        phonebook.add(8182345, "Vlasova");
        phonebook.add(1236898, "Petrov");

        phonebook.get("Vasiliev");
        phonebook.get("Popov");
        phonebook.get("Vlasova");
        phonebook.get("Petrov");
        phonebook.get("Ivanova");
    }


}
