package algorithm_lecture;

import java.util.Arrays;

/*
 * ����� ���� ����
 */
public class Counting04 {
	
	static void counting(Person2[] a) {
		int woman=0;
		for(Person2 p:a) {
			if(p.getSex().equals("����"))
				++woman;
		}
		Person2[] pSort=new Person2[a.length];
		int indexW=0;
		int indexM=woman;
		
		for(Person2 p:a) {
			if(p.getSex().equals("����"))
				pSort[indexW++]=p;
			else
				pSort[indexM++]=p;
		}
		for(int i=0;i<a.length;i++) {
			a[i]=pSort[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2[] a = { new Person2("ȫ�浿", "����", "O"),
                new Person2("����ġ", "����", "A"),
                new Person2("������", "����", "AB"),
                new Person2("�̸���", "����", "D"),
                new Person2("��û", "����", "O"),
                new Person2("�Ӳ���", "����", "A"),
                new Person2("����", "����", "AB")
        };

        counting(a);
        System.out.println(Arrays.toString(a));


	}

}
