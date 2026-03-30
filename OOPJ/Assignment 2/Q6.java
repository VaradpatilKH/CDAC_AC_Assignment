import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[10];
        int choice = 0;

        while (choice != 4){
            System.out.println("--- MENU ---");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book a Seat");
            System.out.println("3. Cancel a Seat");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Seat No. | Status");
                    for (int i = 0; i < seats.length; i++) {
                        System.out.println((i + 1) + "   |   " + (seats[i] ? "BOOKED" : "Available"));
                    }
                    break;

                case 2:
                    System.out.print("Enter seat number to book (1-10): ");
                    int bookSeat = sc.nextInt();

                    if (bookSeat < 1 || bookSeat > 10) {
                        System.out.println("Invalid seat number!");
                    } else if (seats[bookSeat - 1]) {
                        System.out.println("Seat " + bookSeat + " is already booked");
                    } else {
                        seats[bookSeat - 1] = true;
                        System.out.println("Seat " + bookSeat + " booked successfully");
                    }
                    break;

                case 3:
                    System.out.print("Enter seat number to cancel: ");
                    int cancelSeat = sc.nextInt();

                    if (cancelSeat < 1 || cancelSeat > 10) {
                        System.out.println("Invalid seat number.");
                    } else if (!seats[cancelSeat - 1]) {
                        System.out.println("Seat " + cancelSeat + " is Available.");
                    } else {
                        seats[cancelSeat - 1] = false;
                        System.out.println("Seat " + cancelSeat + " booking cancelled successfully.");
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }  

    }
}
