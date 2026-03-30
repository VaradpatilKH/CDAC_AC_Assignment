public class Q3_TypeConversion {
    public static void main(String[] args) {

        int i = 42;
        double d = i;
        System.out.println("int to double: " + i + " -> " + d);

        double x = 9.99;
        int y = (int) x;
        System.out.println("double to int: " + x + " -> " + y + " (decimal truncated)");
    }
}
