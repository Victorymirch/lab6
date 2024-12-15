public class n1 {
    // Поля класса
    private char charField;
    private String textField;

    // Метод для присваивания значения символьному полю
    public void setField(char value) {
        this.charField = value;
    }

    // Метод для присваивания значения текстовому полю
    public void setField(String value) {
        this.textField = value;
    }

    // Метод для обработки символьного массива
    public void setField(char[] value) {
        if (value.length == 1) {
            // Если массив состоит из одного элемента, присваиваем значение символьному полю
            this.charField = value[0];
        } else {
            // Если массив содержит больше одного символа, формируем строку и присваиваем текстовому полю
            this.textField = new String(value);
        }
    }

    // Методы для получения значений полей
    public char getCharField() {
        return charField;
    }

    public String getTextField() {
        return textField;
    }

    // Главный метод для демонстрации работы класса
    public static void main(String[] args) {
        n1 obj = new n1();

        // Присваивание символа
        obj.setField('A');
        System.out.println("charField: " + obj.getCharField()); // Ожидается: A

        // Присваивание строки
        obj.setField("Hello, world!");
        System.out.println("textField: " + obj.getTextField()); // Ожидается: Hello, world!

        // Присваивание массива символов с одним элементом
        obj.setField(new char[]{'B'});
        System.out.println("charField: " + obj.getCharField()); // Ожидается: B

        // Присваивание массива символов с несколькими элементами
        obj.setField(new char[]{'H', 'e', 'l', 'l', 'o'});
        System.out.println("textField: " + obj.getTextField()); // Ожидается: Hello
    }
}
