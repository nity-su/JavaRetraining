package rememory;

public class DescendingSpace {
	/*
* * * * * 
    * * * * 
        * * * 
            * * 
                * 
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 1;
		int nst = 5;
		
		int count = 5;
		
		while(row<=count) {
		
			int space = (row-1)*2;
			int col=1;
			
			while(nst+space>=col) {
				
				if(space>=col) {
					System.out.print("  ");
					col++;
					continue;
				}
				
				System.out.print("* ");
				col++;
				
			}
			
			nst--;
			System.out.println();
			
			row++;
			
		}
		
	}

}


// col을 5개에서 시작, col을 1개로 정의하고 시작.
// nst를 줄이면서 사용 -2씩 줄어듬, space 공간을 따로 더하고 nst 숫자를 뺌.