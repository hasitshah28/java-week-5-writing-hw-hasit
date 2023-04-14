package homework_writing_week_9;

import java.util.HashSet;
/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_8_HashSet {
    public static void main(String[] args) {

        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<>();

        //Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " is found in the set.");
            } else {
                System.out.println(i + " is not found in the set.");
            }
        }
    }
}

