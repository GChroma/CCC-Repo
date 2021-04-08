package problem_J5;
import java.util.Scanner;
import java.util.Arrays;

public class Problem_J5 {
	

	public static void main(String[] args) {//Note: overall pretty inefficiently coded but I learned a lot. There are some weird things where I change between the actual page number and the page index in arrays.
		
		Scanner input = new Scanner(System.in);
		
		int pages = input.nextInt();
		input.nextLine();
		String[] pageData = new String[pages];
		boolean[] checkedPages = new boolean[pages + 1];
		int[] previousPage = new int[pages + 1];
		Arrays.fill(previousPage, -1);
		Arrays.fill(checkedPages, false);
		checkedPages[1] = true;
		
		for(int i = 0; i < pages; i++) {
			
			pageData[i] = input.nextLine();
			
		}
		
		input.close();
		
		int emptySpot = 0;
		int currentSearch = 0;
		int[] pagesToCheck = new int[pages + 1]; //100000 pages max
		
		
		Arrays.fill(pagesToCheck, -1);//starts at page 1 - BFS.
		pagesToCheck[emptySpot] = 0;
		emptySpot++;
		boolean shortest = true;
		int shortestPage = 0;
		
		do {
			if(Character.getNumericValue(pageData[pagesToCheck[currentSearch]].charAt(0)) == 0) {
				
				if(shortest == true) {
					shortestPage = pagesToCheck[currentSearch];
					shortest = false;
				}
			
			}else {	
				
				String[] page = pageData[pagesToCheck[currentSearch]].split(" ", 0);
				int[] pageInfo = new int[page.length];
				for(int i = 0; i < page.length; i++) {
					pageInfo[i] = Integer.parseInt(page[i]);
				}//format the info to an int array.
			
				for(int i = 0; i < pageInfo[0]; i++ ) {
					
					if(checkedPages[pageInfo[i + 1]] == false ) {
						
						pagesToCheck[emptySpot] = pageInfo[i + 1] - 1;
						emptySpot++;
						checkedPages[pageInfo[i + 1]] = true;
						previousPage[pageInfo[i + 1]] = pagesToCheck[currentSearch] + 1;
						
					}
					
				}
			}
			currentSearch++;
		}while(pagesToCheck[currentSearch] != -1);
		
		boolean allReachable = true;
		
		for(int i = 1; i < pages + 1; i++) {
			if(checkedPages[i] == false) {
				allReachable = false;
			}
		}
		
		if(allReachable == true) {
			System.out.println("Y");
		}else {
			System.out.println("N");
		}
		
		int i = shortestPage + 1;
		int pathLength = 1;
		while(previousPage[i] != -1) {
			i = previousPage[i];
			pathLength++;
			
		
		}
		System.out.println(pathLength);

	}

}
