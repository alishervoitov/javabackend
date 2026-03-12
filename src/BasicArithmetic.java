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

public class BasicArithmetic {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum); // 15 + 4 = 19

        int difference = a - b;
        System.out.println(a + " - " + b + " = " + difference); // 15 - 4 = 11

        int product = a * b;
        System.out.println(a + " * " + b + " = " + product); // 15 * 4 = 60

        int quotient = a / b;
        System.out.println(a + " / " + b + " = " + quotient); // 15 / 4 = 3

        int remainder = a % b;
        System.out.println(a + " % " + b + " = " + remainder); // 15 % 4 = 3
    }
}