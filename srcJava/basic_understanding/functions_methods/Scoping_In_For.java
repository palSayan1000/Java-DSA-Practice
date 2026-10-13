package basic_understanding.functions_methods;

public class Scoping_In_For {
    static void main() {
        for (int a = 0; a < 10; a++) {
            System.out.println(a);
        }
        // i cannot access this a here outside this for loop outside of scope
        // anything initialized outside cannot the initialised indide but can be used and anything initialised inside cannot be used outside
    }
}
