package algorithm_lecture;

import java.util.Arrays;

/*
 * 사람을 성별 정렬
 */
public class Counting04 {
	
	static void counting(Person2[] a) {
		int woman=0;
		for(Person2 p:a) {
			if(p.getSex().equals("여자"))
				++woman;
		}
		Person2[] pSort=new Person2[a.length];
		int indexW=0;
		int indexM=woman;
		
		for(Person2 p:a) {
			if(p.getSex().equals("여자"))
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
		Person2[] a = { new Person2("홍길동", "남자", "O"),
                new Person2("전우치", "남자", "A"),
                new Person2("성춘향", "여자", "AB"),
                new Person2("이몽룡", "남자", "D"),
                new Person2("심청", "여자", "O"),
                new Person2("임꺽정", "남자", "A"),
                new Person2("장길산", "남자", "AB")
        };

        counting(a);
        System.out.println(Arrays.toString(a));


	}

}
