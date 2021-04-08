package problem5;
import java.util.Scanner;
import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		int columns = input.nextInt();
		int choices = input.nextInt();
		input.nextLine();

		
		String[] strokes = new String[choices];
		for(int i = 0; i < choices; i++) {
			
			strokes[i] = input.nextLine();
			
		}
		input.close();
		
		int[] columnStrokes = new int[columns + 1];
		
		Arrays.fill(columnStrokes, 0);
		
		int[] rowStrokes = new int[rows + 1];
		
		Arrays.fill(rowStrokes, 0);
		
		
		for(int i = 0; i < choices; i++) {
			
			
			if(strokes[i].charAt(0) == 'R') {
				
				rowStrokes[Integer.parseInt(strokes[i].split(" ", 0)[1])]++;
				
			}else if(strokes[i].charAt(0) == 'C') {
				
				columnStrokes[Integer.parseInt(strokes[i].split(" ", 0)[1])]++;
				
			}
			
		}
		
		int golds = 0;
		
		for(int y = 1; y < rows + 1; y++) {
			for(int x = 1; x < columns + 1; x++) {
				
			
				if((rowStrokes[y]+ columnStrokes[x]%2 == 1)) {
					
					golds++;
					
				}
				
			}
		}
		
		System.out.println(golds);
		
		
	}
}
