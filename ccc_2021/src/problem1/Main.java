package problem1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int B = input.nextInt();
		
		input.close();
		
		int P = 5 * B - 400;
		System.out.println(P);
		
		if(P < 100) {
			System.out.println(1);
		}else if (P == 100) {
			System.out.println(0);
		}else if (P > 100) {
			System.out.println(-1);
		}

	}

}
