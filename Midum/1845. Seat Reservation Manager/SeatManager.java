class SeatManager {

    int[] seats;

    public SeatManager(int n) {
        seats = new int[n];
    }

    public int reserve() {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                seats[i] = 1;
                return i;
            }
        }
        return -1;
    }

    public void unreserve(int seatNumber) {
        seats[seatNumber - 1] = 0;
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */