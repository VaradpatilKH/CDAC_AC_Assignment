import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Initial Amount: ");
        double bal = sc.nextDouble();
        int choice = 0;

        while(choice != 4){
            System.out.print("1. Check Balance\r\n" + //
                                "2. Deposit Money\r\n" + //
                                "3. Withdraw Money\r\n" + //
                                "4. Exit\n"+
                                "Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance :"+ bal);
                    break;
                case 2:
                    System.out.print("Enter Amount: ");
                    double dep = sc.nextDouble();
                    bal += dep;
                    System.out.println("Your balance :"+ bal);
                    break;
                case 3:
                    System.out.print("Enter Amount: ");
                    double with = sc.nextDouble();
                    if(with > bal){
                        System.out.println("Insufficent Balance");
                    }
                    else{
                        bal -= with;
                    }
                    break;
                case 4:
                    break;
                default:
                        System.out.println("Invalid Choice");
                    break;
            }
        }
        sc.close();
    }
    
}
