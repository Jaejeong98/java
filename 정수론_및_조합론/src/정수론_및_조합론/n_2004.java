package 정수론_및_조합론;

import java.util.*;

public class n_2004 {
	public static long count_five(long N) {
		int count=0;
		while(N>=5) {
			count+=N/5;
			N/=5;
		}
		return count;
	}
	public static long count_two(long n) {
		int count=0;
		while(n>=2) {
			count+=n/2;
			n/=2;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt(), m=sc.nextInt();
		long count_5=count_five(n)-count_five(m)-count_five(n-m);
		long count_2=count_two(n)-count_two(m)-count_two(n-m);
		System.out.println(Math.min(count_5, count_2));
	}
}
