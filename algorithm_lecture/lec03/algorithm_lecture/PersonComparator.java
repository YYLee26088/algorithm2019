package algorithm_lecture;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		int c1=p1.name.compareTo(p2.name);//�̸� �켱 ��
		if(c1!=0)//�̸��� �ٸ���
			return c1;//�̸� �� ��� ����
		return p1.age-p2.age;//�̸��� ���� ��, ���� �� ��� ����
	}

}
