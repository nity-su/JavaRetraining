package rememory;
//�����佺�׳׽��� ü
public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//n ����
		
		int n= 50;
		primeNumber(n);
	}
	
	static void primeNumber(int n) {
		
		//0,1����.
		//0~49 -> 0~50;
		
		boolean primes[]=new boolean[n+1];
		
		for(int i=0; i<primes.length;i++) {
			primes[i]=true;			
		}
		
		int num=2;
		while(num*num<n) {
			
			if(primes[num]) {
			for(int multi=2;num*multi<=n;multi++) {
				//�ݺ��� for�� ������ ���ڴ� ��� �Ҽ��� �ƴϴ�.
				primes[num*multi]=false;
				}
			}
			num++;
		}
		
		for(int i=2;i<primes.length;i++) {
			
			if(primes[i]) {
				System.out.println(i);
			}
			
		}
	}

}
