import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        PatternClass myObj = new PatternClass();
        myObj.printPattern5(number);
    }
}

class PatternClass {
    public void printPattern1(int n) {
        // This is outer loop
        for (int i = 0; i < n; i++) {
            // This is inner loop
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void printPattern2(int n) {
        // This is outer loop
        for (int i = 0; i < n; i++) {
            // This is inner loop
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void printPattern3(int n) {
        // This is outer loop
        for (int i = 0; i <= n; i++) {
            // This is inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public void printPattern4(int n) {
        // This is outer loop
        for (int i = 0; i <= n; i++) {
            // This is inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    public void printPattern5(int n) {
        // This is outer loop
        for (int i = 0; i < n; i++) {
            // This is inner loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
