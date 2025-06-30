package ShapeExam;

abstract public class Shape {
	private String name;

	Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract double getArea(); // 도형 넓이

	abstract double getPerimeter(); // 도형 둘레
}
