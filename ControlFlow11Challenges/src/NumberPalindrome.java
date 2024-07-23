public class NumberPalindrome {
    // write code here
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222)); // output true
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temp = number;
        int times = 0;
        while (number != 0) {
            times++;
            int lastDigit = number % 10;
            if (times > 1) {
                reverse = reverse * 10;
            }
            reverse += lastDigit;
            number = number / 10;
        }
        return reverse == temp;
    }
}