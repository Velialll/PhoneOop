package OopPhone;

public class Phone {
    String number;
    String model;
    double weight;

    Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(){

    }

    void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    String getNumber() {
        return number;
    }
}