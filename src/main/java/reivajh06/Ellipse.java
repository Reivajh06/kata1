package reivajh06;

public class Ellipse {

	public static Ellipse circle(double radius) {
		return new Ellipse(radius, radius);
	}

	private final double hRadius;
	private final double vRadius;

	public Ellipse(double horizontalRadius, double verticalRadius) {
		this.hRadius = horizontalRadius;
		this.vRadius = verticalRadius;
	}

	public double hRadius() {
		return hRadius;
	}

	public double vRadius() {
		return vRadius;
	}

	public double area() {
		return Math.PI * hRadius * vRadius;
	}

	public double perimeter() {
		return Math.PI * (3 * (hRadius + vRadius) - Math.sqrt((3 * hRadius + vRadius) * (hRadius + 3 * vRadius)));
	}

	@Override
	public String toString() {
		return "Ellipse{" +
				"Horizontal radius=" + hRadius +
				", Vertical radius=" + vRadius +
				'}';
	}
}
