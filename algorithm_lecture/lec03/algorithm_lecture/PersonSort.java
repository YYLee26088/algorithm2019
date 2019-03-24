package algorithm_lecture;
/*
 * Person[] �迭 ����
 * 19.03.23
 */
import java.util.Arrays;

public class PersonSort {

	static void swap(Person[] a, int i, int j) {
		Person temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

	static int findMin(Person[] a, int start) {
		int index=start;
		for(int i=start;i<a.length;i++) {
			if(new PersonComparator().compare(a[i], a[index])<0)
				index=i;
		}
		return index;
	}

	// selection sort ����
	static void selectionSort(Person[] a) {
		for (int i = 0; i < a.length - 1; ++i) {
			int minIndex = findMin(a, i); 
			swap(a, i, minIndex);
		}
	}

	// bubble sort ����
	static void bubbleSort(Person[] a) {
		for(int i=a.length-1;i>0;i--) {
			boolean isEnd=true;
			for(int j=0;j<i;j++) {
				if(new PersonComparator().compare(a[j],a[j+1])>0) {
					swap(a,j,j+1);
					isEnd=false;
				}
			}
			if(isEnd)
				break;
		}
	}

	//insert sort ����
	public static void insertSort(Person[] a) {
		for(int i=1; i<a.length; i++) {
			Person temp=a[i];
			int j;
			for(j=i-1;j>=0;j--) 
				if(new PersonComparator().compare(a[j],temp)>0)
					a[j+1]=a[j];
				else
					break;
			a[j+1]=temp;
		}
	}

	public static void main(String[] args) {
		Person[] a1= {new Person("¯��",11),new Person("ö��",10),new Person("����",9)};
		Person[] a2= {new Person("¯��",11),new Person("¯��",14),new Person("¯��",10)};
		Person[] a3= {new Person("����",10),new Person("����",10),new Person("�ϴ�",10)};

		selectionSort(a1);
		System.out.println("���� ��� "+Arrays.toString(a1));

		bubbleSort(a2);
		System.out.println("���� ��� "+Arrays.toString(a2));

		insertSort(a3);
		System.out.println("���� ��� "+Arrays.toString(a3));
	}

}
