package rememory;

public class DemicalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec =201;
		int bin = 0;
		int initDem = dec;
		
		int tenSquared = 1;
		
		
		while(dec>1) {
			
			int quotient = dec%2;
			
//			if(dec==initDem) {
//				bin+=quotient;
//			}
//			else {
//				bin += quotient*tenSquared;
//				tenSquared = 10*tenSquared;
//			}
//			tenSquared를 1로 수정하면서 위 코드는 필요 없어짐.
			
			bin += quotient*tenSquared;
			tenSquared = 10*tenSquared;
			
			dec = dec/2;
		}
		
		bin += tenSquared*dec;
		
		System.out.println(bin);
		
	}

}


/*

 십진수 -> 이진수.
 10 -> 1010
 나머지가 있느냐 없느냐.
 64 128 9
 */