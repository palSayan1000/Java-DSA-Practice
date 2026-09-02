package object_oriented_programming.oop_4;

public class ObjectDemo {
    /// overriding methods from the object class
    int num;
    float gpa;
    // already covered this
    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return /*super.hashCode()*/ num;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        // overriding the equals and creating my own
        return this.num == ((ObjectDemo)obj).num; // (ObjectDemo)obj -> converted Object obj (which includes object of ObjectDemo to ObjectDemo)
        // why casting is required as remember parent class does not know about child class
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    // already covered this // calls during object destruction
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
//        ObjectDemo demo = new ObjectDemo(34);
        ObjectDemo obj1 = new ObjectDemo(30, 7.99f), obj2 = new ObjectDemo(30, 4.0f);

        if (obj1 == obj2) { // warning
            System.out.println("obj is equal to obj2");
        }
        if (obj1.equals(obj2)) { // no warning
            System.out.println("obj1 is equal to obj2");
        }
        // internally above both equals are same if you go inside the  equals method you can see
        // it is unlike strings where == checks objects and .equals method check value (content in str)
        // here both are same

        System.out.println(obj1.getClass());
        // class object_oriented_programming.oop_4.ObjectDemo -> prints this obj1.getClass()
        System.out.println(obj2.getClass().getName()); // the .getClass() is final so you cannot override it
        // this .getClass() info will be stored in the heap
        // can access more such methods using obj1.getClass().(....)

//        System.out.println(demo.hashCode());
//        System.out.println(obj.hashCode());

    }
}
