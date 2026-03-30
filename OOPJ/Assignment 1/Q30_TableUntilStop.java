import java.util.Scanner;

public class Q30_TableUntilStop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for its table: ");
        int n = sc.nextInt();

        int i = 1;
        String cont = "y";

        while (cont.equalsIgnoreCase("y")) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
            System.out.print("Continue? (y/n): ");
            cont = sc.next();
        }

        System.out.println("Stopped at " + n + " x " + (i - 1));

    }
}
