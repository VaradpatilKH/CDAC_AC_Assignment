public class Q25_SwapNumbers {
    public static void main(String[] args) {

        int a = 10, b = 20;
        System.out.println("Swap with third variable");
        System.out.println("Before: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After : a = " + a + ", b = " + b);

        int x = 100, y = 200;
        System.out.println("Swap without third variable");
        System.out.println("Before: x = " + x + ", y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After : x = " + x + ", y = " + y);
    }
}
