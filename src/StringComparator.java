import java.util.Scanner;

public class StringComparator {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str1,str2;
		System.out.printf("Enter a string 1:");
		str1=scanner.nextLine();
		System.out.printf("Enter a string 2:");
		str2=scanner.nextLine();
		
		if((str1.compareToIgnoreCase(str2))==0)
			System.out.printf("The two strings are the same.");	
		else
			System.out.printf("The two strings are not the same.");
		
			
	}

}
