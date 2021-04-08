package problem_J1;
import java.util.Scanner;

public class problem_J1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int degree1 = input.nextInt();
		int degree2 = input.nextInt();
		int degree3 = input.nextInt();
		
		if(degree1 == 60 && degree2 == 60 && degree3 == 60) {
			System.out.println("Equilateral");
		}else if(degree1 != degree2 && degree2 != degree3) {
			System.out.println("Scalene");
		}else if(degree1 + degree2 + degree3 > 180) {
			System.out.println("Error");
		}else {
			System.out.println("Isosceles");
		}
		
		input.close();
	}

}
