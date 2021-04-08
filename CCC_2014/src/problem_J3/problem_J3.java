package problem_J3;
import java.util.Scanner;

public class problem_J3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		input.nextLine();
		int i = 0;
		
		String[] rolls = new String[r];
		
		do {
			
			rolls[i] = input.nextLine();
			i++;
			
		}while(i < r);
		
		input.close();
		int a = 100;
		int d = 100;
		
		for(i = 0; i < r; i++ ) {
			int aRoll = Character.getNumericValue(rolls[i].charAt(0));
			int dRoll =Character.getNumericValue(rolls[i].charAt(2));
			if( aRoll > dRoll) {
				
				d -= aRoll;
				
			}else if(aRoll < dRoll) {
				a -= dRoll;
			}
		}
		
		System.out.println(a);
		System.out.println(d);
	}
}
