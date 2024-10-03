import java.util.Scanner;

public class lab2{

    public static int lab2(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        int[][] dp = new int[len1 + 1][len2 + 1];

        for (int i = 0; i <= len1; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= len2; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                int cost = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;
                dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1,    // Видалення
                                dp[i][j - 1] + 1),   // Вставка
                        dp[i - 1][j - 1] + cost); // Заміна
            }
        }

        return dp[len1][len2];
    }

    public static boolean areStringsSimilar(String s1, String s2, int tolerance) {
        int distance = lab2(s1, s2);
        return distance <= tolerance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перший рядок:");
        String str1 = scanner.nextLine();

        System.out.println("Введіть другий рядок:");
        String str2 = scanner.nextLine();

        System.out.println("Введіть допустиму кількість операцій редагування:");

        int tolerance = scanner.nextInt();
        scanner.nextLine();

        if (areStringsSimilar(str1, str2, tolerance)) {
            System.out.println("Рядки схожі з допуском " + tolerance);
        } else {
            System.out.println("Рядки не схожі з допуском " + tolerance);
        }

        scanner.close();
    }
}
