package algorithm_lecture;
/*
 * 최대값찾기 테스트
 */
public class Test03 {

	static int findMax(int[] a, int end) {
		int index=end;

		for(int i=end;i>0;i--) {
			if(a[i]>a[index])
				index=i;
		}

		return index;
	}

	public static void main(String[] args) {
		int[] a = { 14, 11, 13, 15 };

		for (int i = 0; i < a.length; ++i) {
			int minIndex = findMax(a, i);
			System.out.println(a[minIndex]);
		}
	}


}
