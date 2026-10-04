package reivajh06;

public class Kata1 {

	static void main() {
		Triangle equilateral = Triangle.equilateral(2);
		System.out.println(equilateral);
		System.out.println("Area: %s".formatted(equilateral.area()));
		System.out.println("Perimeter: %s".formatted(equilateral.perimeter()));
	}
}
