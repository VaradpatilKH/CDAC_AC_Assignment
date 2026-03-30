import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] expenses = new double[7];
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Enter daily expenses for the week:");
        for (int i = 0; i < 7; i++) {
            System.out.print("  " + days[i] + " : Rs. ");
            expenses[i] = sc.nextDouble();
        }

        double total   = 0;
        double highest = expenses[0];
        double lowest  = expenses[0];
        int highestDay = 0;

        for (int i = 0; i < 7; i++) {
            total += expenses[i];
            if (expenses[i] > highest) {
                highest    = expenses[i];
                highestDay = i;
            }
            if (expenses[i] < lowest) {
                lowest = expenses[i];
            }
        }

        double average = total / 7;

        System.out.println("       WEEKLY EXPENSE REPORT            ");

        for (int i = 0; i < 7; i++) {
            System.out.printf("%-12s : Rs. %8.2f%n", days[i], expenses[i]);
        }
        System.out.println("----------------------------------------");
        System.out.printf("%-12s : Rs. %8.2f%n", "Total",   total);
        System.out.printf("%-12s : Rs. %8.2f%n", "Average", average);
        System.out.printf("%-12s : Rs. %8.2f%n", "Highest", highest);
        System.out.printf("%-12s : Rs. %8.2f%n", "Lowest",  lowest);
        System.out.println("----------------------------------------");
        System.out.println("Highest expense occurred on: " + days[highestDay]);

    }
}
