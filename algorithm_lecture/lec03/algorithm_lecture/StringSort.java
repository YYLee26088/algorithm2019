package algorithm_lecture;
/*
 * String[] �迭 ����
 * 19.03.23
 */
import java.util.Arrays;

public class StringSort {

	static void swap(String[] s, int i, int j) {
		String temp=s[i];
		s[i]=s[j];
		s[j]=temp;
	}

	static int findMin(String[] s, int start) {
		int index=start;
		for(int i=start;i<s.length;i++) {
			if(s[i].compareTo(s[index])<0)
				index=i;
		}
		return index;
	}

	// selection sort ����
	static void selectionSort(String[] a) {
		for (int i = 0; i < a.length - 1; ++i) {
			int minIndex = findMin(a, i); 
			swap(a, i, minIndex);
		}
	}

	// bubble sort ����
	static void bubbleSort(String[] s) {
		for(int i=s.length-1;i>0;i--) {
			boolean isEnd=true;
			for(int j=0;j<i;j++) {
				if(s[j].compareTo(s[j+1])>0) {//compareTo �޼ҵ� ���
					swap(s,j,j+1);
					isEnd=false;
				}
			}
			if(isEnd)
				break;
		}
	}

	//insert sort ����
	public static void insertSort(String[] s) {
		for(int i=1; i<s.length; i++) {
			String temp=s[i];
			int j;
			for(j=i-1;j>=0;j--) 
				if(s[j].compareTo(temp)>0)
					s[j+1]=s[j];
				else
					break;
			s[j+1]=temp;
		}
	}

	public static void main(String[] args) {
		String[] s1= {"yellow", "green", "red", "blue", "white"};
		String[] s2= {"banana", "orange", "apple", "grape"};
		String[] s3= {"milk","coke","soda","juice","coffee"};

		selectionSort(s1);
		System.out.println("���� ��� "+Arrays.toString(s1));
		
		bubbleSort(s2);
		System.out.println("���� ��� "+Arrays.toString(s2));
		
		insertSort(s3);
		System.out.println("���� ��� "+Arrays.toString(s3));
	}

}
