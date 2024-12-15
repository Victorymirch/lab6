import java.util.Scanner;

public class timus1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Массив для хранения всех входных чисел
        int[] inputs = new int[10];
        int idx = 0;

        // Считываем все тесты
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            inputs[idx++] = n;
        }

        // Находим максимальное значение n из тестов
        int maxN = 0;
        for (int i = 0; i < idx; i++) {
            if (inputs[i] > maxN) {
                maxN = inputs[i];
            }
        }

        // Строим последовательность до maxN
        int[] a = new int[maxN + 1];
        a[0] = 0;
        a[1] = 1;

        for (int i = 1; i <= maxN / 2; i++) {
            if (2 * i <= maxN) {
                a[2 * i] = a[i];  // a2i = ai
            }
            if (2 * i + 1 <= maxN) {
                a[2 * i + 1] = a[i] + a[i + 1];  // a2i+1 = ai + ai+1
            }
        }

        // Для каждого теста находим максимальное значение среди a0..an
        for (int i = 0; i < idx; i++) {
            int n = inputs[i];
            int max = a[0];
            for (int j = 1; j <= n; j++) {
                if (a[j] > max) {
                    max = a[j];
                }
            }
            System.out.println(max);
        }
    }
}
