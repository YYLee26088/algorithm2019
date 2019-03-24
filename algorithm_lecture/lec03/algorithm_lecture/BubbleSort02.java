package algorithm_lecture;
/*
 * bubble sort 개선 구현
 */
import java.util.Arrays;

public class BubbleSort02 {

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	// bubble sort
	static void bubbleSort(int[] a) {
		for(int i=a.length-1;i>0;i--) {//가장 큰 수는 맨 뒤로 감
			boolean isEnd=true;//무의미한 반복을 없앨 변수
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {//앞 수와 뒤 수를 비교
					swap(a,j,j+1);//자리 바꿈
					isEnd=false;
				}
			}
			if(isEnd)//반복문을 다 돌기 전에 정렬이 다 되었으면 반복문을 바로 종료한다
				break;
		}
	}

	public static void main(String[] args) {
		int[] a = { 17, 14, 11, 19, 13, 15, 20, 12, 16, 18 };

		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}

}
