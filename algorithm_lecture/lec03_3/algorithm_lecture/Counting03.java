package algorithm_lecture;
/*
 * 0,1 정렬
 */
public class Counting03 {

	static void counting(char[] a) {
		int count=0;
		for(char c:a) {
			if(c=='0')
				count++;
		}
		for(int i=0;i<a.length;i++) {
			a[i]=(i<count)?'0':'1';//0이 count개 있으므로 정렬된 배열에서 1의 인덱스는 count부터이다.
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a = "0101000010100010111".toCharArray();
		counting(a);
		System.out.printf("[%s]\n", new String(a));


	}

}
