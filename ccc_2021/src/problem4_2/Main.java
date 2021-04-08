package problem4_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String bookshelf = input.nextLine();
		char[] books = bookshelf.toCharArray();
		input.close();
		int smallBooks = 0;
		int mediumBooks = 0;
		int largeBooks = 0;
		int bookNumber = books.length;
		int flips = 0;
		char[] replace = new char[bookNumber];
		
 		
		for(int i = 0; i < bookNumber; i++ ) {
			
			if(books[i] == 'S') {
				
				smallBooks++;
				
			}else if(books[i] == 'M') {
			
				mediumBooks++;
				
			}else if(books[i] == 'L') {
				
				largeBooks++;
				
			}
			
		}
		char[] onlySandM = new char[smallBooks + mediumBooks];
		int replaceCounter = 0;
		for(int i = 0; i < largeBooks; i++) {//look through first largeBooks books for any book not L. put not L in replace array
			
			if(books[i] != 'L') {
				flips++;
				replace[replaceCounter] = books[i];
				replaceCounter++;
			}
			
		}
		replaceCounter = 0;
		int fillCounter = 0;
		for(int i = largeBooks; i < bookNumber; i++ ) {
			
			
			if(books[i] == 'L') {
				onlySandM[fillCounter] = replace[replaceCounter];
				replaceCounter++;
				fillCounter++;
			}else {
				onlySandM[fillCounter] = books[i];
				fillCounter++;
			}
		}
		
		
		for(int i = mediumBooks; i < mediumBooks + smallBooks; i++) {
			
			if(onlySandM[i] == 'M') {
				flips++;
			}
		}

		System.out.println(flips);
	}

}
