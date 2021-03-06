package algorithm_lecture;
/*
 * String[] 배열 정렬
 * 19.03.23
 */
import java.util.Arrays;

public class StringSort {

	static void swap(String[] a, int i, int j) {
		String temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

	static int findMin(String[] a, int start) {
		int index=start;
		for(int i=start;i<a.length;i++) {
			if(a[i].compareTo(a[index])<0)
				index=i;
		}
		return index;
	}

	// selection sort 수정
	static void selectionSort(String[] a) {
		for (int i = 0; i < a.length - 1; ++i) {
			int minIndex = findMin(a, i); 
			swap(a, i, minIndex);
		}
	}

	// bubble sort 수정
	static void bubbleSort(String[] a) {
		for(int i=a.length-1;i>0;i--) {
			boolean isEnd=true;
			for(int j=0;j<i;j++) {
				if(a[j].compareTo(a[j+1])>0) {//compareTo 메소드 사용
					swap(a,j,j+1);
					isEnd=false;
				}
			}
			if(isEnd)
				break;
		}
	}

	//insert sort 수정
	public static void insertSort(String[] a) {
		for(int i=1; i<a.length; i++) {
			String temp=a[i];
			int j;
			for(j=i-1;j>=0;j--) 
				if(a[j].compareTo(temp)>0)
					a[j+1]=a[j];
				else
					break;
			a[j+1]=temp;
		}
	}

	public static void main(String[] args) {
		String[] a1= {"yellow", "green", "red", "blue", "white"};
		String[] a2= {"banana", "orange", "apple", "grape"};
		String[] a3= {"milk","coke","soda","juice","coffee"};

		selectionSort(a1);
		System.out.println("정렬 결과 "+Arrays.toString(a1));

		bubbleSort(a2);
		System.out.println("정렬 결과 "+Arrays.toString(a2));

		insertSort(a3);
		System.out.println("정렬 결과 "+Arrays.toString(a3));
	}

}
