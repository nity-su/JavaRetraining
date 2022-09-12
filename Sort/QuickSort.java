package rememory;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 2, 1, 6, 8, 5, 3, 4 };
		quickSorting(arr,0,arr.length-1);
		display(arr);
	}
	
	private static void display(int arr[]) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length;i++) {
			System.out.print(i+" ");			
		}
	}

	static void quickSorting(int arr[], int si, int ei) {
		
		if(si<=ei)
			return;
		
		int pivot = arr[ei];
		int pivotIndex = si;
		
		for(int i=si;si<ei-1;i++) {
			
			if(arr[i]<pivot) {
				swap(arr,i,pivotIndex);
				pivotIndex++;
			}
			quickSorting(arr,si,pivotIndex-1);
			quickSorting(arr,pivotIndex+1,ei);
		}
		swap(arr,pivotIndex,ei);		
		
	}
	
	static void swap(int arr[],int si,int ei){
		int temp = arr[si];
		arr[si]=arr[ei];
		arr[ei]=temp;		
	}

}
