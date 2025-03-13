    import java.util.ArrayList;
    import java.util.List;

    public class Hall {
        private int num;
        private int capacity;
        private List<Showtime> showtimes;

        public Hall(int num, int capacity) {
            this.num = num;
            this.capacity = capacity;
            this.showtimes = new ArrayList<>();
        }

        public int getNum() {
            return num;
        }

        public int getCapacity() {
            return capacity;
        }

        public void addShowtime(Showtime showtime) {
            showtimes.add(showtime);
        }

        public void displayHallInfo() {
            System.out.println("Hall " + num + " (Capacity: " + capacity + ")");
            System.out.println("  Showtimes:");
            if (showtimes.isEmpty()) {
                System.out.println("    No showtimes available.");
            } else {
                for (Showtime showtime : showtimes) {
                    showtime.displayShowtimeInfo();
                }
            }
        }
    }
