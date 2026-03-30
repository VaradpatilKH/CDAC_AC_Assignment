public class Q24_LargestDigit {
    public static void main(String[] args) {
        int number = 5839;
        int temp = Math.abs(number);
        int largest = 0;

        while (temp != 0) {
            int digit = temp % 10;
            if (digit > largest) largest = digit;
            temp /= 10;
        }

        System.out.println("Number : " + number);
        System.out.println("Largest digit : " + largest);
    }
}
