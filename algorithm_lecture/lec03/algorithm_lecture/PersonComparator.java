package algorithm_lecture;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		int c1=p1.name.compareTo(p2.name);//이름 우선 비교
		if(c1!=0)//이름이 다르면
			return c1;//이름 비교 결과 리턴
		return p1.age-p2.age;//이름이 같을 때, 나이 비교 결과 리턴
	}

}
