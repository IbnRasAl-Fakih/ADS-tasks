import java.util.Scanner;

public class ClassCheckString {

    public static String checkString(String str, int n) {
        if(n == str.length()) {
            return "Yes";
        }
        if (str.toCharArray()[n] >= 48 && str.toCharArray()[n] <= 57) {
            return checkString(str, n + 1);
        }
        else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(checkString(str, 0));
    }
}
