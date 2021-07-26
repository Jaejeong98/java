package 그리디_알고리즘_p1;

import java.util.*;

public class n_1789 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong(), sum=1, answer=1;
		while(sum<num) {
			answer++;
			sum+=answer;
		}
		if(sum>num)answer--;
		System.out.println(answer);
	}
}
