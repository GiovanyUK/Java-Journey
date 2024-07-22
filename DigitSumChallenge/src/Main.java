public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(1001001));
    }
    public static int sumDigits (int number) {
        if (number < 0) {
            return -1;
        }
        int n = 0;
        while (number % 10 > 0 || number > 0) {
            n = n + number % 10;
            number = number / 10;
        }
        return n;
    }
}
