import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] menuItems = {"Chicken Burger", "Paneer Pizza", "French Fries", "Cold Drink", "Pasta"};
        double[] menuPrices = {80.0, 200.0, 60.0, 40.0, 150.0};

        double totalAmount = 0;
        int choice;

        do {
            System.out.println("--- FOOD MENU ---");
            for (int i = 0; i < menuItems.length; i++) {
                System.out.printf("%d. %-15s Rs. %.2f%n", (i + 1), menuItems[i], menuPrices[i]);
            }
            System.out.println("6. Done");
            System.out.print("Enter item number: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    double itemCost = menuPrices[choice - 1] * qty;
                    totalAmount += itemCost;
                    System.out.println(menuItems[choice - 1] + " x" + qty + " added. Cost: Rs. " + String.format("%.2f", itemCost));
                    break;
                case 6:
                    System.out.println("\nProcessing your order...");
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1-6.");
            }

        } while (choice != 6);

        double gst      = totalAmount * 0.05;
        double finalBill = totalAmount + gst;

        System.out.println(" FINAL BILL ");

        System.out.printf("%-30s Rs. %8.2f%n", "Sub Total:", totalAmount);
        System.out.printf("%-30s Rs. %8.2f%n", "GST:", gst);
        System.out.println("--------------------------------------------");
        System.out.printf("%-30s Rs. %8.2f%n", "Total Amount:", finalBill);
    }
}
