import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary : ");
        double salary = sc.nextDouble();

        int salaryInt = (int) salary;

        float salaryFloat = (float) salary;

        System.out.println("--- Salary Conversion Results ---");
        System.out.println("Original (double) : " + salary);
        System.out.println("As int (explicit) : " + salaryInt);
        System.out.println("As float (cast)   : " + salaryFloat);

    }
}
