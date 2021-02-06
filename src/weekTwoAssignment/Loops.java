package weekTwoAssignment;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a = 0;
	while (a <= 100) {
		System.out.println(a);
		a += 2;
	}
	
	int b = 100;
	while (b >= 0) {
		System.out.println(b);
		b -= 3;
	}
	
	for (int c = 1 ; c <= 100; c += 2) {
		System.out.println(c);
	}
		
	for (int i = 0; i <= 100; i++) {
		if (i % 3 == 0 && i % 5 == 0) {
			System.out.println("Hello World");
		} else if (i % 3 == 0) {
			System.out.println("Hello");
		} else if (i % 5 == 0) {
			System.out.println("World");
		}
		else {
			System.out.println(i);
		}
	}
}
}
