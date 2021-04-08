package problem_J2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int P = input.nextInt();
		int N = input.nextInt();
		int R = input.nextInt();
		int I = N;//total infected
		int justInfected = N;//just infected (can infect others)
		int days = 0;
		while(I <= P) {
			
			justInfected = R * justInfected;
			I += justInfected;
			days++;
			
		}

		System.out.println(days);
	}

}
