package dsa.data_structures.arrays;

// https://leetcode.com/problems/design-parking-system/description/
public class Design_Parking_System {
    static void main() {
        ParkingSystem obj = new ParkingSystem(2, 1, 0);
        boolean param_1 = obj.addCar(3);
        System.out.println(param_1);
    }
}

class ParkingSystem {
    private final int[] slots;

    public ParkingSystem(int big, int medium, int small) {
        slots = new int[] {big, medium, small};
    }

    public boolean addCar(int carType) {
        if (slots[carType - 1] > 0) {
            slots[carType - 1]--;
            return true;
        }
        return false;
    }
}
