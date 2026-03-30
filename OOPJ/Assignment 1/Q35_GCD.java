public class Q35_GCD {
    public static void main(String[] args) {
        int a = 48, b = 18;

        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        System.out.println("GCD of " + a + " and " + b + " = " + x);
    }
}
