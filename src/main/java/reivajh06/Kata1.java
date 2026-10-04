package reivajh06;

public class Kata1 {

	static void main() {
		Ellipse circle = Ellipse.circle(5);
		System.out.println(circle);
		System.out.println("Area: %s".formatted(circle.area()));
		System.out.println("Perimeter: %s".formatted(circle.perimeter()));
		System.out.println();

		Ellipse ellipse = new Ellipse(5, 10);
		System.out.println(ellipse);
		System.out.println("Area: %s".formatted(ellipse.area()));
		System.out.println("Perimeter: %s".formatted(ellipse.perimeter()));
	}
}
