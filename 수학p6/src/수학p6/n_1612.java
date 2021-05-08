package ¼öÇÐp6;

import java.util.*;

public class n_1612 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0||num%5==0)
			System.out.println(-1);
		else {
			int count=1, n=1;
			while(true) {
				if(n%num==0)
					break;
				n%=num;
				n=n*10+1;
				count++;
			}
			System.out.println(count);
		}
	}
}