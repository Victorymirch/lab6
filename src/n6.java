import java.util.Arrays;

public class n6 {

    // Статический метод для получения нового массива из первых элементов
    public static int[] takeFirstElements(int[] array, int count) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не может быть нулевым.");
        }
        if (count <= 0) {
            return new int[0]; // Возвращаем пустой массив, если count <= 0
        }

        // Если count больше длины массива, возвращаем копию массива
        if (count >= array.length) {
            return Arrays.copyOf(array, array.length);
        }

        // Возвращаем новый массив с первыми count элементами
        return Arrays.copyOf(array, count);
    }

    // Главный метод для демонстрации работы
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        // Пример 1: Берем первые 3 элемента
        int[] result1 = n6.takeFirstElements(originalArray, 3);
        System.out.println("Результат 1: " + Arrays.toString(result1)); // Ожидается: [1, 2, 3]

        // Пример 2: Количество элементов больше длины массива
        int[] result2 = n6.takeFirstElements(originalArray, 10);
        System.out.println("Результат 2: " + Arrays.toString(result2)); // Ожидается: [1, 2, 3, 4, 5]

        // Пример 3: Количество элементов равно 0
        int[] result3 = n6.takeFirstElements(originalArray, 0);
        System.out.println("Результат 3: " + Arrays.toString(result3)); // Ожидается: []

        // Пример 4: Пустой массив
        int[] emptyArray = {};
        int[] result4 = n6.takeFirstElements(emptyArray, 3);
        System.out.println("Результат 4: " + Arrays.toString(result4)); // Ожидается: []
    }
}
