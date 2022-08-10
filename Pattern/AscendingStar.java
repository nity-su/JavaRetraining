package rememory;

public class AscendingStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("DescendingStar");
		

		int row = 1;
		int n = 5; // repeat num
		
		while(row<=n) {
			
			int col = 1;
			
			while(col<=row) {
				System.out.print('*');
				col++;
			}
			
			row++;
			
			System.out.println("");
		}
		
	}

}

