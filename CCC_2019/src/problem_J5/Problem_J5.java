package problem_J5;
import java.util.Scanner;

public class Problem_J5 {
	
	public static String r1in, r1out, r2in, r2out, r3in, r3out;
	public static String[] visitedPoints;
	

	public static boolean checkVisited(String[] visitedPoints, String child) {
		
		boolean visited = false;
		
		for(int i = 0; i < visitedPoints.length; i++) {
			if(child.equals(visitedPoints[i])) {
				visited = true;
			}
		}
		return visited;
		
	}
	
	
	public static void dfs(String I, String F) {
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String r1 = input.nextLine();
		String r2 = input.nextLine();
		String r3 = input.nextLine();
		String specs = input.nextLine();
		input.close();

	    r1in = r1.split(" ", 0)[0];
		r1out = r1.split(" ", 0)[1];
		
		r2in = r2.split(" ", 0)[0];
		r2out = r2.split(" ", 0)[1];
		
		r3in = r3.split(" ", 0)[0];
		r3out = r3.split(" ", 0)[1];
		
		int S = Integer.parseInt(specs.split(" ", 0)[0]);
		String I = specs.split(" ", 0)[1];
		String F = specs.split(" ", 0)[2];
		visitedPoints = new String[1000];
		
	}

}
