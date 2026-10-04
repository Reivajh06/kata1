package reivajh06;

public class Rectangle {

	private final int width;
	private final int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int width() {
		return width;
	}

	public int height() {
		return height;
	}

	public int area() {
		return width * height;
	}

	public int perimeter() {
		return 2 * (width + height);
	}

	@Override
	public String toString() {
		return "Rectangle{" +
				"width=" + width +
				", height=" + height +
				'}';
	}
}
