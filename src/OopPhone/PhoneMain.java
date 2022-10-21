package OopPhone;

public class PhoneMain {
    public static void main(String[] args) {

        Phone myPhone1 = new Phone("00231248", "Apple", 173);
        Phone myPhone2 = new Phone("00361239", "Samsung");
        Phone myPhone3 = new Phone();

        System.out.println(myPhone1.getNumber());
        System.out.println(myPhone1.model);
        System.out.println(myPhone1.weight);
        System.out.println();

        System.out.println(myPhone2.getNumber());
        System.out.println(myPhone2.model);
        System.out.println(myPhone2.weight);
        System.out.println();

        System.out.println(myPhone3.getNumber());
        System.out.println(myPhone3.model);
        System.out.println(myPhone3.weight);
        System.out.println();

        myPhone1.receiveCall("Mum");
        myPhone2.receiveCall("Dad");
    }
}
