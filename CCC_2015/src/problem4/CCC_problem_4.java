package problem4;
import java.util.Arrays;
import java.util.Scanner;

public class CCC_problem_4 {
	
	private char[] array1;
	private int[] array2;
	
	public CCC_problem_4(char[] array1, int[] array2) {
		this.array1 = array1;
		this.array2 = array2;
		
	}
	
	public char[] getStringArray() {
		return array1;
	}
	
	public int[] getIntArray() {
		return array2;
	}
	
	public static void time(CCC_problem_4 arrays) {
		
		int[] numbers = arrays.getIntArray();
		char[] commands = arrays.getStringArray();
		int[] times = new int[101];
		Arrays.fill(times, 0);
		
		for(int i = 0; i < numbers.length; i++) {
			
			if(commands[i] == 'R') {
				
				int waitLength = 0;
				
				for(int i2 = i + 1; i2 < numbers.length; i2++) {
					
					if(commands[i2] == 'S' && numbers[i2] == numbers[i] && commands[i2 - 1] == 'W') {
						break;
					
					}else if(commands[i2] == 'S' && numbers[i2] == numbers[i]) {
						waitLength++;
						break;
						
					}else if(commands[i2] == 'W' ) {
						
						waitLength += numbers[i2];
						
					}else if(commands[i2 - 1] == 'W') {
						
					}else if(i2 == numbers.length - 1) {
						waitLength = -1;
					}else {
						waitLength++;
					}
				}
				if(waitLength == -1) {
					
					times[numbers[i]] = -1;
					
				}else {
					times[numbers[i]] += waitLength;//give time waited to the value in array corresponding to it	
				}
				
			}				
		}
		
		for(int i = 0; i < times.length; i++) {
			if(times[i] != 0) {
				System.out.println(i + " " + times[i]);
			}
		}
	}
	
	public static CCC_problem_4 splitMessages(String[] messages) {//split inputs into char array and integer array
		
		int[] numbers = new int[messages.length];
		char[] commands = new char[messages.length];
		
		for(int i = 0; i < messages.length; i++) {
			String[] parts = messages[i].split(" ", 2);
			numbers[i] = Integer.parseInt(parts[1]);
			commands[i] = parts[0].charAt(0);
		}
		
		return new CCC_problem_4(commands, numbers);
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int messageNumber = input.nextInt();
		input.nextLine();
		
		String[] messages = new String[messageNumber];
		int i = 0;
		do{
			messages[i] = input.nextLine();
			i++;
		}while(i < messages.length);
		time(splitMessages(messages));
		
		input.close();
		
	}
}
