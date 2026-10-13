package object_oriented_programming.oop_5.creating_own_anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // the anaotation will be avilable the whole time
// .CLASS till the class starts running
// and another one is there there will be present  till it is nto compiled
@Target(ElementType.METHOD)
public @interface RunImmediately {
}
