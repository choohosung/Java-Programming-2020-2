package Week_12th;

class Shape {
}

class Rectangle extends Shape {
}

class Circle extends Shape {
}

public class CastExceptionTest {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		try {
			casting(r);
		} catch (ClassCastException e) {
			System.out.println("Ÿ�� ��ȯ�� �� �� �����ϴ�.");
		}
	}

	static void casting(Shape s) throws ClassCastException {
		Circle c = (Circle) s;
	}
}