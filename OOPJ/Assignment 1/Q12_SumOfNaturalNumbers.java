import java.util.Scanner;

public class Q12_SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers = " + sum);
        System.out.println("Formula (n*(n+1)/2) = " + (n * (n + 1) / 2));

    }
}
