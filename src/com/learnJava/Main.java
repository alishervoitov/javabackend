package com.learnJava;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
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
//
//import java.util.HashSet;
//import java.util.Set;
//import java.util.Scanner;
//
//public class Solution {
//
//    public int lengthOfLongestSubstring(String s) {
//
//        int res = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//
//            Set<Character> charSet = new HashSet<>();
//
//            for (int j = i; j < s.length(); j++) {
//
//                if (charSet.contains(s.charAt(j))) {
//                    break;
//                }
//
//                charSet.add(s.charAt(j));
//            }
//
//            res = Math.max(res, charSet.size());
//        }
//
//        return res;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("String kiriting: ");
//        String s = sc.nextLine();
//
//        Solution solution = new Solution();
//
//        int result = solution.lengthOfLongestSubstring(s);
//
//        System.out.println("Eng uzun takrorlanmaydigan substring uzunligi: " + result);
//    }
//}

//public class MedianOfTwoSortedArrays {
//
//    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int m = nums1.length;
//        int n = nums2.length;
//
//        int[] merged = new int[m + n];
//
//        int i = 0, j = 0, k = 0;
//
//        // Merge (ikki arrayni birlashtirish)
//        while (i < m && j < n) {
//            if (nums1[i] < nums2[j]) {
//                merged[k++] = nums1[i++];
//            } else {
//                merged[k++] = nums2[j++];
//            }
//        }
//
//        while (i < m) {
//            merged[k++] = nums1[i++];
//        }
//
//        while (j < n) {
//            merged[k++] = nums2[j++];
//        }
//
//        int total = m + n;
//
//        if (total % 2 == 1) {
//            return merged[total / 2];
//        } else {
//            return (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] nums1 = {1, 3};
//        int[] nums2 = {2};
//
//        double result = findMedianSortedArrays(nums1, nums2);
//        System.out.println("Median: " + result);
//    }
//}

//import java.util.*;
//public class GFG {
//    public static Integer findMin(List<Integer> list) {
//        if (list == null || list.isEmpty())
//            return Integer.MAX_VALUE;
//        List<Integer> sortedList = new ArrayList<>(list);
//        Collections.sort(sortedList);
//        return sortedList.get(0);
//    }
//    public static Integer findMax(List<Integer> list) {
//        if (list == null || list.isEmpty())
//            return Integer.MIN_VALUE;
//        List<Integer> sortedList = new ArrayList<>(list);
//        Collections.sort(sortedList);
//        return sortedList.get(sortedList.size() - 1);
//    }
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(44);
//        list.add(11);
//        list.add(22);
//        list.add(33);
//        System.out.println("Min: " + findMin(list));
//        System.out.println("Max: " + findMax(list));
//    }
//}

//package com.learnJava;
//
//public class ArrangeArray {
//
//    private int [] array={2,5,7,8,1,6,9};
//    private int len=array.length;
//    public static void main(String [] args)
//    {
//        ArrangeArray a=new ArrangeArray();
//        a.print();
//        a.arrange();
//        a.print();
//
//    }
//    public  void print()
//    {
//        for(int i=0;i<array.length;i++)
//        {
//            System.out.print(array[i] + " ");
//
//        }
//        System.out.println();
//    }
//    public void arrange()
//    {
//        int oddinx=1;
//        int evenidx=0;
//        while(true)
//        {
//            while(evenidx<len && array[evenidx]%2==0)
//            {
//                evenidx+=2;
//            }
//            while(oddinx<len && array[oddinx]%2==1)
//            {
//                oddinx+=2;
//            }
//            if (evenidx < len && oddinx < len)
//                swap (evenidx, oddinx);
//            else
//                break;
//
//        }
//
//    }
//    public void swap(int a,int b)
//    {
//        int tmp=array[b];
//        array[b]=array[a];
//        array[a]=tmp;
//    }
//}


//public class Solution {
//
//    int len = 0;
//    String res = "";
//
//    public String longestPalindrome(String s) {
//        for (int i = 0; i < s.length(); i++) {
//            palindrome(s, i, i);
//            palindrome(s, i, i + 1);
//        }
//        return res;
//    }
//
//    void palindrome(String s, int l, int r) {
//        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
//            l--;
//            r++;
//        }
//
//        int currentLen = r - l - 1;
//
//        if (currentLen > len) {
//            res = s.substring(l + 1, r);
//            len = currentLen;
//        }
//    }
//
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        String s = "babad";
//        System.out.println(sol.longestPalindrome(s));
//    }
//}


//public class Solution {
//    public boolean isPalindrome(int x) {
//        if (x < 0) {
//            return false;
//        }
//
//        long div = 1;
//        while (x >= 10 * div) {
//            div *= 10;
//        }
//
//        while (x != 0) {
//            if (x / div != x % 10) {
//                return false;
//            }
//            x = (int) (x % div) / 10;
//            div /= 100;
//        }
//
//        return true;
//    }
//}

//public class Solution {
//
//    public String intToRoman(int num) {
//        String[] sym = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
//        int[] val = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
//
//        StringBuilder res = new StringBuilder();
//        int idx = val.length - 1;
//
//        while (num > 0 && idx >= 0) {
//            if (num < val[idx]) {
//                idx--;
//            } else {
//                num -= val[idx];
//                res.append(sym[idx]);
//            }
//        }
//
//        return res.toString();
//    }
//
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//
//        int num = 1994;
//        String result = sol.intToRoman(num);
//
//        System.out.println("Roman: " + result);
//    }
//import java.util.Scanner;
//public class LinearCalculation{
//    public static double findCarsDistance(double car1speed, double car2speed, double initialDistance, double time){
//        double totalSpeed = car1speed + car2speed;
//        double distanceCars = totalSpeed * time;
//        return initialDistance + distanceCars;
//    }
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        double v1 = scanner.nextDouble();
//        double v2 = scanner.nextDouble();
//        double s = scanner.nextDouble();
//        double t = scanner.nextDouble();
//        double result = findCarsDistance(v1, v2, s, t);
//        System.out.println("Distance: " + result);
//        scanner.close();
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int a = 9;
//        int b = 4;
//        System.out.println("Addition = " + a + "+" + b + " = " + (a + b));
//        System.out.println("Subtraction = " + a + "-" + b + " = " + (a - b));
//        System.out.println("Multiplication = " + a + "*" + b  + " = " + (a * b));
//        System.out.println("Division = " + a + "/" + b + " = " + (a / b));
//        System.out.println("Remainder = " + a + "%" + b + " = " + (a % b) + "\n");
//
//        System.out.println("Unary minus = " + (-b));
//        System.out.print("Post-Increment a++ = " + (a++)); //we display 'a' and then a = a+1 (9+1=10);
//        System.out.println(" and Pre-Increment ++a = " + (++a)); //a=a+1 (10+1=11) and then display it
//
//        System.out.print("Post-Decrement b-- = " + (b--)); //we display 'b' and then b = b-1 (4-1=3);
//        System.out.println(" and Pre-Decrement --b = " + (--b)); //b=b-1 (3-1=2) and then display it
//    }
//}

//public class Main{
//    public static void main(String[] args) {
//        float a = 9.0f;
//        float b = 4;
//        System.out.println("Addition = " + a + "+" + b + " = " + (a + b));
//        System.out.println("Subtraction = " + a + "-" + b + " = " + (a - b));
//        System.out.println("Multiplication = " + a + "*" + b + " = " + (a * b));
//        System.out.print("Division = " + a + "/" + b + " = " + (a / b));
//        System.out.printf(" or %.4f \n", (a / b)); //show formatted result
//        System.out.println("Remainder = " + a + "%" + b + " = " + (a % b) + "\n");
//
//        System.out.println("Unary minus = " + (-b));
//        System.out.print("Post-Increment a++ = " + (a++)); // we display 'a' and then a = a+1 (9+1=10);
//        System.out.println(" and Pre-Increment ++a = " + (++a)); //a=a+1 (10+1=11) and then display it
//
//        System.out.print("Post-Decrement b-- = " + (b--)); // we display 'b' and then b = b-1 (4-1=3);
//        System.out.println(" and Pre-Decrement --b = " + (--b)); //b=b-1 (3-1=2) and then display it
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int a = 9;
//        float b = 7;
//        System.out.println("Addition = " + a + "+" + b + " = " + (a + b));
//        System.out.println("Subtraction = " + a + "-" + b + " = " + (a - b));
//        System.out.println("Multiplication = " + a + "*" + b + " = " + (a * b));
//        System.out.print("Division = " + a + "/" + b + " = " + (a / b));
//        System.out.printf(" or %.4f \n", (a / b)); //show formatted result
//        System.out.println("Remainder = " + a + "%" + b + " = " + (a % b)+"\n");
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int firstNumber = 5000000;
//        short secondNumber = 100;
//        secondNumber = (short)firstNumber;
//        System.out.println(secondNumber);
//    }
//}

//public class Main {
//    public static void main (String[] args){
//        int a = 9;
//        int b = 4;
//
//        if ( a < b ) {
//            System.out.println("This will never print because it is false." );
//        }
//        if ( a <= b ) {
//            System.out.println("This will never print because it is false." );
//        }
//        if ( a == 4 ) {
//            System.out.println("This will never print because it is false." );
//        }
//        if ( b == 4 ) {
//            System.out.println("The expression (b == 4) is true." );
//        }
//        if ( a != b ) {
//            System.out.println("The expression (a != b) is true." );
//        }
//        if ( a > b ) {
//            System.out.println("The expression (a > b) is true." );
//        }
//        if ( a >= b ) {
//            System.out.println("The expression (a >= b) is true." );
//        }
//        if ( (a != b) && (a > b) ) {
//            System.out.println("This will be printed because both conditions are true." );
//        }
//        if ( (a != b) || (a < b) || ( a == 4 ) ) {
//            System.out.println("This will be printed because one of the conditions is true." );
//        }
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int a = 3;
//        int b = 5;
//        if (a == b) {
//            System.out.println("a and b are equal");
//        } else {
//            System.out.println("a and b are not equal");
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int money = 10;
//        if(money == 5) {
//            System.out.println("You can buy a candy.");
//        } else if(money == 10) {
//            System.out.println("You can buy 2 candies or one bar of chocolate.");
//        } else if(money == 15) {
//            System.out.println("You can buy a cake, or one candy and one bar of chocolate, or three candies.");
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        String choice;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What do you prefer?");
//        System.out.println("1 a candy");
//        System.out.println("2 chocolate");
//        System.out.println("3 a cake ");
//        System.out.println("Enter your choice:");
//        choice = sc.nextLine();
//        switch(choice) {
//            case "1":
//                System.out.println("You need 5 dollars.");
//                break;
//            case "2":
//                System.out.println("You need 10 dollars.");
//                break;
//            case "3":
//                System.out.println("You need 15 dollars.");
//                break;
//            default:
//                System.out.println("Invalid choice");
//                break;
//        }
//    }
//}


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int amount;
//        int cost = 2;
//        int count = 0;
//        System.out.println("How much money does Mary have? ");
//        amount = sc.nextInt();
//        int sum = 0;
//        while((amount-sum) >= cost) {
//            count++;
//            sum += cost;
//        }
//        System.out.println("Mary can buy " + count + " candy(es).");
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int i;
//        int j;
//
//        for(i = 2; i<=3; i++) {  /*outer loop*/
//            System.out.println("Table of " + i);
//            for(j = 1; j<=10; j++) {  /*inner loop*/
//                System.out.println(i + " * " + j + " = " + (i*j));
//            }
//        }
//    }
//}

//import java.lang.Math;
//
//public class Main {
//    public static void main(String[] args) {
//        int num = 2;
//        int power = 3;
//        int resAmount = raiseNumber(num, power);
//        System.out.println(resAmount);
//    }
//
//    public static int raiseNumber(int num, int power) {
//        int resAmount = 0; // declaring local variable
//        resAmount = (int) Math.pow(num, power);// we can use library function
//        return resAmount; // returning the powered value
//    }
//}

//public class Main {
//    public double raiseNumber(double num, double power) {
//        return Math.pow(num,power);
//    }
//
//    public static void main(String[] args) {
//        Main obj = new Main(); // creating object for calling the method
//        double result = obj.raiseNumber(5,3); //first invoking the method
//        System.out.println("Result of (5^3): " + result);
//        System.out.println("Result of (10^4): " + obj.raiseNumber(10,4)); //second invoking
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        String str1 = "The weather is fine.";
//        char[] arrStr = {'s', 'u', 'n', 'n', 'y'};
//        String str2 = new String(arrStr);
//        System.out.println("Old string: " + str1);
//        String str1_changed = str1.replace("fine", str2.toUpperCase());
//        System.out.println("Changed string will be: " + str1_changed);
//        System.out.println("The length of the new string is " + str1_changed.length());
//    }
//}

//public class Func {
//    public static void main(String[] args) {
//
//    }
//
//    public static void method1() {
//        System.out.print("Hello, ");
//        method2();
//    }
//
//    public static void method2() {
//        System.out.print("world.");
//    }
//}

//public class Func {
//    public static void main(String[] args) {
//        int x;
//        x = method(3);
//        System.out.println(x);
//    }
//
//    public static int method(int x) {
//        if (x <= 0) return x;
//        else return x = x * method(x-1);
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    static int calculateGCD(int num1, int num2) {
//        if (num2 != 0)
//            return calculateGCD(num2, num1 % num2);
//        else
//            return num1;
//    }
//    public static void main(String[] args) {
//        System.out.print("Enter the first positive integer value: ");
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        System.out.print("Enter the second positive integer value: ");
//        int num2 = sc.nextInt();
//        System.out.print("The greatest common divisor of " + num1 + " and " + num2 + " is " + calculateGCD(num1, num2));
//        sc.close();
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        method2();
//    }
//
//    public static void method1() {
//        System.out.print("Hello, ");
//        method2();
//    }
//
//    public static void method2() {
//        System.out.print("world.");
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
//        System.out.println(method(10, 90));
//    }
//
//    public static double method(int x, int y) {
//        return Math.sqrt(x + y);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int x;
//        x = method(3);
//        System.out.println(x);
//    }
//
//    public static int method(int x) {
//        if (x <= 0)
//            return x;
//        else
//            return x = x + method(x - 1);
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static int square(int x) {
//        return x * x;
//    }
//    public static int modulus(int x) {
//        return Math.abs(x);
//    }
//    public static int calculate(int x) {
//        if (x>0) {
//            return square(x);
//        }
//        else if (x==0) {
//            return 0;
//        }
//        else {
//            return modulus(x);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("X ni kiriting: ");
//        int x = sc.nextInt();
//        int result = calculate(x);
//        System.out.println(result);
//        sc.close();
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static int sumofFibonachi(int n) {
//        int a = 0, b = 1;
//        int sum = 0;
//
//        for(int i = 1; i <= n; i++) {
//            sum += a;
//            int next = a + b;
//            a = b;
//            b = next;
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("N ni kiriting: ");
//        int n = sc.nextInt();
//        int result = sumofFibonachi(n);
//        System.out.println(result);
//        sc.close();
//    }
//}

//import java.util.Scanner;
//public class Main {
//    static int summodddigits(int n) {
//        int sum = 0;
//        while(n>0) {
//            int digit = n % 10;
//
//            if (digit % 2 != 0) {
//                sum += digit;
//            }
//            n /= 10;
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("N ni kiriting: ");
//        int n = sc.nextInt();
//        int result = summodddigits(n);
//        System.out.println(result);
//        sc.close();
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        int hulkMovie;
//        int ironManMovie;
//        int spiderManMovie;
//
//        hulkMovie = 12;
//        ironManMovie = 9;
//        spiderManMovie = 10;
//
//        System.out.print(hulkMovie + " movies with Hulk.\n");
//        System.out.print(ironManMovie + " movies with Iron Man.\n" );
//        System.out.print(spiderManMovie + " movies with Spider Man.\n");
//    }
//}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] filmography = new int[10];
        filmography[0] = 12;
        filmography[1] = 9;
        Scanner scanner = new Scanner(System.in);

        for(int i = 2; i < filmography.length; i++) {
            System.out.print("The number of movies with superhero num." + (i+1) + " is ");
            filmography[i] = scanner.nextInt();
        }
        int totalMovies = 0;
        for(int num : filmography) {
            totalMovies += num;
        }

        System.out.println("The total number of movies with all superheroes " + totalMovies);

        int min = filmography[0];
        for (int i = 1; i < filmography.length; i++) {
            if (filmography[i] < min)
                min = filmography[i];
        }
        System.out.println("The smallest filmography consists of " + min +" movie(s).");
    }
}






