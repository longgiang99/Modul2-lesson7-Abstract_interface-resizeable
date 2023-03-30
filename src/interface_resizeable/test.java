package interface_resizeable;

public class test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);




        Circle circle = new Circle(5);
        System.out.println(circle);
        System.out.println(circle.getArea());
        circle.howToColor();

        circle.resize(50);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        circle.resize(-50);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());





        Rectangle rectangle = new Rectangle(10,5);
        System.out.println(rectangle);
        System.out.println(rectangle.getPerimeter());


        rectangle.resize(-50);
        System.out.println(rectangle.getWidth() + " "+ rectangle.getLength());
        System.out.println(rectangle.getPerimeter());


    }

}
