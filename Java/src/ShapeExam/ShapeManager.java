package ShapeExam;

public class ShapeManager {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Circle", 5.0),
            new Rectangle("Rectangle", 6.0, 4.0)
        };
        printShapeInfo(shapes);
    }
    
    static void printShapeInfo(Shape[] shapes) {
        for (Shape s : shapes)
            System.out.printf("%s의 넓이 = %.2f, 둘레 = %.2f%n",
                s.getName(), s.getArea(), s.getPerimeter());
    }
}