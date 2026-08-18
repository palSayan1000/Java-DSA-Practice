package basic_understanding.arraylists.methods.arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * A complete demonstration of the three core list iteration methods:
 * 1. iterator()
 * 2. listIterator()
 * 3. listIterator(int index)
 */
public class IteratorDemo {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("1. Using iterator()");
        System.out.println("=========================================");
        /*
         * EXPLANATION: iterator()
         * Returns a standard Iterator. It only allows you to move FORWARD
         * through the collection one by one. You can read elements and
         * safely remove them, but you cannot add or go backward.
         */
        List<String> tasks = new ArrayList<>(List.of("Draft", "Review", "Publish"));
        Iterator<String> standardIterator = tasks.iterator();

        while (standardIterator.hasNext()) {
            String task = standardIterator.next();
            System.out.println("Current task: " + task);

            // Safely removing an element while looping
            if (task.equals("Review")) {
                standardIterator.remove();
                System.out.println(" -> 'Review' was removed.");
            }
        }
        System.out.println("List after iterator(): " + tasks + "\n");



        System.out.println("=========================================");
        System.out.println("2. Using listIterator()");
        System.out.println("=========================================");
        /*
         * EXPLANATION: listIterator()
         * Returns a ListIterator starting at index 0.
         * It allows you to move FORWARD and BACKWARD. It also allows you
         * to modify the list on the fly (using set() to replace elements
         * or add() to insert new ones).
         */
        List<String> cities = new ArrayList<>(List.of("Tokyo", "London", "New York"));
        ListIterator<String> listIter = cities.listIterator();

        // Moving forward and modifying
        while (listIter.hasNext()) {
            String city = listIter.next();
            if (city.equals("London")) {
                listIter.set("Paris"); // Replaces "London" with "Paris"
                System.out.println("Replaced London with Paris.");
            }
        }

        // Moving backward (cursor is currently at the end of the list)
        System.out.println("Reading backwards:");
        while (listIter.hasPrevious()) {
            System.out.println(" <- " + listIter.previous());
        }
        System.out.println("List after listIterator(): " + cities + "\n");



        System.out.println("=========================================");
        System.out.println("3. Using listIterator(int index)");
        System.out.println("=========================================");
        /*
         * EXPLANATION: listIterator(int index)
         * Returns a ListIterator, but instead of starting at the beginning,
         * the "cursor" starts at the exact index you provide.
         * The cursor sits BETWEEN elements. For example, index 2 sits
         * right before the 3rd element in the list.
         */
        List<String> alphabet = new ArrayList<>(List.of("A", "B", "C", "D", "E"));

        // Start cursor at index 2 (between "B" and "C")
        ListIterator<String> middleIterator = alphabet.listIterator(2);

        System.out.println("Original List: " + alphabet);
        System.out.println("Starting iterator at index 2...");

        // If we call next(), it will return the element at index 2 ("C")
        System.out.println("Calling next() gets: " + middleIterator.next());

        // We can also inject elements at the current cursor position
        middleIterator.add("INSERTED");
        System.out.println("Added 'INSERTED' after 'C'.");

        System.out.println("List after listIterator(int index): " + alphabet);
    }
}