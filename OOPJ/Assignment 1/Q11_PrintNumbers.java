public class Q11_PrintNumbers {
    public static void main(String[] args) {
        System.out.println("Using for loop:");
        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nUsing while loop:");
        int i = 1;
        while (i <= 50) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}
