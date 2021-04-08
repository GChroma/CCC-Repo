package problem5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		int columns = input.nextInt();
		int choices = input.nextInt();
		input.nextLine();
		char[][] canvas = new char[rows + 1][columns + 1];
		
		for(int y = 1; y < rows + 1; y++) {
			for(int x = 1; x < columns + 1; x++) {
				canvas[y][x] = 'B';
			}
		}
		
		String[] strokes = new String[choices];
		for(int i = 0; i < choices; i++) {
			
			strokes[i] = input.nextLine();
			
		}
		
		char[] strokeAxis = new char[choices];
		int[] strokeLocation = new int[choices];
		
		
		for(int i = 0; i < choices; i++) {
		
			strokeAxis[i] = strokes[i].charAt(0);
			strokeLocation[i] = Integer.parseInt(strokes[i].split(" ", 0)[1]);
			
		}
		
		for(int i = 0; i < choices; i++) {//paint the strokes
			
			if(strokeAxis[i] == 'R') {//paint a row.
				
				for(int i2 = 1; i2 < columns + 1; i2++) {
					
					if(canvas[strokeLocation[i]][i2] == 'B') {
					
						canvas[strokeLocation[i]][i2] = 'G';
						
					}else {
						
						canvas[strokeLocation[i]][i2] = 'B';
					}
					
				}
				
			}
			
			if(strokeAxis[i] == 'C') {//paint a column.
				
				for(int i2 = 1; i2 < rows + 1; i2++) {
					
					if(canvas[i2][strokeLocation[i]] == 'B') {
					
						canvas[i2][strokeLocation[i]] = 'G';
						
					}else {
						
						canvas[i2][strokeLocation[i]] = 'B';
					}
					
				}
				
			}
		}
		int goldSpots = 0;
		for(int y = 1; y < rows + 1; y++ ) {
			for(int x = 1; x < columns + 1; x++) {
				if(canvas[y][x] == 'G') {
					goldSpots++;
				}
				
			}
		}
		
		System.out.println(goldSpots);
		
		
	}
}
