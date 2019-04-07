package algorithm_lecture;
/*
 * 알파벳 소문자만 있는 경우의 간결한 구현
 */
public class Counting02 {
	
	static void counting(char[] a) {
		int[] count=new int[26];//소문자 개수
		for(char c:a) {
			++count[c-'a'];//c-'a'의 카운팅을 늘린다
		}
		int index=0;
		for(int i=0;i<count.length;i++) {
			for(int j=0;j<count[i];j++) {//나온 횟수대로 정렬
				a[index++]=(char)('a'+i);//a부터 차례로 정렬
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a = "helloworldgoodmorninghowareyou".toCharArray();
        counting(a);
        System.out.printf("[%s]\n", new String(a));

	}

}
