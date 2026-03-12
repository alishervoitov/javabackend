//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello Backend Developer");
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int a = 5, b = 3;
//        System.out.println("Bitwise Operations:");
//        System.out.println("a & b = " + (a & b));
//        System.out.println("a | b = " + (a | b));
//        System.out.println("a ^ b = " + (a ^ b));
//    }
//}

//public class BasicArithmetic {
//    public static void main(String[] args) {
//        int a = 15;
//        int b = 4;
//
//        int sum = a + b;
//        System.out.println(a + " + " + b + " = " + sum); // 15 + 4 = 19
//
//        int difference = a - b;
//        System.out.println(a + " - " + b + " = " + difference); // 15 - 4 = 11
//
//        int product = a * b;
//        System.out.println(a + " * " + b + " = " + product); // 15 * 4 = 60
//
//        int quotient = a / b;
//        System.out.println(a + " / " + b + " = " + quotient); // 15 / 4 = 3
//
//        int remainder = a % b;
//        System.out.println(a + " % " + b + " = " + remainder); // 15 % 4 = 3
//    }
//}

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Test 1: " + Arrays.toString(result1)); // [0, 1]

    }
}