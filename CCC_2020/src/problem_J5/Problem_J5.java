package problem_J5;

import java.util.Scanner;
import java.util.Arrays;

public class Problem_J5 {//first time using breadth first search

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int rows = input.nextInt();
		int columns = input.nextInt();
		int target = rows*columns;
		boolean[] checked = new boolean[target + 1];
		Arrays.fill(checked, false);
		
		int[][] room = new int[rows + 1][columns + 1];
		
		for(int x = 1; x < rows + 1; x++) {
			for(int y = 1; y < columns + 1; y++) {
				
				room[x][y] = input.nextInt();
				
			}
		}
		input.close();
		
		int[] searchQueue = new int[target + 1];
		Arrays.fill(searchQueue, -1);//fill the search queue with -1
		
		int currentExploration = 0;
		int emptySpot = 0;
		
		searchQueue[emptySpot] = room[1][1];//the first empty spot is filled with the first array value
		emptySpot++;
		
		if (searchQueue[currentExploration] == target) {//if its already at the target then just say yes
			System.out.println("yes");
			System.exit(0);
		}
		do {
			
			for(int x = 1; x < rows + 1; x++) {
				for(int y = 1; y < columns + 1; y++) {
						
					if(x*y == searchQueue[currentExploration]) {
							
						if(room[x][y] == target) {
								
							System.out.println("yes");
							System.exit(0);
						}
							
						if(checked[room[x][y]] == false){
								
							searchQueue[emptySpot] = room[x][y];
							emptySpot++;
							checked[room[x][y]] = true;
						}
					}
					
				}
			}
			currentExploration++;
		}while(searchQueue[currentExploration] != -1);
		System.out.println("no");
	}
}
