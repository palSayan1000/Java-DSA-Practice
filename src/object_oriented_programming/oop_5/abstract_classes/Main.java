package object_oriented_programming.oop_5.abstract_classes;

public class Main {
    // you can't instanciate an abstract class directly  and
    // have to do  it via derived type that should also not be abstract why final class cannot be inherited
    static void main() {
        Son son = new Son(19, "Sayan Pal");
        son.career("Coder");

        Daughter daughter = new Daughter(24, "Sayani Pal");
        daughter.career("Doctor");

        // Parent mon = new Parent(47, "Krishna Pal"); // cannot be instanciated
        // below it is creating obj of Parent class on the go it is a new anonomas class
        Parent mom = new Parent(47, "Krishna Pal") {
            @Override
            void career(String career) {
                System.out.println("I am a " + career);
            }

            @Override
            void partner(String name, int age, String type) {
                System.out.println("I love " + name + ".\nHe is " + type + " and his age is: " + age);
            }

            @Override
            void home(String house) {
                System.out.println("We live in a " + house);
            }
        };
        System.out.println(mom.getClass().isAnonymousClass()); // true // mom is an anonymous class
//        Parent dad = new Parent(56, "Uttam Pal");// error so you cannot create objects of an abstract class
    }
}
/*
final class Circle extends Shape {
    @Override
    double area() { return Math.PI * radius * radius; }
    double radius;
}

class Ellipse extends Circle { }  // COMPILE ERROR: cannot inherit from final Circle

Marking a class final says: "this is the final word — no subclass, no surprise overrides, what you see in this class is exactly what will run."

That single guarantee is why all four benefits fall out naturally:

Immutability-style guarantees — if nobody can subclass String, nobody can override its methods to make it behave differently.
So any code trusting String's behavior (like using it as a HashMap key) can rely on it never changing shape.
Security — a hacker can't create EvilPermissionChecker extends PermissionChecker and override checkAccess() to always return true,
 because there's no subclassing to exploit.
Design lock-in — the author is saying "I've tested this class completely as written; I'm not vouching for what it does
if someone bolts extra behavior onto it via inheritance."
JIT/performance — normally, calling obj.method() on a non-final class requires the JVM to check at runtime which version of
 method() to run (because some subclass might override it — this is called dynamic dispatch).
If the class is final, the JVM knows in advance there's only one possible version, so it can skip that runtime check
entirely and call it directly (or even inline it) — faster.
 */