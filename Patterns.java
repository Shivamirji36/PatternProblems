import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        PatternClass myObj = new PatternClass();
        myObj.printPattern10(number);
    }
}

class PatternClass {
    // Pattern 1 - Square Star Pattern
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

    // Pattern 2 - Right-Angled Triangle Star Pattern
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

    // Pattern 3 - Number Triangle Pattern
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

    // Pattern 4 - Repeated Number Triangle Pattern
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

    // Pattern 5 - Inverted Right-Angled Triangle Star Pattern
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

    // Pattern 6 - Inverted Number Triangle Pattern
    public void printPattern6(int n) {
        // This is outer loop
        for (int i = 0; i < n; i++) {
            // This is inner loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    // Pattern 7 - Pyramid Star Pattern
    public void printPattern7(int n) {
        // This is outer loop
        for (int i = 0; i < n; i++) {
            // This is inner loop - Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // This is inner loop - Stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // This is inner loop - Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    // Pattern 8 - Inverted Pyramid Star Pattern
    public void printPattern8(int n) {
        // This is outer loop
        for (int i = 0; i < n; i++) {
            // This is inner loop - Spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            // This is inner loop - Stars
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // This is inner loop - Spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    // Pattern 9 - Diamond Star Pattern
    public void printPattern9(int n) {
        // This is outer loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            // This is inner loop - Stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // This is inner loop - Spaces
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            // This is inner loop - Stars
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // This is inner loop - Spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    // Pattern 10 - Half Diamond Star Pattern
    public void printPattern10(int n) {
        int start = 1;
        // This is outer loop
        for (int i = 1; i <= 2 * n - 1; i++) {
            start = i;
            // This is inner loop
            if (i > n) {
                start = 2 * n - i;
            }
            for (int j = 1; j <= start; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}
