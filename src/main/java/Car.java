public class Car {
    private String model;
    private final String name;
    private String carNumber;
    private CarColor color;

    public Car(String name, String carNumber) {
        this.name = name;
        this.carNumber = carNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getName() {
        return name;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public CarColor getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car name='" + name + '\'' +
                ", model=" + model +
                ", car number=" + carNumber +
                ", car color=" + color +
                '}';
    }
}
