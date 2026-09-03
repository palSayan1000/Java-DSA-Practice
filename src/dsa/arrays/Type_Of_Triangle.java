package dsa.arrays;

public class Type_Of_Triangle {
    static void main() {
        System.out.println(new Type_Of_Triangle().triangleType(new int[] {3, 4, 5}));
    }

    private String triangleType(int[] sides) {
        if (sides[0] + sides[1] <= sides[2] || sides[0] + sides[2] <= sides[1] || sides[1] + sides[2] <= sides[0])
            return "none";
        if (sides[0] == sides[1] && sides[1] == sides[2])
            return "equilateral";
        if (sides[0] == sides[1] || sides[1] == sides[2] ||  sides[2] == sides[0])
            return "isosceles";
        return "scalene";
    }
}
