
public class Q11 {


    static int calculate(int a, int b) {
        return a + b;
    }

    static double calculate(double a, double b) {
        return a + b;
    }

    static int calculate(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        int result1 = calculate(10, 20);
        System.out.println( result1 + " [int + int]");

        double result2 = calculate(5.5, 4.3);
        System.out.println( result2 + " [double + double]");

        int result3 = calculate(10, 20, 30);
        System.out.println( result3 + " [int + int + int]");

    }
}
