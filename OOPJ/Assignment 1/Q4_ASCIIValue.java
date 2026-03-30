public class Q4_ASCIIValue {
    public static void main(String[] args) {
        char c = 'A';
        int ascii = (int) c;
        System.out.println("Character: " + c);
        System.out.println("ASCII Value: " + ascii);


        char[] chars = {'a', 'Z', '0', '9', ' '};
        for (char ch : chars) {
            System.out.println("'" + ch + "' -> " + (int) ch);
        }
    }
}
