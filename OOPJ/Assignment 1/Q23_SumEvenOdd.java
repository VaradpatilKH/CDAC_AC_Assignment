import java.util.Scanner;

public class Q23_SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sumEven = 0, sumOdd = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) sumEven += i;
            else sumOdd += i;
        }

        System.out.println("Sum of Even numbers (1 to " + n + ") = " + sumEven);
        System.out.println("Sum of Odd  numbers (1 to " + n + ") = " + sumOdd);

    }
}
