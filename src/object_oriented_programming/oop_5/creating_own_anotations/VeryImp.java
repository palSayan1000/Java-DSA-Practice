package object_oriented_programming.oop_5.creating_own_anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
//@Target({ElementType.TYPE, ElementType.METHOD}) // can add multiple anotations like like for for both methods and classes
@Retention(RetentionPolicy.RUNTIME)
public @interface VeryImp {
    //value() is an annotation element, not a normal method that you call yourself.
//    String value();
    String value() default "Important";
    int priority() default 1;
    // not very data types can be placed here
           // ↓
       // information that @VeryImp can store
    // VeryImp is just a marker annotation; it doesn't store any extra information
}