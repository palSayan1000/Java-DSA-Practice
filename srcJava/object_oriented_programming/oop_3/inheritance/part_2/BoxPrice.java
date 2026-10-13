package object_oriented_programming.oop_3.inheritance.part_2;

public class BoxPrice extends BoxWeight {
    // multi - level inheritance
    double cost;

    public BoxPrice() {
        super();
        this.cost = -1;
    }

    public BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double cost, double weight, double height, double length, double width) {
        super(height, width, length, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}
