package algorithm_lecture;
/*
 * 16진수 radix sort
 * 뭐야 개어려워;;
 */
public class Radix01 {
	
	static void swap(int[] a,int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	static void counting(int[] a,int nth) {//nth자리를 기준으로 정렬
		int[] count=new int[16];
		for(int value:a) {
			int digit=value>>(nth*4)&0xF;
			++count[digit];
		}
		int[] index=new int[16];
		index[0]=0;
		for(int i=1;i<index.length;i++) {
			index[i]=index[i-1]+count[i-1];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
