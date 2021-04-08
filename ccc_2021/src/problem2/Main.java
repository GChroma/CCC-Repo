package problem2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.nextLine();
		String[] people = new String[N];
		int[] bids = new int[N];
		
		for(int i = 0; i < N; i++) {
			
			people[i] = input.nextLine();
			bids[i] = input.nextInt();
			input.nextLine();
			
		}
		
		input.close();
		int highestBid = bids[0];
		
		for(int i = 1; i < N; i++) {
			
			if(highestBid < bids[i]) {
				highestBid = bids[i];
				
			}
			
		}
		
		for(int i = 0; i < N; i++) {
			if(highestBid == bids[i]) {
				System.out.println(people[i]);
				System.exit(0);
			}
		}
		
	}
}
