package problem1;
import java.util.Scanner;

public class CCC_problem_1 {
	
	public static void main(String[] args) {
		int m;
		int d;
		
		Scanner input = new Scanner(System.in);
		
		m = input.nextInt();
		d = input.nextInt();
		
		input.close();
		if(m < 2) {
			
			System.out.println("Before");
			
		}else if (m == 2) {
			
			if(d < 18) {
				System.out.println("Before");
			}else if (d == 18) {
				System.out.println("Special");
			}else {
				System.out.println("After");
			}
			
		}else if (m > 2) {
			
			System.out.println("After");
			
			
		}
	}

}
