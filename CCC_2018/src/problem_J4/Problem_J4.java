package problem_J4;
import java.util.Scanner;

public class Problem_J4 {

	
	public static int[][] rotateCounterClockwise(int[][] data, int columns, int rows){
		int[][] unflippedData = new int[columns + 1][rows + 1];
		
		for(int y = 1; y < columns + 1; y++ ) {
			for(int x = 1; x < rows + 1; x++) {
				
				unflippedData[y][x] = data[y][x];
				
			}
			
		}
		
		for(int y = 1; y < columns + 1; y++ ) {
			for(int x = 1; x < rows + 1; x++) {
				
				data[y][x] = unflippedData[x][rows - (y - 1)];
			}
			
		}
		
		return data;
	}
	
	public static void printGrid(int[][] data, int columns, int rows) {
		
		for(int y = 1; y < columns + 1; y++) {
			for(int x = 1; x < rows + 1; x++) {
				System.out.print(data[y][x] + " ");
			}
			System.out.print("\n");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int dataSize = input.nextInt();
		int columns = dataSize;
		int rows = dataSize;
		int[][] data = new int[columns + 1][rows + 1];
		
		for(int y = 1; y < columns + 1; y++ ) {
			for(int x = 1; x < rows + 1; x++) {
				
				data[y][x] = input.nextInt();
				
			}
			
		}
		input.close();
		int[][] unflippedData = new int[columns + 1][rows + 1];
		
		for(int y = 1; y < columns + 1; y++ ) {
			for(int x = 1; x < rows + 1; x++) {
				
				unflippedData[y][x] = data[y][x];
				
			}
			
		}
		
		
		//check all edges for what direction it grows in
		//greater -> greater from left to right and from top to bottom.
		//lesser -> greater from right to left and from bottom to top.
		//top row and bottom row must be greater
		boolean topGreater = true;
		boolean leftGreater = true;
		boolean bottomGreater = true;
		boolean rightGreater = true;
	
		for(int i = 1; i < columns; i++) {//check top row. (not checking last data point)
			
			if(data[1][i] > data[1][i + 1]) {
				topGreater = false;
			}
			
		}
		
		for(int i = 1; i < rows; i++) {//check left column.
			
			if(data[i][1] > data[i + 1][1]) {
				leftGreater = false;
			}
			
		}
		for(int i = 1; i < columns; i++) {//check bottom row.
			
			if(data[rows][i] > data[rows][i]) {
				bottomGreater = false;
			}
			
		}
	
		for(int i = 1; i < rows; i++) {//check right column.

			if(data[columns][i] > data[columns][i + 1] ) {
					rightGreater = false;
			}
			
		}
		
		if(topGreater == true && leftGreater == true) {
			
			printGrid(data, columns, rows);
			System.exit(0);
		}else if(topGreater == false && rightGreater == false) {
			
			printGrid(rotateCounterClockwise(data, columns, rows), columns, rows);
			
			
			
		}else if (rightGreater == true && bottomGreater == false) {
			int[][] newGrid = rotateCounterClockwise(rotateCounterClockwise(data, columns, rows), columns, rows);
			printGrid(newGrid, columns, rows);
		}else if (bottomGreater == true && leftGreater == false) {
			
			int[][] newGrid = rotateCounterClockwise(rotateCounterClockwise(rotateCounterClockwise(data, columns, rows), columns, rows), columns, rows);
			printGrid(newGrid, columns, rows);
		}

	}

}
