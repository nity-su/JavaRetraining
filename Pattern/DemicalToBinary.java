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
//			tenSquared�� 1�� �����ϸ鼭 �� �ڵ�� �ʿ� ������.
			
			bin += quotient*tenSquared;
			tenSquared = 10*tenSquared;
			
			dec = dec/2;
		}
		
		bin += tenSquared*dec;
		
		System.out.println(bin);
		
	}

}


/*

 ������ -> ������.
 10 -> 1010
 �������� �ִ��� ������.
 64 128 9
 */