package object_oriented_programming.oop_5.creating_own_anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
// Target restricted to Constructors only
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.CONSTRUCTOR)
public @interface Constructors {
    String message() default "It is a Constructor";
//    int val; -> without default version
}
