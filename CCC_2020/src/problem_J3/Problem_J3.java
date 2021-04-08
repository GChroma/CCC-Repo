package problem_J3;
import java.util.Scanner;

public class Problem_J3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		input.nextLine();
		String[] splats = new String[N];
		int[] x = new int[N];
		int[] y = new int[N];
		
		for(int i = 0; i < N; i++) {
			
			splats[i] = input.nextLine();
			
		}
		
		input.close();
		String[] splitSplat = new String[1];
		
		for(int i = 0; i < N; i++) {
			
			splitSplat = splats[i].split(",", 0);
			x[i] = Integer.parseInt(splitSplat[0]);
			y[i] = Integer.parseInt(splitSplat[1]);
			
		}
		
		int smallestx = x[0];
		int smallesty = y[0];
		int largestx = x[0];
		int largesty = y[0];
		
		
		for(int i = 0; i < N; i++) {
			if(i == N - 1) {
		
			}else if(x[i] > x[i + 1]) {
			
				smallestx = x[i+1];
				
			}			
		}
		
		for(int i = 0; i < N; i++) {
			if(i == N - 1) {
				
			}else if(y[i] > y[i + 1]) {
			
				smallesty = y[i+1];
				
			}			
		}
		
		for(int i = 0; i < N; i++) {
			
			if(i == N - 1) {
				
			}else if(x[i] < x[i + 1]) {
			
				largestx = x[i+1];
				
			}			
		}
		
		for(int i = 0; i < N; i++) {
			
			if(i == N - 1) {
				
			}else if(y[i] < y[i + 1]) {
			
				largesty = y[i+1];
				
			}			
		}
		
		System.out.println((smallestx - 1) + "," + (smallesty - 1));
		System.out.println((largestx + 1) + "," + (largesty + 1));
	}
}