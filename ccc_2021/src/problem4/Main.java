package problem4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {//askjdhajsdhakjsdhkagilurwhsfgduvfidhsueabhjvfsyugdivfsea
		
		Scanner input = new Scanner(System.in);
		String bookshelf = input.nextLine();
		char[] books = bookshelf.toCharArray();
		input.close();
		int smallBooks = 0;
		int mediumBooks = 0;
		int largeBooks = 0;
		int bookNumber = books.length;
		int flips = 0;
		
		for(int i = 0; i < bookNumber; i++ ) {
			
			if(books[i] == 'S') {
				
				smallBooks++;
				
			}else if(books[i] == 'M') {
			
				mediumBooks++;
				
			}else if(books[i] == 'L') {
				
				largeBooks++;
				
			}
			
		}
		
		if(mediumBooks == 0) {
			
			for(int i = largeBooks; i < bookNumber; i++) {
				if(books[i] == 'L') {
					flips++;
				}
			}
			
		}else {
			//search from right for L, then search from left for M or S. Swap positions.
			//If going from the right doesn't find L within smallBooks + mediumBooks, all L are sorted
			for(int i = largeBooks; i < bookNumber; i++ ) {//Sort L's
				
				if(books[i] == 'L') {//there is an 'L' that must be swapped
				
					
					boolean swappedWithM = false;
					for(int i2 = 0; i2 < largeBooks; i2++) {
						
						if(books[i2] == 'M') {
						
							books[i] = books[i2];
							books[i2] = 'L';
							flips++;
							swappedWithM = true;
							break;
							
						}
					}
					if(swappedWithM == false) {
						for(int i2 = 0; i2 < bookNumber; i2++) {
							
							if(books[i2] == 'S') {
							
								books[i] = books[i2];
								books[i2] = 'L';
								flips++;
								break;
							}
						}
					}
				}
			}
			//All L's should be sorted by here.
			
			for(int i = largeBooks + mediumBooks; i < bookNumber; i++) {
				if(books[i] == 'S') {
					flips++;
					
				}
			}
		}
		System.out.println(flips);
	}
}
