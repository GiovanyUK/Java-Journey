//First, I know you know how recursion works, but let's see an example where I keep calling the method but change the argument by subtracting 1 until it is 0, which stops the recursion.  In this program, we will count down from 5 down to 0.  The key here is to understand how we can reduce the argument from 5 down to 0 using recursion.
//
//public class Main {
//    public static void main(String[] args) {
//        countDown(5);
//    }
//
//    static void countDown(int num){
//        if(num >= 0){
//            System.out.println("count = "+ num);
//            countDown(num - 1); // recursive call, decrement argument
//        }
//    }
//}
//
//// count = 5
//// count = 4
//// count = 3
//// count = 2
//// count = 1
//// count = 0
//
//
//Now that we've reviewed that, let's take a look at the FlourPacker program, but with two while loops.  Basically, the logic here is if we call canPack(2, 2, 11) we will loop through the first while loop and subtract 5 from goal for each bigCount.  Then we use the second while loop to subtract 1 from goal for each smallCount.  At the end of the two loops, if goal is 0, then that means that we had enough supply of bigCount and smallCount to fill the goal.  Hopefully you understand the code logic of how this solution works...and can kind of see where I'm going with the loops and recursion.  But hold that thought.
//
//public class FlourPacker {
//    public static boolean canPack(int bigCount, int smallCount, int goal){
//        if (goal < 0) {
//            return false;
//        }
//
//        while (goal >= 5 && bigCount > 0) {
//            goal -= 5; // subtract 5 from goal for each bigCount
//            bigCount--; // decrement bigCount by 1 for each iteration
//        }
//
//        while (goal > 0 && smallCount > 0) {
//            goal -= 1; // subtract 1 from goal for each smallCount
//            smallCount--;
//        }
//
//        return goal == 0;
//    }
//}
//
//
//Now, let's take a look at my recursion solution, but this time, I'll refactor and use the long form so you can see that there are 3 conditions we are evaluating.
//
//public class FlourPacker {
//    public static boolean canPack(int bigCount, int smallCount, int goal){
//        if (bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        }
//        // return goal == 0 || canPack(bigCount-1, smallCount, goal-5) || canPack(0, smallCount-1, goal-1);
//        if (goal == 0) {
//            return true;
//        } else if (canPack(bigCount-1, smallCount, goal-5)) {
//            return true;
//        } else if (canPack(0, smallCount-1, goal-1)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}
//
//
//Recall in my first count down recursion example, how we can just keep calling the same method over and over, and reduce the value of the argument.  Well let's focus on bigCount first, since that's what we did in the above solution with the first while loop.  So what we want to do is to call else if (canPack(bigCount-1, smallCount, goal-5))  so that it removes 5 from goal for each bigCount.  Using the same example as before, if we call canPack(2, 2, 11), we can expect to subtract 5 from goal for each bigCount.
//
//start with (2, 2, 11)
//
//then first recursion (1, 2, 6)
//
//then second recursion (0, 2, 1)
//
//then in the third recursion (-1, 2, -4) will not pass the validation and return false so this else if condition won't be true and will move down to the next else if (canPack(0, smallCount-1, goal-1)) statement.
//
//Since the previous condition wasn't true, we will now call the second else if condition and pass through the arguments where we subtract 1 goal for each smallCount.
//
//start from previous (0, 2, 1) and subtract 1 goal for each smallCount, so the recursion call is canPack(0, 1, 0).  Since goal == 0, return true meaning it can pack.
//
//
//
//Here is the refactored solution with a println statement to see what value each argument is through each recursion iterations.  Basically, each recursive call (either to remove 5 from goal for each bigCount or remove 1 from goal for each smallCount ) is similar to the solution with 2 while loops.  We just keep calling the recursion until goal is 0 and return true, otherwise return false.
//
//public class FlourPacker {
//    public static void main(String args[]) {
//        System.out.println("canPack(2, 2, 11) = " + canPack(2, 2, 11));
//    }
//
//    public static boolean canPack(int bigCount, int smallCount, int goal){
//        System.out.println("(" + bigCount + ", " + smallCount + ", " + goal + ")");
//        if (bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        }
//
//        if (goal == 0) {
//            return true;
//        } else if (canPack(bigCount-1, smallCount, goal-5)) { // (1, 2, 6) and (0, 2, 1) and (-1, 0, -4) -> false
//            return true;
//        } else if (canPack(0, smallCount-1, goal-1)) { // (0, 1, 0) -> true
//            return true;
//        } else {
//            return false;
//        }
//    }
//}
//
//// output:
//// (2, 2, 11)
//// (1, 2, 6)
//// (0, 2, 1)
//// (-1, 2, -4)
//// (0, 1, 0)
//// canPack(2, 2, 11) = true
//
//
//Hope that clarifies how this coding exercise using recursion works, and how it's much more concise and cleaner than the solution using two while loops.