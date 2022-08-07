package rememory;
import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Ascending[] = {5,27,6,11,15,31};
		Arrays.sort(Ascending);
		System.out.print("정렬 : ");
		
		for(int num : Ascending) {
			System.out.print(num +"  ");
		}
		
		
		//일반 sort라면 오름차순으로 정렬, 기존 저열에 변화를 주려면 Comparator 필요.
		Student[] students = new Student[5];
		students[0] = new Student(75,"Ann");
		students[1] = new Student(52,"Kin");
		students[2] = new Student(88,"shn");
		students[3] = new Student(63,"Lee");
		students[4] = new Student(76,"Hae");
		
		//Array.sort에 적용되는 알골리즘. Dual-Pivot Quicksort
		Arrays.sort(students,(s1,s2) ->  s1.getScore() > s2.getScore() ? -1:1 );
		
		System.out.print('\n'+"정렬 : ");
		
		for(Student student : students) {
			System.out.print(student.toString()+"  ");
		}
		
	}
	
}

class Student{
	public int getScore() {
		return score;
	}
	public String getName() {
		return name;
	}
	public Student(int score, String name) {
		this.score = score;
		this.name = name;
	}
	private int score;
	private String name;
	
	public String toString() {
		return name+"의 점수 "+score;
	}
	
	
}