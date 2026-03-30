public class Q15_CountDigits {
    public static void main(String[] args) {
        int number = 987654;
        int count = 0;
        int temp = Math.abs(number);

        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }

        System.out.println("Number  : " + number);
        System.out.println("Digits  : " + count);
    }
}
