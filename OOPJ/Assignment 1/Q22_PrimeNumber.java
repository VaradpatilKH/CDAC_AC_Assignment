public class Q22_PrimeNumber {
    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(number + (isPrime ? " is a Prime number." : " is NOT a Prime number."));
    }
}
