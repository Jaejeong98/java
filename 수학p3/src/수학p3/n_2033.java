package ¼öÇÐp3;

import java.util.*;

public class n_2033 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(), i=1;
		while((int)Math.pow(10, i)<=num) {
			int re=num%(int)Math.pow(10, i);
			num/=(int)Math.pow(10, i);
			num*=(int)Math.pow(10,i);
			if(re>=5*(int)Math.pow(10, i)/10)
				num+=(int)Math.pow(10, i);
			i++;
		}
		System.out.println(num);
	}
}
