//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello Backend Developer");
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

//import java.util.Arrays;
//
//public class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//
//        // Test 1
//        int[] nums1 = {2, 7, 11, 15};
//        int target1 = 9;
//        int[] result1 = solution.twoSum(nums1, target1);
//        System.out.println("Test 1: " + Arrays.toString(result1)); // [0, 1]
//
//    }
//}

//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Solution {
//
//    public int[] twoSum(int[] nums, int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//
//            }
//        }
//        return null;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Array uzunligini kiriting: ");
//        int n = sc.nextInt();
//
//        int[] nums = new int[n];
//
//        System.out.println("Elementlarni kiriting:");
//
//        for (int i = 0; i < n; i++) {
//            nums[i] = sc.nextInt();
//        }
//
//        System.out.print("Target qiymatini kiriting: ");
//        int target = sc.nextInt();
//
//        Solution solution = new Solution();
//
//        int[] result = solution.twoSum(nums, target);
//
//        System.out.println("Natija: " + Arrays.toString(result));
//    }
//}

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Solution {

    public int lengthOfLongestSubstring(String s) {

        int res = 0;

        for (int i = 0; i < s.length(); i++) {

            Set<Character> charSet = new HashSet<>();

            for (int j = i; j < s.length(); j++) {

                if (charSet.contains(s.charAt(j))) {
                    break;
                }

                charSet.add(s.charAt(j));
            }

            res = Math.max(res, charSet.size());
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("String kiriting: ");
        String s = sc.nextLine();

        Solution solution = new Solution();

        int result = solution.lengthOfLongestSubstring(s);

        System.out.println("Eng uzun takrorlanmaydigan substring uzunligi: " + result);
    }
}