package Study;

public class ColorPoint extends Point {
	private String color;

	ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setPoint(int x, int y) {
		super.move(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void show() {
		System.out.printf("%s색으로 (%d,%d)", color, getX(), getY());
	}

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "Yellow");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();
	}
}
