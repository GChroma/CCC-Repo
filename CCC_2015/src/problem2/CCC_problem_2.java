package problem2;
import java.util.Scanner;

public class CCC_problem_2 {
	
	static public void main(String[] args) {
		
		String message;
		int happyFaces = 0;
		int sadFaces = 0;
		
		Scanner input = new Scanner(System.in);
		
		message = input.nextLine();
		
		input.close();
		
		for (int i = 0; i < message.length() - 1; i++ ) {
			
			if(i + 2 < message.length() ) {
				
				if(message.charAt(i) == ':' && message.charAt(i + 1) == '-' && message.charAt(i + 2) == ')')  {
					
					happyFaces++;
					
				}else if(message.charAt(i) == ':' && message.charAt(i + 1) == '-' && message.charAt(i + 2) == '(') {
					
					sadFaces++;
					
				}
			}
		}
		
		if(happyFaces == 0 && sadFaces == 0) {
			System.out.println("none.");
		}else if (happyFaces == sadFaces) {
			System.out.println("unsure.");
		}else if (happyFaces > sadFaces) {
			System.out.println("happy.");
		}else if (sadFaces > happyFaces) {
			System.out.println("sad.");
		}else {
			System.out.println("you shouldn't see this.");
		}

	}
}
