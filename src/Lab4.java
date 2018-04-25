import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		
		// Anthony Reakoff, Lab 4 on 4/25/18
		
		Scanner scnr = new Scanner(System.in);
		int num;
		int I = 1;
		String ans;

		do {

			System.out.print("Enter an integer: ");
			num = scnr.nextInt();

			System.out.println("Number   Square   Cube");

			while (I <= num) {
				System.out.println(I + "        " + I * I + "        " + I * I * I);
				I++;
			}
			
			scnr.nextLine();
			System.out.println("Do you want to continue? Y/N");
			ans = scnr.nextLine();
			I = 1;
			
		} while (ans.equalsIgnoreCase("y"));
		if (ans != "y");
		System.out.println("Asta la vista, baby");
	}

}