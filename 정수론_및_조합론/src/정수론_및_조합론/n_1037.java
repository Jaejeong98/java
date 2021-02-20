package 정수론_및_조합론;

import java.util.*;

public class n_1037 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long result=0;
		int min=1000000, max=0;
		boolean t=true;
		for(int i=0; i<N; i++) {
			int num=sc.nextInt();
			if(N==1) {
				result=(long)Math.pow(num, 2);
				t=false;
				break;
			}
			else {
				if(min>num)
					min=num;
				if(max<num)
					max=num;
			}
		}
		if(t==true)
			result=min*max;
		System.out.println(result);
	}
}
