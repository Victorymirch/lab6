public class n3 {

    // Метод для вычисления наибольшего значения
    public static int findMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Номера не указаны");
        }
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Метод для вычисления наименьшего значения
    public static int findMin(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Номера не указаны");
        }
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Метод для вычисления среднего значения
    public static double findAverage(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Номера не указаны");
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    // Главный метод для демонстрации работы класса
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        // Пример использования методов
        System.out.println("Максимальное значение: " + n3.findMax(numbers)); // Ожидается: 25
        System.out.println("Минимальное значение: " + n3.findMin(numbers)); // Ожидается: 5
        System.out.println("Среднее значение: " + n3.findAverage(numbers)); // Ожидается: 15.0

        // Пример с произвольным количеством аргументов
        System.out.println("Максимальное значение: " + n3.findMax(1, 2, 3, 4)); // Ожидается: 4
        System.out.println("Минимальное значение: " + n3.findMin(1, 2, 3, 4)); // Ожидается: 1
        System.out.println("Среднее значение: " + n3.findAverage(1, 2, 3, 4)); // Ожидается: 2.5
    }
}
