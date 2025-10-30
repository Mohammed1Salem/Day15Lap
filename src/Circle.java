import java.math.BigDecimal;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle() {}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double value = Math.PI*Math.pow(radius,2);
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2,BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public double calculateCircumference() {
        double value = 2*Math.PI*radius;
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2,BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public String toString() {
        return super.toString() + "Circle of Radius: "+ radius +
                "\nArea: "+calculateArea() +
                "\nCircumference: " + calculateCircumference();
    }
}
