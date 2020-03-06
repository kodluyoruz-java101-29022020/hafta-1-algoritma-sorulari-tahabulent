package WeekOne;

import java.util.Random;

public class question3 {
	
	
	static float avarage(int [] array) {
			
		float sum=0;
		
		for(int i=0;i<100;i++) {
			
			sum+=array[i];
		}
		return sum/100;
	}

	public static void main(String[] args) {
		
		Random r=new Random();
		
		int [] array=new int[100];
		
		for(int i=0;i<100;i++) {
			
			array[i]=r.nextInt(100);
		}
	System.out.println("Dizinin Ortalamasý:"+avarage(array));
		
	}

}
