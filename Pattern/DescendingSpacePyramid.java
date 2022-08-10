package rememory;

public class DescendingSpacePyramid {
/*

* * * * * 
    * * * * 
        * * * 
            * * 
                * 
            * * 
        * * * 
    * * * * 
* * * * *

*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 1;
		int n = 5;
		int nst = 5;
		int space = 0;
		
		boolean reverseOn = false;
		
		while(2*n-1>=row) {
		
			int counter = 0;
			
			while(space>counter) {
				System.out.print("  ");
				counter++;
			}
			
			
			int col = 1;
			
			while(col<=nst) {
				System.out.print("* ");
				col++;
			}
			
			
			System.out.println();
						
			row++;
			
			if(row<=n) {
				space += 2;
				nst--;
			}else {
				space -= 2;
				nst++;
			}
			
			
		}

	}

}

/*
 col을 줄인다 space 줄인다, nst는 늘린다.
 same loop?
 
 */