package object_oriented_programming.oop_7.enums;

public class Basic {
    enum Week { // enum cannot extend anything
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // this is enum constants
        // public, static, final -> every member property -> by default
        // since it is final you cannot create child enums
        // the type of all of this is Week -> where it's declared

        Week() {
            System.out.println("Constructor called for " + this);// this is actually overridden and prints the name of the constants
        }
        // this above is neither public nor protected, only private or default
        // why ? we don't want to create new objects
        // because this is not the enum concept, that's why

        // internally :
        // public static final week Monday = new Week();
        // every enum expecitly extends java.lang.enum class
    }

    static void main() {
        Week week;
        week = Week.Monday;

        // iterating over the Week enum
//        for (Week day : Week.values())
//            System.out.println(day);

        System.out.println(week);
        System.out.println(week.ordinal());
    }
}
