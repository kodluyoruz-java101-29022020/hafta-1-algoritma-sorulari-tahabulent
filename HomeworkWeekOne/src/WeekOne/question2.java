package WeekOne;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Yapýlacak Ýþlemi Seçiniz\n1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme");
		
		int input=scanner.nextInt();
		System.out.println("2 Adet Sayý Giriniz:");
		float number1=scanner.nextFloat();
		float number2=scanner.nextFloat();
		float result;
		
		switch(input){
		
			case 1:
				result=(number1+number2);
				System.out.println("Toplam:"+result);
				break;
			case 2:
				result=(number1-number2);
				System.out.println("Fark:"+result);
				break;
			case 3:
				result=(number1*number2);
				System.out.println("Çarpým:"+result);
				break;
			case 4:
				result=(number1/number2);
				System.out.println("Bölüm:"+result);
				break;
			default :
	            System.out.println("Hatali secim! 1, 2 ,3 ya da 4'e basiniz.");
	            break;
		
		}

	}

}
