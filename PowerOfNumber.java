package rememory;

public class PowerOfNumber {
//log n 복잡도 지수를 기준으로 생각할 경우.
	public static void main(String[] args) {

		int num = 2;
		int power = 5;

		System.out.println(powerBetter(num, power));
	}

	public static int powerBetter(int n, int pow) {
		if (pow == 0) {
			return 1;
		}
		
		int power_n_by2 = powerBetter(n, pow / 2);

		if (pow % 2 == 1) {
			return n * power_n_by2 * power_n_by2;
		} else {
			return power_n_by2 * power_n_by2;
		}

	}}
/*
 
주어진 power만큼 횟수가 증가.
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int result = powerOfNum(5,2);
	System.out.println(result);
}
static int powerOfNum(int power,int num) {
	
	if(power==1) {
		return num;
	}
	return num*powerOfNum(power-1,num);
	
}
*/