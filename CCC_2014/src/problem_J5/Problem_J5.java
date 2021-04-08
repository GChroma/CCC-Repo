package problem_J5;
import java.util.Scanner;
public class Problem_J5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.nextLine();
		String names1 = input.nextLine();
		String names2 = input.nextLine();
	
		String[] n1 = names1.split(" ", 0);
		String[] n2 = names2.split(" ", 0);
	
		boolean bad = false;
		
		for(int i = 0; i < N; i++) {
			
			if(n1[i].equals(n2[i])) {
				
				bad = true;
				break;
			}
			
			for(int i2 = 0; i2 < N; i2++) {
				
				if(i == i2) {
					
				}else if(n1[i2] == n1[i]) {
					
					if(n2[i2] != n2[i]) {
						bad = true;
					}
					
				}else if(n1[i2] == n2[i]) {
					
					if(n2[i2] != n1[i]) {
						bad = true;
					}
				}else if(n2[i2] == n1[i]) {
					
					if(n1[i2] != n2[i]) {
						bad = true;
					}
				}else if(n2[i2] == n2[i]) {
					
					if(n1[i2] != n1[i]) {
						bad = true;
					}		
				}
			}
		}
		
		if(bad == true) {
			System.out.println("bad");
		}else {
			System.out.println("good");
		}
		input.close();
	}
}
