package algorithm_lecture;
/*
 * insert sort ����
 * 19.03.24
 * �����ʿ�..
 */
import java.util.Arrays;

public class InsertSort {

	public static void insertSort(int[] a) {
		for(int i=1; i<a.length; i++) {
			int temp=a[i];//�� ����
			int j;
			for(j=i-1;j>=0;j--) 
				if(a[j]>temp)
					a[j+1]=a[j];//ū �� �ڷ� �̵�
				else
					break;
			a[j+1]=temp;//�� ����
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 17, 14, 11, 19, 13, 15 };

		insertSort(a);
		System.out.println(Arrays.toString(a));
	}

}
