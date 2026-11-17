package Arrays;

import java.util.Arrays;

public class NativeArrays {
    public static void main(String[] args) {

        int[] scores = new int[5];
        System.out.println("Default Values: " + Arrays.toString(scores));

        int[] nums = {3, 7, 1, 9, 4};

        System.out.println("Default Values: " + Arrays.toString(nums));

        String[] names = new String[3];
        boolean[] flags = new boolean[3];
        double[] prices = new double[3];

        // System.out.println("String defaults:  " + Arrays.toString(names));
        // System.out.println("boolean defaults: " + Arrays.toString(flags));
        // System.out.println("double defaults:  " + Arrays.toString(prices));

        // System.out.println("\nFirst element nums[0]: " + nums[0]);
        // System.out.println("Length (a field, no parentheses): " + nums.length);
        // System.out.println("Last element nums[nums.length - 1]: " + nums[nums.length - 1]);

        // nums[2] = 6;
        // // Out of Bounds
        // // System.out.println(nums[5]);
        // // System.out.println(nums[-1]);

        // for (int i = 0; i < nums.length; i++) {
        //     System.out.println("Index " + i + " -> value " + nums[i]);
        // }
        // // Enchanced loop: Gives value but not index
        // for (int value : nums) {
        //     System.out.println("Enhanced Value " + value);
        // }

        //  // Challenge 1: Double It
        // // Multiply every element by 2, then print the array.
        // int[] challengeOne = {3, 7, 1, 9, 4};
        // // TODO: your loop here

        // for (int i = 0; i< challengeOne.length; i++) {
        //     System.out.println("index " + i + " Value " + challengeOne[i] * 2);
        // }

        //  // Challenge 2: Every Other
        // // Use i += 2 to add 10 to only the elements at even indexes, then print.
        // int[] challengeTwo = {3, 7, 1, 9, 4};
        // // TODO: your loop here

        // for (int i = 0; i < challengeTwo.length; i+= 2) {
        //     System.out.println("Value " + i + "changed " + challengeTwo[i] + 10);
        // }
        // // Challenge 3: Replace Negatives
        // // Change every negative number to 0, then print.
        // int[] temps = {5, -3, 8, -1, 0, -7};
        // // TODO: your loop here
        // // HINTS: use an if statement in each pass of the loop
        // // redefine element value like this: nums[2] = 6;

        // for (int i = 0; i < temps.length; i++) {
        //     if (temps[i] < 0) {
        //         temps[i] = 0;
        //     }
        //     System.out.println("temperature " + temps[i]);
        // }
        //   // Challenge: Curve the Scores
        // int[] scores1 = {85, 62, 97, 45, 70, 99};
        // // Add 5 to every score, but no score can go above 100. 
        // for (int i = 0; i < scores1.length; i ++) {
        //     if (scores1[i] >= 95) {
        //         scores[i] = 100;
        //     }
        //     else {
        //         scores[i] += 5;
        //     }
        //     System.out.println("Scores: " + scores1[i]);
        // }


        // Challenge: Find the Highest
        int[] temps1 = {58, 71, 64, 80, 77, 69};
        // Use a loop to find the highest temperature and the index it's at, then print both. Use Math.max()!
        // for (int i = 0; i < scores.length; i++) {
        //     int max = Math.max(temps1[0], temps1.length);
        //     System.out.println("max: " + max);
        // }
        int highest = temps1[0];
        int highestIndex = 0;
        for ( int i = 1; i < temps1.length; i++) {
            highest = Math.max(highest, temps1[i]);
            if ( highest == temps1[i]) {
                highestIndex = i;
            }
            System.out.println("Highest: " + highest + " Index: " + highestIndex);
        }

        // Challenge: Random Fill
        // int[] nums = new int[10];
        // Loop 10 times. Each time, use Math.random() to get a random number from 1 to 100 and a random index from 0 to 9, then put the number at that index. Print the array. 
        // Then answer: why are some spots still 0?
    }

}
