package object_oriented_programming.oop_3.inheritance.part_1;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1.0;
//        this.ll = -1.0;
        // the above gives error as any thing that is private u can only use it in that file
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height); // what is this? -> call the parent class constructor
        // used to initialize values present in parent class
        // it will not be able to access the members of the parent class that is being declared as private
        // the default onw will be called iif super is not given

        // second use case of the super keyword
        System.out.println(super.weight);
        // when you have same variable names (weight) -> in both BoxWeight and the Box classes and you want to
        // specifically access the weight variable of the parent class then you have to use super.(variable name) instead of this.

        this.weight = weight;
//        super(length, width, height); // previously super could not be written below and was forced to be written
        // as the first line of the function but now in modern java it could be done
    }
}