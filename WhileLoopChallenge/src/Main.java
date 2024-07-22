public class Main {

    public static void main(String[] args) {

        int n = 4;
        int f = 20;
        int t = 0;
        int y = 0;
        while (n <= f) {
            n ++;
            if (t == 5) {
                System.out.println("There are " + t + " even numbers and " + y + " odd numbers");
                break;
            }
            if(!isEvenNumber(n)) {
                y++;
                continue;
            }
                t++;

        }
//        do {
//            n++;
//            if (isEvenNumber(n)) {
//                System.out.println(n);
//            }
//        } while (n <= 20 );
//    }
        {
        }
    }
    public static boolean isEvenNumber(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
