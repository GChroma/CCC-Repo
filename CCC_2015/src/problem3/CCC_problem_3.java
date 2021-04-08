package problem3;
import java.util.Scanner;

public class CCC_problem_3 {
	
	public static void main(String[] args) {
		//                  a   a   a   e   e   e   e   i   i   i   i   i   o   o   o   o   o   o   u   u   u   u   u   u   u   u
		//                  0       2   3   4       6                       12  13   14             18   19  20                  25 
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};//vowels are alphabet[0,4,8,14,20]
		//char[] consonants = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
		//char[] vowels = {'a','e','i','o','u'};
		String word;
		Scanner input = new Scanner(System.in);
		
		word = input.nextLine();
		
		input.close();
		
		for(int i = 0; i < word.length(); i++) {				
			
			int i1 = 0;
			
			while(alphabet[i1] != word.charAt(i)) {
					
				i1++;	
			}
			
			if(i1 == 0 || i1 == 4 || i1 == 8 || i1 == 14 || i1 == 20 ) {
				
				System.out.print(word.charAt(i));
				
			}else {
				
				System.out.print(word.charAt(i));
				

				
				if(0 < i1 && i1 <= 2) {
					System.out.print('a');
				}else if(2 < i1 && i1 <= 6) {
					System.out.print('e');
				}else if (6 < i1 && i1 <= 11) {
					System.out.print('i');
				}else if(11 < i1 && i1 <= 17) {
					System.out.print('o');
				}else if(17 < i1) {
					System.out.print('u');
				}
				
				if(i1 == 3 || i1 == 7 || i1 == 13 || i1 == 19) {
					System.out.print(alphabet[i1 + 2]);
				}else if(i1 == 25) {
					System.out.print(alphabet[i1]);
				}else {
					System.out.print(alphabet[i1 + 1]);
				}
			}
		}
	}
}
