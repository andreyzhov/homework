public class Name {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "AA7586CM");
        car.setModel("ModelX");
        car.setColor(CarColor.RED);

        Car car1 = new Car("Tesla", "AA8876BA");
        car1.setModel("Model3");
        car1.setColor(CarColor.GREEN);

        System.out.println(car.toString());
        System.out.println(car1.toString());
    }
}
