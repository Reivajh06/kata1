package reivajh06;

public class Kata1 {

	static void main() {
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(rectangle);
		System.out.println("Area: %s".formatted(rectangle.area()));
		System.out.println("Perimeter: %s".formatted(rectangle.perimeter()));
	}
}
