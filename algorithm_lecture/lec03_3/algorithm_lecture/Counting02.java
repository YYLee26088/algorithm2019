package algorithm_lecture;
/*
 * ���ĺ� �ҹ��ڸ� �ִ� ����� ������ ����
 */
public class Counting02 {
	
	static void counting(char[] a) {
		int[] count=new int[26];//�ҹ��� ����
		for(char c:a) {
			++count[c-'a'];//c-'a'�� ī������ �ø���
		}
		int index=0;
		for(int i=0;i<count.length;i++) {
			for(int j=0;j<count[i];j++) {//���� Ƚ����� ����
				a[index++]=(char)('a'+i);//a���� ���ʷ� ����
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
