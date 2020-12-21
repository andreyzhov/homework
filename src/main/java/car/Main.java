package car;

public class Main {
    public static void main(String[] args) {
        Car carWithDefaultConstructor = new Car();
        Car carWithOneParametr = new Car(2015);
        Car carWithTwoParametr = new Car(2020, "white");

        System.out.println("Year: " + carWithDefaultConstructor.getYear() + " Color: " + carWithDefaultConstructor.getColor());
        System.out.println("Year: " + carWithOneParametr.getYear() + " Color: " + carWithOneParametr.getColor());
        System.out.println("Year: " + carWithTwoParametr.getYear() + " Color: " + carWithTwoParametr.getColor());
    }
}
