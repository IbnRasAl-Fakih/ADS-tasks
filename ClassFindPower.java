import java.util.Scanner;

public class ClassFindPower {

    public static int findPow(int a, int n, int sum) {
        if (n == 1) {
            return sum;
        }
        sum *= a;
        return findPow(a, --n, sum);
     }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(findPow(a, n, a));
    }
}
