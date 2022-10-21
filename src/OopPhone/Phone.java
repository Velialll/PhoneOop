package OopPhone;

public class Phone {
    String number;
    String model;
    double weight;

    /**
     * Ключевое слово "this" должно стоять первым
     * Вызывает метод number и model с второго конструктора
     * Что бы избежать повторения
     * <p>
     * Комбинация клавиш "ALT" + "Insert"
     * Вызывает меню "Generate" в котором можно
     * Сгинерировать конструктор выбирая нужые параметры
     * Для данного конструктора (зажать "CTRL")
     */
    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(String number, String model) {
        this();
        this.number = number;
        this.model = model;
    }

    Phone() {

    }

   /*void receiveCall(String name) {
        System.out.println("Calling " + name);
    }*/

    /**
     *Перегрузка методов так же существует перегрузка конструкторов
     */
    void receiveCall(String name, String number) {
        System.out.println("Calling " + name + " with number " + number);
        System.out.println("My number " + this.number);
    }

    String getNumber() {
        return number;
    }
}