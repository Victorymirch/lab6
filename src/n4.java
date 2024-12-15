public class n4 {

    // Статический метод для вычисления двойного факториала
    public static long doubleFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным.");
        }
        long result = 1;
        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }
        return result;
    }

    // Главный метод для демонстрации работы
    public static void main(String[] args) {
        int number1 = 6;
        int number2 = 5;

        System.out.println(number1 + "!! = " + n4.doubleFactorial(number1)); // Ожидается: 48
        System.out.println(number2 + "!! = " + n4.doubleFactorial(number2)); // Ожидается: 15

        // Пример с нулем
        System.out.println("0!! = " + n4.doubleFactorial(0)); // Ожидается: 1

        // Пример с единицей
        System.out.println("1!! = " + n4.doubleFactorial(1)); // Ожидается: 1
    }
}
