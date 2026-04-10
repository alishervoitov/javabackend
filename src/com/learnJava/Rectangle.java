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


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] filmography = new int[10];
//        filmography[0] = 12;
//        filmography[1] = 9;
//        Scanner scanner = new Scanner(System.in);
//
//        for(int i = 2; i < filmography.length; i++) {
//            System.out.print("The number of movies with superhero num." + (i+1) + " is ");
//            filmography[i] = scanner.nextInt();
//        }
//        int totalMovies = 0;
//        for(int num : filmography) {
//            totalMovies += num;
//        }
//
//        System.out.println("The total number of movies with all superheroes " + totalMovies);
//
//        int min = filmography[0];
//        for (int i = 1; i < filmography.length; i++) {
//            if (filmography[i] < min)
//                min = filmography[i];
//        }
//        System.out.println("The smallest filmography consists of " + min +" movie(s).");
//    }
//}



import java.util.Scanner;
//
//class Node {
//    int dataElement;
//    Node next;
//};
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Children's game");
//
//        Node list;
//        Node first = new Node(); /* Dynamic memory allocation */
//        Node second = new Node();
//        Node third = new Node();
//        Node fourth = new Node();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("The leader thinks ");
//        int numberFirst = scanner.nextInt();
//
//        first.dataElement = numberFirst; // Assigning data to the first node
//        first.next = second; // Linking the first node with the second node
//
//        int numberNext = numberFirst + 5;
//        second.dataElement = numberNext; // Assigning data to the second node
//        second.next = third; // Linking the second node with the third node
//
//        numberNext += 4;
//        third.dataElement = numberNext; // Assigning data to the third node
//        third.next = fourth; // Linking the third node with the fourth node
//
//        numberNext -= 9;
//        fourth.dataElement = numberNext; // Assigning data to the fourth node
//        list = first; // Assigning a reference to a list
//
//        displayList(list);
//        if (numberFirst == numberNext) {
//            System.out.println("Children win!");
//        } else {
//            System.out.println("The leader wins");
//        }
//    }
//
//    public static void displayList(Node element) { // Method to display the linked list
//        while (element.next != null) {
//            System.out.printf("%d\n", element.dataElement);
//            element = element.next;
//        }
//    }
//}


//import java.util.Scanner;

//class Stack {
//    private int[] elem;
//    private int top;
//
//    public Stack() {
//        elem = new int[10];
//        top = -1;
//    }
//
//    public void push(int value) {
//        if (top < (elem.length -1)) {
//            top++;
//            elem[top] = value;
//        } else {
//            System.out.printf("The stack is full, the number of elements is: %d !\n", elem.length);
//        }
//    }
//
//    public int pop() {
//        if (top >= 0 ) {
//            int data = elem[top];
//            elem[top] = 0;
//            top--;
//            return data;
//        } else {
//            System.out.printf("The stack is empty.\n");
//            return 0;
//        }
//    }
//
//    public boolean isEmpty() {
//        return top < 0 ? true : false;
//    }
//
//    int getCount() {
//        return top + 1;
//    }
//
//    public void displayStack() {
//        for (int i = top; i >= 0; i--) {
//            System.out.println(elem[i]);
//        }
//    }
//}
//
//
//public class DemoStack {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        Stack stack = new Stack();
//        System.out.print("Enter the number of items in the stack: ");
//        int number = scanner.nextInt();
//        for (int i = 0; i < number; i++) {
//            System.out.printf("Enter an element %d: ", i);
//            stack.push(scanner.nextInt());
//        }
//
//        System.out.println("Size of the stack is " + stack.getCount());
//        stack.displayStack();
//
//        while ( !stack.isEmpty() ) {
//            System.out.println("Pop an element " + stack.pop());
//            System.out.println(stack.getCount() + " items left on the stack");
//        }
//    }
//}

//import java.util.Scanner;
//
//class Queue {
//    private int[] queItems;
//    private int last;
//
//    public Queue() { //initialization of the queue
//        queItems = new int[15];
//        last = -1;
//    }
//
//    public void pushBack(int value) { //placing value at the end of the queue
//        if(last < queItems.length - 1) {
//            last++;
//            queItems[last] = value;
//        } else {
//            System.out.println("The queue is full!");
//        }
//    }
//
//    public int popFront() { //remove element from queue
//        if( isEmpty() ) {
//            System.out.println("The queue is empty!");
//            return 0;
//        } else {
//            int first = queItems[0];
//            for (int i = 0; i < last; i++) {
//                queItems[i] = queItems[i+1];
//            }
//            queItems[last] = 0;
//            last--;
//            return first;
//        }
//    }
//
//    public boolean isEmpty() {
//        return last < 0 ? true : false;
//    }
//
//    public void displayQueue() {
//        if( isEmpty() ) {
//            System.out.println("The queue is empty!");
//            return;
//        }
//        for (int i = 0; i <= last; i++) {
//            System.out.print(queItems[i] + " ");
//        }
//        System.out.println();
//    }
//}
//
//public class DemoQueue {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        Queue queue = new Queue();
//        queue.displayQueue();
//
//        for (int i = 0; i < 8; i++) {
//            System.out.print("Enter an element: ");
//            queue.pushBack(scanner.nextInt());
//        }
//        System.out.println();
//        queue.displayQueue();
//
//        while ( !queue.isEmpty() ) {
//            int value = queue.popFront();
//            System.out.printf("The element %d was removed.\n", value);
//            queue.displayQueue();
//        }
//    }
//}


//public class TreeNode {
//    int data; // node value
//    TreeNode left; // left child
//    TreeNode right; // right child
//
//}
//void visitNode(TreeNode node) {             // tree traversal in prefix form
//    if (node != null) {                     // Until An Empty Node Is Found
//        System.out.print(node.data + " ");  // Display the root of the tree
//        visitNode(node.left);               // Recursive function for the left subtree
//        visitNode(node.right);              // Recursive function for the right subtree
//    }
//}

//class Tree {
//    private TreeNode root;
//
//    private class TreeNode {
//        int data;
//        TreeNode left;
//        TreeNode right;
//
//        public TreeNode(int data) {
//            this.data = data;
//        }
//    }
//
//    public void showTree() {
//        visitNode(root);
//        System.out.println();
//    }
//    private void visitNode(TreeNode node) { // Display the tree in infix form
//        if(node != null) {
//            visitNode(node.left);
//            System.out.print(node.data + " ");
//            visitNode(node.right);
//        }
//    }
//
//    public void addData(int value) {
//        TreeNode newNode = new TreeNode(value);
//        if(root == null) {
//            root = newNode;
//            return;
//        } else {
//            addNode(root, newNode);
//        }
//    }
//    private TreeNode addNode(TreeNode current, TreeNode newNode) {
//        if (current == null) {
//            return newNode;
//        } else if(newNode.data < current.data) {
//            current.left = addNode(current.left, newNode);
//        } else if (newNode.data > current.data) {
//            current.right = addNode(current.right, newNode);
//        }
//        return current;
//    }
//}
//
//public class DemoTree {
//    public static void main(String[] args) {
//        Tree tree = new Tree();
//
//        tree.addData(8);
//        tree.addData(6);
//        tree.addData(2);
//        tree.addData(1);
//        tree.addData(3);
//        tree.addData(7);
//        tree.addData(11);
//
//        tree.showTree();
//    }
//}


//import java.util.Scanner;
//import java.util.Arrays;
//
//public class IntArrayUtil {
//
//    public static void swapEven(int[] array) {
//        int left = 0;
//        int right = array.length - 1;
//
//        while (left < right) {
//            if (array[left] % 2 == 0 && array[right] % 2 == 0) {
//                int temp = array[left];
//                array[left] = array[right];
//                array[right] = temp;
//            }
//            left++;
//            right--;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Array uzunligini kiriting: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.println("Elementlarni kiriting:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Before: " + Arrays.toString(arr));
//
//        swapEven(arr);
//
//        System.out.println("After:  " + Arrays.toString(arr));
//
//        sc.close();
//    }
//}



//import java.util.Arrays;
//
//public class IntArrayUtil {
//
//    public static void swapEven(int[] array) {
//        if (array == null || array.length == 0) return;
//
//        int left = 0;
//        int right = array.length - 1;
//
//        while (left < right) {
//            // check if both are even
//            if (array[left] % 2 == 0 && array[right] % 2 == 0) {
//                int temp = array[left];
//                array[left] = array[right];
//                array[right] = temp;
//            }
//            left++;
//            right--;
//        }
//    }
//
//    public static void main(String[] args) {
//        {
//            int[] array = null;
//            swapEven(array);
//            System.out.println(Arrays.toString(array));
//        }
//        {
//            int[] array = new int[] {};
//            swapEven(array);
//            System.out.println(Arrays.toString(array));
//        }
//        {
//            int[] array = new int[] { 10, 5, 3, 4 };
//            swapEven(array);
//            System.out.println(Arrays.toString(array));
//        }
//        {
//            int[] array = new int[] { 100, 2, 3, 4, 5 };
//            swapEven(array);
//            System.out.println(Arrays.toString(array));
//        }
//        {
//            int[] array = new int[] { 100, 2, 3, 45, 33, 8, 4, 54 };
//            swapEven(array);
//            System.out.println(Arrays.toString(array));
//        }
//    }
//
//}

//import java.util.Arrays;
//public class IntArrayUtil {
//
//    public static int maximumDistance(int[] array) {
//        if (array == null || array.length == 0) {
//            return 0;
//        }
//
//        int maxVal = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > maxVal) {
//                maxVal = array[i];
//            }
//        }
//
//        int firstIndex = -1;
//        int lastIndex = -1;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == maxVal) {
//                if (firstIndex == -1) {
//                    firstIndex = i;
//                }
//                lastIndex = i;
//            }
//        }
//
//        return lastIndex - firstIndex;
//    }
//
//    public static void main(String[] args) {
//        {
//            int[] array = null;
//            System.out.println("result = " + maximumDistance(array));
//        }
//        {
//            int[] array = new int[] {};
//            System.out.println("result = " + maximumDistance(array));
//        }
//        {
//            int[] array = new int[] { 4, 100, 3, 4 };
//            System.out.println("result = " + maximumDistance(array));
//        }
//        {
//            int[] array = new int[] { 5, 50, 50, 4, 5 };
//            System.out.println("result = " + maximumDistance(array));
//        }
//        {
//            int[] array = new int[] { 5, 350, 350, 4, 350 };
//            System.out.println("result = " + maximumDistance(array));
//        }
//        {
//            int[] array = new int[] { 10, 10, 10, 10, 10 };
//            System.out.println("result = " + maximumDistance(array));
//        }
//    }
//
//}

//import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Massiv elementlari sonini kiriting: ");
//        int n = scanner.nextInt();
//
//        // Bo'sh massiv holatini tekshirish
//        if (n <= 0) {
//            System.out.println("Natija: 0");
//            return;
//        }
//
//        int[] nums = new int[n];
//
//        // 2. Massiv elementlarini birma-bir kiritish
//        System.out.println(n + " ta sonni kiriting:");
//        for (int i = 0; i < n; i++) {
//            nums[i] = scanner.nextInt();
//        }
//
//        // 3. Hisoblash metodini chaqirish
//        int result = IntArrayUtil.maximumDistance(nums);
//
//        System.out.println("Natija (maksimal qiymatlar orasidagi masofa): " + result);
//    }
//}
//
//class IntArrayUtil {
//    public static int maximumDistance(int[] array) {
//        if (array == null || array.length == 0) {
//            return 0;
//        }
//
//        int maxVal = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > maxVal) {
//                maxVal = array[i];
//            }
//        }
//
//        // Birinchi va oxirgi indekslarni topish
//        int firstIndex = -1;
//        int lastIndex = -1;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == maxVal) {
//                if (firstIndex == -1) {
//                    firstIndex = i;
//                }
//                lastIndex = i;
//            }
//        }
//
//        return lastIndex - firstIndex;
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // Konsoldan ma'lumot kiritish uchun Scanner
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("--- Massiv tahlili dasturi ---");
//        System.out.print("Massiv elementlari sonini kiriting: ");
//        int n = scanner.nextInt();
//
//        // Massivni yaratish
//        int[] numbers = new int[n];
//
//        // Elementlarni kiritish
//        System.out.println(n + " ta sonni kiriting:");
//        for (int i = 0; i < n; i++) {
//            System.out.print((i + 1) + "-element: ");
//            numbers[i] = scanner.nextInt();
//        }
//
//        // Natijalarni hisoblash va chiqarish
//        System.out.println("\n--- Natijalar ---");
//
//        int frequent = findMostFrequent(numbers);
//        System.out.println("Eng ko'p takrorlangan son: " + frequent);
//
//        int maxDist = findMaximumDistance(numbers);
//        System.out.println("Maksimal qiymatlar orasidagi masofa: " + maxDist);
//    }
//
//    /**
//     * Eng ko'p takrorlangan elementni topuvchi metod
//     */
//    public static int findMostFrequent(int[] array) {
//        if (array.length == 0) return 0;
//
//        int mostFrequentElement = array[0];
//        int maxCount = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            int currentCount = 0;
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    currentCount++;
//                }
//            }
//
//            // Agar yangi rekord o'rnatilsa, saqlab qolamiz
//            if (currentCount > maxCount) {
//                maxCount = currentCount;
//                mostFrequentElement = array[i];
//            }
//        }
//        return mostFrequentElement;
//    }
//
//    /**
//     * Eng katta sonning birinchi va oxirgi indeksi orasidagi masofa
//     */
//    public static int findMaximumDistance(int[] array) {
//        if (array.length == 0) return 0;
//
//        // 1. Max topish
//        int maxVal = array[0];
//        for (int x : array) {
//            if (x > maxVal) maxVal = x;
//        }
//
//        // 2. Birinchi va oxirgi pozitsiyalar
//        int first = -1;
//        int last = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == maxVal) {
//                if (first == -1) first = i;
//                last = i;
//            }
//        }
//        return last - first;
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("=== Juft va Toq sonlar tahlili ===");
//        System.out.print("Massiv o'lchamini kiriting: ");
//        int n = scanner.nextInt();
//
//        int[] numbers = new int[n];
//        System.out.println(n + " ta sonni kiriting:");
//        for (int i = 0; i < n; i++) {
//            System.out.print((i + 1) + "-son: ");
//            numbers[i] = scanner.nextInt();
//        }
//
//        // Metodlarni chaqirish
//        int evenSum = calculateEvenSum(numbers);
//        int oddSum = calculateOddSum(numbers);
//        int difference = Math.abs(evenSum - oddSum); // Musbat farqni olish
//
//        // Natijalarni chiqarish
//        System.out.println("\n--- Natija ---");
//        System.out.println("Juft sonlar yig'indisi: " + evenSum);
//        System.out.println("Toq sonlar yig'indisi: " + oddSum);
//        System.out.println("Ular orasidagi farq: " + difference);
//    }
//
//    /**
//     * Juft sonlar yig'indisini hisoblovchi metod
//     */
//    public static int calculateEvenSum(int[] array) {
//        int sum = 0;
//        for (int num : array) {
//            if (num % 2 == 0) { // Juftlikka tekshirish
//                sum += num;
//            }
//        }
//        return sum;
//    }
//
//    /**
//     * Toq sonlar yig'indisini hisoblovchi metod
//     */
//    public static int calculateOddSum(int[] array) {
//        int sum = 0;
//        for (int num : array) {
//            if (num % 2 != 0) { // Toqlikka tekshirish
//                sum += num;
//            }
//        }
//        return sum;
//    }
//}


//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("=== Massivni teskari qilish dasturi ===");
//        System.out.print("Massiv elementlari sonini kiriting: ");
//        int n = scanner.nextInt();
//
//        int[] numbers = new int[n];
//        System.out.println(n + " ta sonni kiriting:");
//        for (int i = 0; i < n; i++) {
//            System.out.print((i + 1) + "-element: ");
//            numbers[i] = scanner.nextInt();
//        }
//
//        System.out.println("\nAsl holati: " + Arrays.toString(numbers));
//
//        // Massivni teskari qilish metodini chaqiramiz
//        reverseArray(numbers);
//
//        System.out.println("Teskari holati: " + Arrays.toString(numbers));
//    }
//
//    /**
//     * Massiv elementlarini o'z joyida (in-place) teskari qiluvchi metod
//     */
//    public static void reverseArray(int[] array) {
//        int left = 0;               // Massiv boshi
//        int right = array.length - 1; // Massiv oxiri
//
//        while (left < right) {
//            // Elementlar o'rnini almashtirish (Swap)
//            int temp = array[left];
//            array[left] = array[right];
//            array[right] = temp;
//
//            // Ko'rsatkichlarni markazga qarab suramiz
//            left++;
//            right--;
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("=== Ikkinchi eng katta elementni topish ===");
//        System.out.print("Massiv o'lchamini kiriting: ");
//        int n = scanner.nextInt();
//
//        if (n < 2) {
//            System.out.println("Ikkinchi elementni topish uchun kamida 2 ta son kiriting!");
//            return;
//        }
//
//        int[] numbers = new int[n];
//        System.out.println(n + " ta sonni kiriting:");
//        for (int i = 0; i < n; i++) {
//            System.out.print((i + 1) + "-son: ");
//            numbers[i] = scanner.nextInt();
//        }
//
//        // Metodni chaqirish
//        int secondMax = findSecondLargest(numbers);
//
//        if (secondMax == Integer.MIN_VALUE) {
//            System.out.println("Ikkinchi eng katta element mavjud emas (barcha sonlar teng bo'lishi mumkin).");
//        } else {
//            System.out.println("\nNatija: " + secondMax);
//        }
//    }
//
//    /**
//     * Ikkinchi eng katta elementni topuvchi metod
//     */
//    public static int findSecondLargest(int[] array) {
//        int max = Integer.MIN_VALUE;
//        int secondMax = Integer.MIN_VALUE;
//
//        for (int num : array) {
//            if (num > max) {
//                // Agar yangi eng katta son topilsa:
//                // Avvalgi max endi ikkinchi o'ringa tushadi
//                secondMax = max;
//                max = num;
//            } else if (num > secondMax && num < max) {
//                // Agar son max dan kichik bo'lsa, lekin joriy secondMax dan katta bo'lsa
//                secondMax = num;
//            }
//        }
//        return secondMax;
//    }
//}

//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("=== Bubble Sort (Saralash) dasturi ===");
//        System.out.print("Massiv o'lchamini kiriting: ");
//        int n = scanner.nextInt();
//
//        int[] numbers = new int[n];
//        System.out.println(n + " ta sonni kiriting:");
//        for (int i = 0; i < n; i++) {
//            System.out.print((i + 1) + "-son: ");
//            numbers[i] = scanner.nextInt();
//        }
//
//        System.out.println("\nSaralashdan oldin: " + Arrays.toString(numbers));
//
//        // Saralash metodini chaqiramiz
//        bubbleSort(numbers);
//
//        System.out.println("Saralashdan keyin (O'sish tartibida): " + Arrays.toString(numbers));
//    }
//
//    /**
//     * Bubble Sort algoritmi
//     */
//    public static void bubbleSort(int[] array) {
//        int n = array.length;
//        // Tashqi sikl har bir element uchun aylanishni ta'minlaydi
//        for (int i = 0; i < n - 1; i++) {
//            // Ichki sikl qo'shni elementlarni solishtiradi
//            for (int j = 0; j < n - i - 1; j++) {
//                // Agar chapdagi element o'ngdagisidan katta bo'lsa - o'rnini almashtiramiz
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//    }
//}

//class Building {
//    String purpose;
//    String address;
//    int floors_number;
//    private String wallMaterial;
//
//    public Building() {  //default constructor
//        this.purpose = " ";
//        this.address = " ";
//        this.floors_number = 0;
//        this.wallMaterial = " ";
//    }
//
//    public Building(String purpose, String address, int floors_number, String wallMaterial) {
//        this.purpose = purpose;
//        this.address = address;
//        this.floors_number = floors_number;
//        this.wallMaterial = wallMaterial;
//    }
//
//    public void setWallMaterial (String wallMaterial) {
//        this.wallMaterial = wallMaterial;
//    }
//
//    public String getInfo() {
//        return (" The purpose is " + purpose + ".\n Address: " + address+".\n Number of floors: " + floors_number + " and wall material is " + wallMaterial);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Building cafe = new Building();
//        cafe.purpose="organization of recreation";
//        cafe.address="London, Baker Street";
//        cafe.floors_number = 2;
//        // cafe.wallMaterial="brick"; // error because of private type
//        cafe.setWallMaterial("brick");
//        System.out.println("Information about the cafe:\n" + cafe.getInfo());
//
//        Building shop = new Building("organization of shopping", "London, Crawford street", 1, "wood");
//        System.out.println("Information about the shop:\n" + shop.getInfo());
//    }
//}


//import java.util.Arrays;
//import java.util.Scanner;
//
//// 1. Massiv bilan ishlovchi maxsus klass
//class SmartArray {
//    private int[] data;
//
//    // Konstruktor: massivni qabul qilib oladi
//    public SmartArray(int[] inputData) {
//        this.data = inputData;
//    }
//
//    // Maksimal qiymatli elementlar orasidagi masofani topish
//    public int getMaxDistance() {
//        if (data.length == 0) return 0;
//
//        int max = data[0];
//        for (int x : data) if (x > max) max = x;
//
//        int first = -1, last = -1;
//        for (int i = 0; i < data.length; i++) {
//            if (data[i] == max) {
//                if (first == -1) first = i;
//                last = i;
//            }
//        }
//        return last - first;
//    }
//
//    // Massivni o'sish tartibida saralash (Bubble Sort)
//    public void sort() {
//        for (int i = 0; i < data.length - 1; i++) {
//            for (int j = 0; j < data.length - i - 1; j++) {
//                if (data[j] > data[j + 1]) {
//                    int temp = data[j];
//                    data[j] = data[j + 1];
//                    data[j + 1] = temp;
//                }
//            }
//        }
//    }
//
//    // Massivni chiroyli ko'rinishda chiqarish
//    public void printArray() {
//        System.out.println(Arrays.toString(data));
//    }
//}
//
//// 2. Asosiy dastur klassi
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Massiv o'lchamini kiriting: ");
//        int n = scanner.nextInt();
//        int[] input = new int[n];
//
//        System.out.println(n + " ta son kiriting:");
//        for (int i = 0; i < n; i++) {
//            input[i] = scanner.nextInt();
//        }
//
//        // SmartArray obyektini yaratamiz
//        SmartArray myArr = new SmartArray(input);
//
//        System.out.println("\n--- Amallar ---");
//
//        // Masofani hisoblash
//        int dist = myArr.getMaxDistance();
//        System.out.println("Maksimal elementlar masofasi: " + dist);
//
//        // Saralash va chiqarish
//        System.out.print("Saralashdan oldin: ");
//        myArr.printArray();
//
//        myArr.sort();
//
//        System.out.print("Saralashdan keyin: ");
//        myArr.printArray();
//    }
//}

//
//
//import java.util.Scanner;
//
//// 1. Inkapsulyatsiyalangan klass
//class BankAccount {
//    // Private o'zgaruvchi - tashqaridan ko'rinmaydi
//    private double balance;
//    private String owner;
//
//    // Konstruktor
//    public BankAccount(String owner, double initialBalance) {
//        this.owner = owner;
//        if (initialBalance > 0) {
//            this.balance = initialBalance;
//        }
//    }
//
//    // Getter - balansni faqat ko'rish uchun
//    public double getBalance() {
//        return balance;
//    }
//
//    // Depozit qo'yish metodi (Filtrlash bilan)
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//            System.out.println(amount + " so'm qo'shildi.");
//        } else {
//            System.out.println("Xato: Manfiy summa kiritish mumkin emas!");
//        }
//    }
//
//    // Pul yechish metodi
//    public void withdraw(double amount) {
//        if (amount > 0 && amount <= balance) {
//            balance -= amount;
//            System.out.println(amount + " so'm yechildi.");
//        } else {
//            System.out.println("Xato: Mablag' yetarli emas yoki noto'g'ri summa!");
//        }
//    }
//
//    public String getOwner() {
//        return owner;
//    }
//}
//
//// 2. Asosiy klass
//public class Main {
//    public static void main(String[] args) {
//        // Yangi hisob ochamiz
//        BankAccount myAccount = new BankAccount("Ali Valiyev", 500000);
//
//        System.out.println("Mijoz: " + myAccount.getOwner());
//        System.out.println("Boshlang'ich balans: " + myAccount.getBalance() + " so'm");
//
//        // Pul qo'shish
//        myAccount.deposit(200000);
//
//        // Pul yechish
//        myAccount.withdraw(100000);
//
//        // Natija
//        System.out.println("Yakuniy balans: " + myAccount.getBalance() + " so'm");
//
//        // DIQQAT! Pastdagi qator xatolik beradi (chunki balance - private)
//        // myAccount.balance = 0; // BU ISHLAMAYDI!
//    }
//}

//class Smartphone {
//    // Private maydonlar - tashqaridan yashirin
//    private String model;
//    private int batteryLevel; // 0 dan 100 gacha bo'lishi shart
//
//    public Smartphone(String model, int initialBattery) {
//        this.model = model;
//        setBatteryLevel(initialBattery); // Tekshiruvdan o'tkazamiz
//    }
//
//    // Getter - Modelni o'qish uchun
//    public String getModel() {
//        return model;
//    }
//
//    // Getter - Batareya quvvatini ko'rish uchun
//    public int getBatteryLevel() {
//        return batteryLevel;
//    }
//
//    // Setter - Batareya quvvatini xavfsiz o'zgartirish
//    public void setBatteryLevel(int level) {
//        if (level >= 0 && level <= 100) {
//            this.batteryLevel = level;
//        } else {
//            System.out.println("Xato: Batareya quvvati 0-100 oralig'ida bo'lishi kerak!");
//        }
//    }
//
//    // Telefon ishlatilganda quvvat kamayishi
//    public void useApp(String appName) {
//        if (batteryLevel > 5) {
//            System.out.println(appName + " ishga tushdi...");
//            batteryLevel -= 5;
//        } else {
//            System.out.println("Quvvat kam! Ilovani ochib bo'lmaydi.");
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Smartphone phone = new Smartphone("iPhone 15", 80);
//
//        // To'g'ridan-to'g'ri kirish imkonsiz (Xato beradi):
//        // phone.batteryLevel = 150;
//
//        // Faqat ruxsat berilgan usul bilan o'zgartiramiz:
//        phone.setBatteryLevel(95);
//        System.out.println(phone.getModel() + " quvvati: " + phone.getBatteryLevel() + "%");
//
//        phone.useApp("Telegram");
//        System.out.println("Hozirgi quvvat: " + phone.getBatteryLevel() + "%");
//
//        // Noto'g'ri qiymat berishga urinish:
//        phone.setBatteryLevel(500); // Ekranda xatolik chiqadi, lekin qiymat o'zgarmaydi
//    }
//}


//import java.util.*;
//
//class Wall {
//    public String material;
//    public int high;
//
//    public Wall(String material, int high) {
//        this.material = material;
//        this.high = high;
//    }
//
//    @Override
//    public String toString() {
//        return "material is '" + material + '\'' +
//                ", high = " + high + " ft.";
//    }
//}
//
//class Furniture {
//    public String name;
//    public int cost;
//
//    public Furniture(String name, int cost) {
//        this.name = name;
//        this.cost = cost;
//    }
//
//    @Override
//    public String toString() {
//        return "\nname = '" + name + '\'' +
//                ", cost = $" + cost;
//    }
//}
//
//class Apartment {
//    public String street;
//    public int apartmentNo;
//    private Wall walls;
//    private Furniture[] furniture;
//
//    public Apartment(String street, int apartmentNo, String material, int high, Furniture[] furniture) {
//        this.street = street;
//        this.apartmentNo = apartmentNo;
//        walls = new Wall (material,high);
//        this.furniture = furniture;
//    }
//
//    @Override
//    public String toString() {
//        return "The address is" +
//                " '" + street + " St' " +
//                apartmentNo + ", walls " + walls +
//                ", furniture=" + Arrays.toString(furniture);
//    }
//
//    public int getTotalFurnitureCost(Furniture[] furniture) {
//        int totalAmount = 0;
//        for (Furniture furnit : furniture) {
//            totalAmount += furnit.cost;
//        }
//        return totalAmount;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Furniture[] furniture = new Furniture[] {
//                new Furniture("bed", 150),
//                new Furniture("cupboard",250),
//                new Furniture("table", 35),
//                new Furniture("armchair", 80),
//        };
//        Apartment flat1 = new Apartment("Bronco", 3050,"brick", 23, furniture);
//
//        System.out.println("Information about the first apartment:\n" + flat1);
//        System.out.println("Total furniture cost is: $" + flat1.getTotalFurnitureCost(furniture));
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        int num1, den1;
//        int num2, den2;
//
//        num1 = 1;
//        den1 = 2;
//
//        num2 = 5;
//        den2 = 6;
//
//        add(num1, den1, num2, den2);
//    }
//
//    public static void add(int n1, int d1, int n2, int d2) {
//        int num3, den3;
//
//        den3 = d1 * d2;
//        num3 = n1 * d2 + n2 * d1;
//
//        System.out.println(num3 + "/" + den3);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int num1, den1;
//        int num2, den2;
//
//        int num3, den3;
//
//        num1 = 1;
//        den1 = 2;
//
//        num2 = 5;
//        den2 = 6;
//
//        String result = add(num1, den1, num2, den2);
//        String[] param = result.split("/");
//
//        num3 = Integer.parseInt(param[0]);
//        den3 = Integer.parseInt(param[1]);
//
//        System.out.println(num3 + "/" + den3);
//    }
//
//    public static String add(int n1, int d1, int n2, int d2) {
//        int num3, den3;
//
//        den3 = d1 * d2;
//        num3 = n1 * d2 + n2 * d1;
//
//        return num3 + "/" + den3;
//    }
//}


import java.util.Objects;

public class Rectangle {
    private double sideA;
    private double sideB;

    // Ikki parametrli konstruktor
    public Rectangle(double a, double b) {
        this.sideA = a;
        this.sideB = b;
    }

    // Kvadrat uchun bitta parametrli konstruktor
    public Rectangle(double side) {
        this(side, side);
    }

    // Parametrsiz konstruktor (A=4, B=3)
    public Rectangle() {
        this.sideA = 4;
        this.sideB = 3;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double area() {
        return sideA * sideB;
    }

    public double perimeter() {
        return 2 * (sideA + sideB);
    }

    public boolean isSquare() {
        return sideA == sideB;
    }

    public void replaceSides() {
        double temp = sideA;
        sideA = sideB;
        sideB = temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.sideA, sideA) == 0 &&
                Double.compare(rectangle.sideB, sideB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "sideA=" + sideA + ", sideB=" + sideB + '}';
    }
}