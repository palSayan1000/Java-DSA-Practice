package object_oriented_programming.oop_7.enums;

public class Main {
    enum Week implements A{ // enum cannot extend anything
        Monday(), Tuesday(), Wednesday(), Thursday(), Friday(), Saturday(), Sunday();

        @Override
        public void hello() {
            System.out.println("Hey how are you on : " + this);
        }

        // abstract methods not allowed here
    }
    public enum WEEK {
        // 1. Pass values to the enum constructor
        MONDAY(1, "Mon"),
        TUESDAY(2, "Tue"),
        WEDNESDAY(3, "Wed"),
        THURSDAY(4, "Thu"),
        FRIDAY(5, "Fri"),
        SATURDAY(6, "Sat"),
        SUNDAY(7, "Sun");

        // 2. Define fields to hold the values
        private final int dayNumber;
        private final String shortName;

        // 3. Enum constructors must be private (default)
        WEEK(int dayNumber, String shortName) {
            this.dayNumber = dayNumber;
            this.shortName = shortName;
        }

        // 4. Provide getter methods to access values
        public int getDayNumber() {
            return dayNumber;
        }

        public String getShortName() {
            return shortName;
        }
    }
    static void main() {
        Week week;
        week = Week.Monday;
        System.out.println(Week.valueOf("Monday"));// actually returning the enum constant
        week.hello();

        // second enum
        WEEK week1 = WEEK.MONDAY;
        // Accessing custom values via getters
        System.out.println("Day number: " + week1.getDayNumber()); // 1
        System.out.println("Short name: " + week1.getShortName()); // Mon

        // Iterating over all values
        for (WEEK day : WEEK.values()) {
            System.out.println(day + " -> #" + day.getDayNumber() + " (" + day.getShortName() + ")");
        }
    }
}
