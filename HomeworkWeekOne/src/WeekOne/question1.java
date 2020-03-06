package WeekOne;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {

		String password = "12345";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Þifreyi Giriniz:");

		String uservalue= scanner.nextLine();
		

		if (password.equals(uservalue))
			{
			System.out.println("Giriþ Baþarýlý");
			}

		else {
			System.out.println("Giriþ Baþarýsýz");
			 }
	}

}
