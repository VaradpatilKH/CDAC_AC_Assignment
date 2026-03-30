public class Q16_PalindromeNumber {
    public static void main(String[] args) {
        int number = 12321;
        int original = number;
        int reversed = 0;
        int temp = number;

        while (temp != 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }

        System.out.println("Number: " + number);
        if (original == reversed) {
            System.out.println(number + " is a Palindrome.");
        } else {
            System.out.println(number + " is NOT a Palindrome.");
        }
    }
}
