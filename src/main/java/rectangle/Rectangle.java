package rectangle;

public class Rectangle {
    double side1, side2;
    public Rectangle(){
        side1 = 0.00;
        side2 = 0.00;
    }
    public double areaCalculator(double side1, double side2){
        double s = side1 * side2;
        return s;
    }
    public double perimeterCalculator(double side1, double side2){
        double p = 2 * (side1 + side2);
        return p;
    }
}
