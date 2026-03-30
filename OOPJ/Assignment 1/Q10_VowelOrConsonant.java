public class Q10_VowelOrConsonant {
    public static void main(String[] args) {
        char c = 'E';
        c = Character.toLowerCase(c);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("'" + Character.toUpperCase(c) + "' is a Vowel.");
        } else if (c >= 'a' && c <= 'z') {
            System.out.println("'" + Character.toUpperCase(c) + "' is a Consonant.");
        } else {
            System.out.println("'" + c + "' is not an alphabet.");
        }
    }
}
