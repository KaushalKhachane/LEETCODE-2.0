import java.util.PriorityQueue;

class SeatManager {
    private PriorityQueue<Integer> availableSeats;

    public SeatManager(int n) {
        availableSeats = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            availableSeats.add(i);
        }
    }

    public int reserve() {
        if (!availableSeats.isEmpty()) {
            return availableSeats.poll();
        } else {
            return -1; // No available seats.
        }
    }

    public void unreserve(int seatNumber) {
        availableSeats.offer(seatNumber);
    }
}