package algorithm_lecture;
/*
 * selection sort ���� #1
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

	// selection sort>>�ּҰ����� ����
	static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; ++i) {
			int minIndex = findMin(a, i); // �迭 a�� i ��ġ���� ���������� ���� ���� ���� ã�Ƽ�
			swap(a, i, minIndex);         // �� ���� i ��ġ�� �̵��Ѵ�
		}
	}

	public static void main(String[] args) {
		int[] a = { 17, 14, 11, 19, 13, 15, 18, 12, 16, 20 };

		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}


}
