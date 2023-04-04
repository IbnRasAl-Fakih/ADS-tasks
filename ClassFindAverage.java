import java.util.Scanner;

public class ClassFindAverage {

    public static double findAverage(int n, int[] arr, double sum) {
        if (n == arr.length) {
            return sum / arr.length;
        }
        sum += arr[n];
        return findAverage(n + 1, arr, sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int a = 0; a < n; a++) {
            arr[a] = scanner.nextInt();
        }
        System.out.println(findAverage(0, arr, 0));
    }
}
