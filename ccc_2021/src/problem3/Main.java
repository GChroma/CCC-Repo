package problem3;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Stack<String> directions = new Stack<String>();
		int N = 0;
		
		do {
			directions.add(input.nextLine());
			N++;
			
		}while(directions.peek().equals("99999") == false);
		
		String[] directionsArray = new String[N];
	
		for(int i = N - 1; i >= 0; i--) {
			
			directionsArray[i] = directions.pop();
			
		}
	
		input.close();
		String lastInstruction = "kekw";
		
		for(int i = 0; i < N - 1; i++) {
			
			int turn1 = Character.getNumericValue(directionsArray[i].charAt(0));
			int turn2 = Character.getNumericValue(directionsArray[i].charAt(1));
			
			if((turn1 + turn2) == 0) {
				System.out.println(lastInstruction + " " + directionsArray[i].charAt(2) + directionsArray[i].charAt(3) + directionsArray[i].charAt(4));
				
			}else if ((turn1 + turn2)%2 == 0) {
				System.out.println("right " + directionsArray[i].charAt(2) + directionsArray[i].charAt(3) + directionsArray[i].charAt(4));
				lastInstruction = "right";
			}else if((turn1 + turn2)%2 == 1) {
				System.out.println("left " + directionsArray[i].charAt(2) + directionsArray[i].charAt(3) + directionsArray[i].charAt(4));
				lastInstruction = "left";
			}
			
		}
		
	}

}
