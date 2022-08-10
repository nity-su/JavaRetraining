package rememory;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 1;
		int nst = 1;
		int count = 5;
		
		while(row <= count) {
			
			int col = 1;
			
			while(col<=count) {
				
				if(count-nst>=col)
				System.out.print(" ");
				else {
				System.out.print("*");
				}
				
				col++;
			}
			System.out.println();
			row++;
			nst++;
		}
	}

}
