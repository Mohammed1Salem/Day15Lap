import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {


        //Please note that all requirement and at the botton of the class
        //Please note that all requirement and at the botton of the class
        //Please note that all requirement and at the botton of the class


        //Scanner initialization


        System.out.println("Welcome To My Shape Application!!");

        double radius = 0;
        double height = 0;
        double width = 0;
        double base = 0;

        boolean flag = true;
        while (flag){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Enter your choice"+
                    "\n1.Set Values"+
                    "\n2.Show Information of Circle"+
                    "\n3.Show Information of Rectangle"+
                    "\n4.Show Information of Triangle"+
                    "\n5 Area guess game"+
                    "\n6.Go To Lap Requirement"
            );

            int choice = sc.nextInt();
            switch (choice){
                case 1:

                    radius = 0;
                    height = 0;
                    width = 0;
                    base = 0;

                    System.out.println("Please only enter numbers bigger than zero");
                    while (radius <= 0 && height <= 0 && width <= 0 && base <= 0){
                    System.out.println("Radius:");
                    radius = sc.nextDouble();
                    System.out.println("Height:");
                    height = sc.nextDouble();
                    System.out.println("Width:");
                    width = sc.nextDouble();
                    System.out.println("Base:");
                    base = sc.nextDouble();
                    }
                    System.out.println("Radius: "+radius+"\nHeight: "+height+"\nWidth: " +width+ "\nBase: " + base+"\nAll Been Set Successfully");
                    break;
                case 2:
                    Circle c = new Circle(radius);
                    System.out.println(c);
                    break;
                case 3:
                    Rectangle r = new Rectangle(height,width);
                    System.out.println(r);
                    break;
                case 4:
                    Triangle t = new Triangle(height,base);
                    System.out.println(t);
                    break;
                case 5:
                    int answer = 0;
                    System.out.println("Get ready to test yourself !\nFor sake of simplicity you can answer with integer numbers\nEnter -1 to leave");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    while (answer != -1){
                        int randomGame = random.nextInt(1,2);
                        switch (randomGame){
                        case 1:
                            int radiusTest = random.nextInt(1,20);
                            System.out.println("whats the area of circle of radius: "+radiusTest);
                            Circle cTest = new Circle(radiusTest);
                            answer = sc.nextInt();
                            int intanswercir = (int) cTest.calculateArea();
                            if(answer == intanswercir){
                                System.out.println("Correct!");
                            }else System.out.println("Wrong...");
                        case 2:
                            int widthTest = random.nextInt(1,20);
                            int heightTest = random.nextInt(1,20);
                            System.out.println("whats the area of Rectangle of height: "+heightTest+" and width of "+widthTest);
                            Rectangle rTest = new Rectangle(heightTest,widthTest);
                            answer = sc.nextInt();

                            int intanswerRec = (int) rTest.calculateArea();
                            if(answer == intanswerRec){
                                System.out.println("Correct!");
                            }else System.out.println("Wrong...");
                        }
                        break;
                    }
                case 6:
                    System.out.println("Thank you for using my app");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    flag = false;
                default:
                    System.out.println("something went wrong");
                    break;
            }
        }

        Circle c1 = new Circle(5);
        System.out.println(c1);

        Circle c2 = new Circle();

        c2.setRadius(3.35);
        System.out.println();
        System.out.println(c2.getRadius());
        System.out.println(c2.calculateArea());
        System.out.println(c2.calculateCircumference());
        System.out.println(c2);


        Rectangle r1 = new Rectangle(5,2);
        System.out.println(r1);

        Rectangle r2 = new Rectangle();

        r2.setHeight(6.23);
        r2.setWidth(3.43);

        System.out.println();
        System.out.println(r2.getHeight());
        System.out.println(r2.getWidth());
        System.out.println(r2.calculateArea());
        System.out.println(r2.calculateCircumference());
        System.out.println(r2);

        Triangle t1 = new Triangle(3,7);
        System.out.println(t1);

        Triangle t2 = new Triangle();

        t2.setHeight(4.7);
        t2.setBase(2.3);

        System.out.println();
        System.out.println(t2.getHeight());
        System.out.println(t2.getBase());
        System.out.println(t2.calculateArea());
        System.out.println(t2.calculateCircumference());
        System.out.println(t2);

    }
    static void areaGameCircle(){

        }

    static void areaGameRectangle(){



    }
}