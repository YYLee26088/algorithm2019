package algorithm_lecture;
/*
 * selection sort 구현 #1
 * 19.03.24
 */
import java.util.Arrays;

public class SelectionSort01 {

	static void swap(int[] a, int i, int j) {
		int temp=a[i];
		
		a[i]=a[j];
		a[j]=temp;

	}
	
	static int findMin(int[] a, int start) {
		int index=start;
		
		for(int i=start;i<a.length;i++) {
			if(a[i]<a[index])
				index=i;
		}
		
		return index;
	}

	// selection sort>>최소값으로 구현
	static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; ++i) {
			int minIndex = findMin(a, i); // 배열 a의 i 위치부터 끝까지에서 가장 작은 값을 찾아서
			swap(a, i, minIndex);         // 그 값을 i 위치로 이동한다
		}
	}

	public static void main(String[] args) {
		int[] a = { 17, 14, 11, 19, 13, 15, 18, 12, 16, 20 };

		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}


}
