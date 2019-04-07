package algorithm_lecture;

import java.util.Map;
import java.util.TreeMap;

/*
 * ���� ����
 */
public class Counting01 {

	static void counting(char[] a) {
		Map<Character, Integer> countMap=new TreeMap<>();
		for(char c:a) {
			Integer i=countMap.get(c);
			if(i==null)
				i=0;
			countMap.put(c,i+1);
		}
		int index=0;
		for(char c:countMap.keySet()) {
			for(int i=0;i<countMap.get(c);i++) {
				a[index++]=c;//index+1 �� index�� ���� ��ȭ��Ű�� �ʴ´�//index++�� index�� ���� ��ȭ��Ų��
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a = "hello world. good morning. how are you.".toCharArray();
		counting(a);
		System.out.printf("[%s]\n", new String(a));

	}

}
