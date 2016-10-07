import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.printf("Enter a integer: ");
		num=scanner.nextInt();
		if(num==1)
			System.out.printf("The input integer is ¡§ONE¡¨.");	
		else if(num==2)
			System.out.printf("The input integer is ¡§TWO¡¨.");	
		else if(num==3)
			System.out.printf("The input integer is ¡§THREE¡¨.");
		else if(num==4)
			System.out.printf("The input integer is ¡§FOUR¡¨.");
		else if(num==5)
			System.out.printf("The input integer is ¡§FIVE¡¨.");
		else if(num==6)
			System.out.printf("The input integer is ¡§SIX¡¨.");
		else if(num==7)
			System.out.printf("The input integer is ¡§SEVEN¡¨.");
		else if(num==8)
			System.out.printf("The input integer is ¡§EIGHT¡¨.");
		else if(num==9)
			System.out.printf("The input integer is ¡§NINE¡¨.");
		else
			System.out.printf("The input integer is ¡§OTHER¡¨.");
	
		
	}
}
