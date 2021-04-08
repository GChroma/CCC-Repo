package problem_J4;
import java.util.Scanner;
public class problem_J4 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int K = input.nextInt();
		int[] f = new int[K];
		
		for(int i = 0; i < K; i++) {//fill friends array
			f[i] = i + 1;
		}

		int m = input.nextInt();
		input.nextLine();
		int[] r = new int[m];
		
		int i = 0;
		do{
			r[i] = input.nextInt();
			i++;
		}while(i < m);
		
		input.close();
		
		for(i = 0; i < m; i++) {
			int counter = 1;
			for(int i2 = 0; i2 < K; i2++) {
				
				
				if(f[i2] == 0) {
				
				}else if(counter == r[i]) {
					f[i2] = 0;
					counter = 1;
				}else {
					counter++;
				}
			}
			
		}
		
		for(i = 0; i < K; i++) {
			if(f[i] != 0) {
				System.out.println(f[i]);
			}
		}
	}
}
