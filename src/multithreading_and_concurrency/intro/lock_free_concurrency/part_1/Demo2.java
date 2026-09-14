package multithreading_and_concurrency.intro.lock_free_concurrency.part_1;

import java.util.concurrent.atomic.AtomicReference;

public class Demo2 {
    static void main() throws Exception{
        SeatBooking obj = new SeatBooking();

        Thread t1 = Thread.ofPlatform().start(() -> obj.bookSeat("Ronno"));
        Thread t2 = Thread.ofPlatform().start(() -> obj.bookSeat("Chiku"));
        Thread t3 = Thread.ofPlatform().start(() -> obj.bookSeat("Sayan Pal"));
        Thread t4 = Thread.ofPlatform().start(() -> obj.bookSeat("Dip"));

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        try {Thread.sleep(0, 2000);} catch (InterruptedException _) {}

        System.out.println(obj.seat);
    }
}

class SeatBooking {
//    String seat = new String("EMPTY");
    AtomicReference<String> seat = new AtomicReference<>("EMPTY");

    boolean bookSeat(String name) {
        String currentValue = seat.get();

        if (!currentValue.equals("EMPTY")) {
            return false;
        }
        return seat.compareAndSet("EMPTY", name);
//        if (seat.equals("EMPTY")) {
//            seat = name;
//            return true;
//        }
//        return false;
    }
}
// compare and set operation