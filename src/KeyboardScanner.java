import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int Integer;
		float Floatpoint;
		String Name;
		System.out.printf("Enter a integer: ");
		Integer = scanner.nextInt();
		System.out.printf("Enter a float point number: ");
		Floatpoint = scanner.nextFloat();
		System.out.printf("Enter a you name: ");
		Name = scanner.next();
		System.out.printf("Hi %s, the multiplication of %d and %f is %.2e",Name,Integer,Floatpoint,Integer*Floatpoint);
	}
}
