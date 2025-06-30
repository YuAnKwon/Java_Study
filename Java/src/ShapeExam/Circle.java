package ShapeExam;

public class Circle extends Shape {
	private double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	final double PI = Math.PI;

	@Override
	public double getArea() {
		return PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return PI * 2 * radius;
	}
}
