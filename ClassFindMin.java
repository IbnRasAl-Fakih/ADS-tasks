import java.util.Scanner;

public class ClassFindMin {

    public static int findMin(int min, int[] arr, int k) {
        if (k == arr.length) {
            return min;
        }
        if (min > arr[k]) {
            min = arr[k];
        }
        return findMin(min, arr, ++k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int a = 0; a < n; a++) {
            arr[a] = scanner.nextInt();
        }
        System.out.println(findMin(arr[0], arr, 0));
    }
}
