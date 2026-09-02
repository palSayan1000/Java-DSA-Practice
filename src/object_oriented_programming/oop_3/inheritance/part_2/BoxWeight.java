package object_oriented_programming.oop_3.inheritance.part_2;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1.0;
        // private members (like ll) can't be accessed here, only within Box itself
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other) {
        weight = other.weight;
        super(other);
        // Box box5 = new BoxWeight(2, 3, 4, 8);
        // same as this concept (in the part_1.Main class)
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double length, double width, double height, double weight) {
        super(length, height, width); // calls parent constructor to init parent's fields
        System.out.println(super.weight); // super.field accesses parent's version when names clash
        this.weight = weight;
    }
}