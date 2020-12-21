package car;

public class Car {
    private int year;
    private String color;

    public Car(){
        this.year = 2017;
        this.color = "black";
    }

    public Car(int year){
        this.year = year;
        this.color = "red";
    }

    public Car(int year, String color){
        this.year = year;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
