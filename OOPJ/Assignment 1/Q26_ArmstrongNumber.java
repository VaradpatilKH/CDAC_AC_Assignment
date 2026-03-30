public class Q26_ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int temp = number;
        int digits = String.valueOf(number).length();
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        System.out.println("Number: " + number);
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
    }
}
