
import java.util.ArrayList;

public class FirstExample {
    public static void main(String[] args) {
           // 1️⃣ Create an ArrayList of Strings
        ArrayList<String> languages = new ArrayList<>();

        // 2️⃣ Add elements
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java"); // duplicates allowed

        System.out.println("Languages List: " + languages);

        // 3️⃣ Access elements
        System.out.println("First language: " + languages.get(0));

        // 4️⃣ Modify elements
        languages.set(2, "C#");
        System.out.println("After update: " + languages);

        // 5️⃣ Remove an element
        languages.remove("Python");
        System.out.println("After removal: " + languages);

        // 6️⃣ Check size
        System.out.println("Total languages: " + languages.size());

        // 7️⃣ Loop through the ArrayList
        System.out.println("\nUsing for-each loop:");
        for (String lang : languages) {
            System.out.println(lang);
        }

        // 8️⃣ Check if element exists
        if (languages.contains("Java")) {
            System.out.println("\nJava is in the list ✅");
        }

        // 9️⃣ Clear all elements
        languages.clear();
        System.out.println("After clearing: " + languages);


    }
}
