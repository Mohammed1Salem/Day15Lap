import java.math.BigDecimal;

public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public Triangle() {}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        double value = 0.5*base*height;
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2,BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public double calculateCircumference() {
        double value = base*3;
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2,BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }


    @Override
    public String toString() {
        return super.toString() + "Triangle of height: "+ height +
                "\nBase: "+ base+
                "\nArea: "+calculateArea() +
                "\nPerimeter: " + calculateCircumference();
    }
}
