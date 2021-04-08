package problem_J2;
import java.util.Scanner;

public class problem_J2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		input.nextLine();
		String v = input.nextLine();
		
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < n; i++) {
			
			if(v.charAt(i) == 'A') {
				
				a++;
				
			}else {
				b++;
			}
		}
		
		if(a > b) {
			System.out.println("A");
		}else if(b > a) {
			System.out.println("B");
		}else {
			System.out.println("Tie");
		}

		input.close();
	}

}
