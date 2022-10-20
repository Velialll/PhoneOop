package OopPhone;

public class Phone {
    String seriesNumber;
    String model;
    String core;
    double weight;
    double displaySize;

    double getVolume() {
        return weight * displaySize;
    }
}