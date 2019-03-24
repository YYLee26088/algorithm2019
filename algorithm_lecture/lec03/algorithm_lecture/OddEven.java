package algorithm_lecture;
/*
 * �汝� 礎熱 碟葬
 * 19.03.24
 */
import java.util.Arrays;

public class OddEven {

	static void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

	static int findMin(int[] a, int start) {
		int index=start;
		for(int i=start;i<a.length;i++) {
			if(a[i]%2==0)
				index=i;
		}
		return index;
	}

	// selection sort 熱薑
	static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; ++i) {
			int minIndex = findMin(a, i); 
			swap(a, i, minIndex);
		}
	}

	// bubble sort 熱薑
	static void bubbleSort(int[] a) {
		for(int i=a.length-1;i>0;i--) {
			boolean isEnd=true;
			for(int j=0;j<i;j++) {
				if(a[j]%2!=0) {
					swap(a,j,j+1);
					isEnd=false;
				}
			}
			if(isEnd)
				break;
		}
	}

	//insert sort 熱薑
	public static void insertSort(int[] a) {
		for(int i=1; i<a.length; i++) {
			int temp=a[i];
			int j;
			for(j=i-1;j>=0;j--) 
				if(a[j]%2!=0)
					a[j+1]=a[j];
				else
					break;
			a[j+1]=temp;
		}
	}

	public static void main(String[] args) {
		int[] a1= {12,11,13,14};
		int[] a2= {62,45,21,52};
		int[] a3= {48,23,124,55,64,62,67};

		selectionSort(a1);
		System.out.println(Arrays.toString(a1));

		bubbleSort(a2);
		System.out.println(Arrays.toString(a2));

		insertSort(a3);
		System.out.println(Arrays.toString(a3));
	}

}
