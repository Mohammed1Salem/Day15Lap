import java.math.BigDecimal;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public Rectangle() {}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea(){
        double value = height * width;
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2,BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public double calculateCircumference() {
        double value = (height * 2) + (width * 2);
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2,BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangle of height: "+ height +
                "\nWidth: "+ width+
                "\nArea: "+calculateArea() +
                "\nPerimeter: " + calculateCircumference();
    }
}
