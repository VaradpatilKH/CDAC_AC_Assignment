
public class Q13 {


    String accountNumber;
    String name;
    double balance;


    Q13() {
        this.accountNumber = "N/A";
        this.name = "Unknown";
        this.balance = 0.0;
    }

    Q13(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + name);
        System.out.println("Balance : Rs."+ balance);
    }

    public static void main(String[] args) {
        Q13 acc1 = new Q13();
        System.out.println("Account 1");
        acc1.displayDetails();

        Q13 acc2 = new Q13("SBI001", "Aman Jha",  25000.00);
        Q13 acc3 = new Q13("HDFC02", "Varad Patil",  50000.00);

        System.out.println("Account 2 ");
        acc2.displayDetails();

        System.out.println("Account 3 ");
        acc3.displayDetails();

    }
}
