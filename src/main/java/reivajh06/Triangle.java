package reivajh06;

public class Triangle {

	public static Triangle equilateral(int edgeSize) {
		return new Triangle(edgeSize, edgeSize, edgeSize);
	}

	private final int a;
	private final int b;
	private final int c;

	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int a() {
		return a;
	}

	public int b() {
		return b;
	}

	public int c() {
		return c;
	}

	public int perimeter() {
		return a + b + c;
	}

	public double area() {
		double s = (double) perimeter() / 2;

		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	public String toString() {
		return "Triangle{" +
				"a=" + a +
				", b=" + b +
				", c=" + c +
				'}';
	}
}
