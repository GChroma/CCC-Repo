package problem_J4;
import java.util.Scanner;

public class Problem_J4 {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		String flips = input.nextLine();
		//ur = up right 
		//ul = up left 
		//br = bottom right etc.
		input.close();
		int ur = 2;
		int ul = 1;
		int br = 4;
		int bl = 3;
		
		for(int i = 0; i < flips.length(); i++) {
			
			//p for past.
			int pur = ur;
			int pul = ul;
			int pbr = br;
			int pbl = bl;
			
			
			if(flips.charAt(i) == 'H') {
				
				ur = pul;
				ul = pur;
				br = pbl;
				bl = pbr;
				
			}else if(flips.charAt(i) == 'V') {
				
				ur = pbr;
				ul = pbl;
				br = pur;
				bl = pul;
				
			}
		}
		
		System.out.println(ul + " " + ur + "\n" + bl + " " + br);
		
	}

}
