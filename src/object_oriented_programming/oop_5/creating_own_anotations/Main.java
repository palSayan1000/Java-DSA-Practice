package object_oriented_programming.oop_5.creating_own_anotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    static void main() {
        Cat obj = new Cat("Googol");
//        System.out.println(Arrays.toString(obj.getClass().getAnnotations()));
//        System.out.println(VeryImp.class.isAnnotation());// true
//        System.out.println(obj.getClass().isAnnotation());// false
//        System.out.println(obj.getClass().isAnnotationPresent(VeryImp.class));// true

        Dog ob = new Dog("Bitch Kuttia");
//        System.out.println(Arrays.toString(obj.getClass().getAnnotations()));
//        System.out.println(obj.getClass().isAnnotationPresent(VeryImp.class));// false

        // looping through every methods in a class and excute that method that has anotations over it
        Method[] methods = obj.getClass().getDeclaredMethods();

        // 2. Loop through every method
        for (Method method : methods) {

            // 3. Check if the method has our custom annotation
            if (method.isAnnotationPresent(RunImmediately.class)) {

                System.out.println("Found annotated method: " + method.getName() + "() -> Executing...");

                try {
                    // 4. Execute the method on our 'myCat' object
                    method.invoke(obj);
                    //"Hey Java, take this specific method blueprint, and execute it using the myCat object."
                } catch (Exception e) {
                    System.out.println("Something went wrong while executing!");
                    e.printStackTrace();
                }
                // In normal Java, the compiler checks your code before it runs.
                // If you try to run a method that doesn't exist, or pass a String when it expects an int, the code simply won't compile.
                //
                //But Reflection happens dynamically at runtime. The compiler is entirely blind to what might happen when invoke() runs.
                // Because of this unpredictability, Java forces you to wrap it in a try/catch block to handle potential runtime explosions.
            }
        }
        /*
            * .class vs .getClass() -> Both return the Class<?> "blueprint" for Reflection:
            * - ClassName.class (Class Literal): Use when you know the type name (no object needed).
            * - object.getClass() (Method): Use when you already have an instantiated object.
            * Methods like isAnnotationPresent() require this Class<?> reference to inspect metadata.
        */
        for (Constructor<?> cons : obj.getClass().getConstructors()) {
            // Check if the constructor has your custom annotation
            // this will always return false as this is -> @Retention(RetentionPolicy.CLASS) -> present till it is not ran
            if (cons.isAnnotationPresent(Constructors.class)) {
                System.out.println("Found annotated constructor: " + cons.getName());

                try {
                    // Check parameter count to know what arguments to pass
                    int paramCount = cons.getParameterCount();

                    if (paramCount == 0) {
                        // Execute the no-arg constructor
                        Cat newCat1 = (Cat) cons.newInstance();

                    } else if (paramCount == 1) {
                        // Execute the 1-arg constructor
                        Cat newCat2 = (Cat) cons.newInstance("Googol");
                    }

                    System.out.println("---");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
/*
When you use cons.newInstance(), Java creates and returns a completely new instance of Cat.
Because constructors have varying signatures (some take strings, some take ints, some take nothing),
you almost always have to check cons.getParameterCount() or cons.getParameterTypes() so you don't pass the wrong arguments and crash your program.
 */
