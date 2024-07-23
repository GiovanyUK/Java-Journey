//Here is an in-depth explanation about the HINT's suggestion to use square root.
//
//
//
//Here's what the HINT says:
//Iterate Through Factors: Start a loop that iterates from 2 up to the square root of the input number.
//This is because the largest prime factor of a number cannot exceed its square root.
//
//
//
//1.  Now let's look at different solutions and why examine why the HINT says to use the square root.
//Here is a simple solution with one loop that is NOT optimized for code performance.
//It will iterate the entire range from 2 to number-1.
//If a divisor is found, we can use the same for loop to see if that divisor can be further divided by change number to the found divisor, i.e. number = number/i; or the shorthand number /= i;.
//The tricky part of this concise solution is to add i-- to negate the i++ that happens after the code block is normally executed since we are using the same loop to do additional check for divisors.
//This solution will pass the checker, but it can be optimized for better code performance.
//
//public class LargestPrime {
//    public static int getLargestPrime(int number) {
//        if (number < 2) {
//            return -1;
//        }
//
//        for (int i = 2; i < number; i++) {
//            if (number%i == 0) {
//                number /= i;
//                i--;
//            }
//        }
//        return number;
//    }
//}
//
//
//2.  Every whole number divisor has a "matching pair' divisor.
// For example, if number = 14 and the first divisor we find is 2, the "matching pair" divisor is number/i or 14/2 = 7, because 2 * 7 = 14.
// As we increment i upwards, the "matching pair" gets smaller.  14/3 = 4.66667 which is smaller than 7.
// That means, as we increment i, the "matching pair" gets smaller and thus we won't find a divisor between number/2 and number.
// With that knowledge, we can stop the loop at number/2 and we've just optimize the code performance by 50% because it always iterates half the number of time as the solution before.
//
//public class LargestPrime {
//    public static int getLargestPrime(int number) {
//        if (number < 2) {
//            return -1;
//        }
//
//        // for (int i = 2; i < number; i++) {
//        for (int i = 2; i <= number/2; i++) { // 50% better code performance
//            if (number%i == 0) {
//                number /= i;
//                i--;
//            }
//        }
//        return number;
//    }
//}
//
//
//3.  That brings us to the HINT's suggestion about square root.
// Remember, once we find a divisor, number become the "matching pair" divisor.
// So as the iterator increases, the "matching pair" divisor decreases.
// Eventually, we get to the middle so that both iterator and "matching pair" are the same number.
// That's why it's not necessary to iterate beyond Math.sqrt(number) because the "matching pair" would be the same value.
// So if we stop the for loop at Math.sqrt(number), the solution also passes the checker and is even more performant than the two above solutions.
// So yeah, the HINT wasn't clear and obvious about using "matching pair", but that was part of the solving challenge to figure out.
//
//public class LargestPrime {
//    public static int getLargestPrime(int number) {
//        if (number < 2) {
//            return -1;
//        }
//
//        for (int i = 2; i < number; i++) {
//            // for (int i = 2; i <= number/2; i++) {
//            // for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number%i == 0) {
//                number /= i;
//                i--;
//            }
//        }
//        return number;
//    }
//}
//Lastly, unrelated to code performance, the HINT also suggested to use continue.
// We can refactor the above code so that it uses a while loop with continue instead of the i-- which some students find confusing.
// Perhaps this solution is easier to understand the code logic.
// In this case with the while loop, continue "skips" the i++ increment, which is the same as what happens with a for loop, using i-- to negate
// when i++ is always executed by the loop.
//
//public class LargestPrime {
//    public static int getLargestPrime(int number) {
//        if (number < 2) {
//            return -1;
//        }
//
//        // for (int i = 2; i <= Math.sqrt(number); i++) {
//        //     if (number%i == 0) {
//        //         number /= i;
//        //         i--;
//        //     }
//        // }
//
//        int i = 2;
//        while (i <= Math.sqrt(number)) {
//            if (number%i == 0) {
//                number /= i;
//                continue; // skip the increment
//            }
//            i++; // increment when divisor isn't found
//        }
//        return number;
//    }
//}
//
//
//        Happy learning, cheers!