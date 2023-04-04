import java.util.Scanner;

public class ClassFindGCD {

    public static int findGCD(int a, int b) {
        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        int k = a / b;
        int r = a - b * k;
        if (r == 0) {
            return b;
        }
        return findGCD(b, r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(findGCD(a, b));
    }
}
