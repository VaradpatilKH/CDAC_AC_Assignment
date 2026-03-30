import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mobile Number : ");
        String mobileNo = sc.next();

        System.out.println("Plan 1 : Rs. 199 -> 28 days validity");
        System.out.println("Plan 2 : Rs. 399 -> 56 days validity");
        System.out.println("Plan 3 : Rs. 599 -> 84 days validity");

        System.out.print("Enter Recharge Amount : ");
        int amount = sc.nextInt();

        String validity, planName;

        switch (amount) {
            case 199:
                planName = "Basic Plan";
                validity = "28 Days";
                break;
            case 399:
                planName = "Standard Plan";
                validity = "56 Days";
                break;
            case 599:
                planName = "Premium Plan";
                validity = "84 Days";
                break;
            default:
                planName = null;
                validity = null;
        }

        if (planName != null) {
            System.out.println("Mobile Number : " + mobileNo);
            System.out.println("Plan Name : " + planName);
            System.out.println("Amount Paid : Rs. " + amount);
            System.out.println("Validity : " + validity);
            System.out.println("Status: RECHARGE SUCCESSFUL");

        } else {
            System.out.println("Invalid recharge amount! Please choose Rs. 199, Rs. 399, or Rs. 599.");
        }


    }
}
