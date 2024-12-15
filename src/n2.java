
public class n2 {
    private static int counter = 0;

    public static void showAndIncrement() {
        System.out.println("Текущее значение: " + counter);
        counter++;
    }

    public static void main(String[] args) {
        System.out.println("Запуск программы Task2");

        for (int i = 0; i < 5; i++) {
            n2.showAndIncrement();
        }
    }
}