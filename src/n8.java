public class n8 {

    // Статический метод для вычисления среднего значения элементов массива
    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть нулевым или пустым.");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }

    // Главный метод для демонстрации работы
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Вычисление среднего значения массива
        double average = n8.calculateAverage(numbers);
        System.out.println("Массив: " + java.util.Arrays.toString(numbers)); // Ожидается: [1, 2, 3, 4, 5]
        System.out.println("Средний: " + average); // Ожидается: 3.0

        // Пример с другим массивом
        int[] otherNumbers = {10, 20, 30};
        double otherAverage = n8.calculateAverage(otherNumbers);
        System.out.println("Массив: " + java.util.Arrays.toString(otherNumbers)); // Ожидается: [10, 20, 30]
        System.out.println("Средний: " + otherAverage); // Ожидается: 20.0
    }
}
