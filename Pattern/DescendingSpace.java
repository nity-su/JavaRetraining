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


// col�� 5������ ����, col�� 1���� �����ϰ� ����.
// nst�� ���̸鼭 ��� -2�� �پ��, space ������ ���� ���ϰ� nst ���ڸ� ��.