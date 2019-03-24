package algorithm_lecture;

import java.util.Arrays;

/*
 * 문자 정렬
 * 190324
 */
public class CharSort {

	static void swap(char[] a, int i, int j) {
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

	static int findMin(char[] a, int start) {
		int index=start;
		for(int i=start;i<a.length;i++) {
			if(a[i]<a[index])
				index=i;
		}
		return index;
	}

	// selection sort 수정
	static void selectionSort(char[] a) {
		for (int i = 0; i < a.length - 1; ++i) {
			int minIndex = findMin(a, i); 
			swap(a, i, minIndex);
		}
	}

	// bubble sort 수정
	static void bubbleSort(char[] a) {
		for(int i=a.length-1;i>0;i--) {
			boolean isEnd=true;
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
					swap(a,j,j+1);
					isEnd=false;
				}
			}
			if(isEnd)
				break;
		}
	}

	//insert sort 수정
	public static void insertSort(char[] a) {
		for(int i=1; i<a.length; i++) {
			char temp=a[i];
			int j;
			for(j=i-1;j>=0;j--) 
				if(a[j]>temp)
					a[j+1]=a[j];
				else
					break;
			a[j+1]=temp;
		}
	}

	public static void main(String[] args) {
		char[] a1= {'A','z','G','r','t'};
		char[] a2= {'D','E','G','A','X'};
		char[] a3= {'e','s','g','a'};

		selectionSort(a1);
		System.out.println(Arrays.toString(a1));

		bubbleSort(a2);
		System.out.println(Arrays.toString(a2));

		insertSort(a3);
		System.out.println(Arrays.toString(a3));
	}

}
