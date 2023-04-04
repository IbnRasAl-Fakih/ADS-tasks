import java.util.Scanner;

public class ClassFindBinomalCoefficient {

    public static int findBinom(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return findBinom(n - 1, k - 1) + findBinom(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(findBinom(n, k));
    }
}
