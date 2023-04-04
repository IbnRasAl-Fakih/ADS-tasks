import java.util.Scanner;

public class ClassIsPrime {

    public static boolean isPrime(int n, int k) {
        if (n == 2 || n == 1) {
            return true;
        }
        if (k == 2) {
            return n % k != 0;
        }
        if (n % k == 0) {
            return false;
        }
        return isPrime(n, k - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("The number must be positive");
        }
        else {
            if (isPrime(n, n - 1)) {
                System.out.println("Prime");
            }
            else {
                System.out.println("Composite");
            }
        }
    }
}
