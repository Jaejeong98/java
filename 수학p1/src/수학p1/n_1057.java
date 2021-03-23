package ¼öÇÐp1;

import java.util.*;

public class n_1057 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt(), n3=sc.nextInt(), count=0;
		while(n2!=n3) {
			n2=(n2-1)/2+1;
			n3=(n3-1)/2+1;
			count++;
		}
		System.out.println(count);
	}
}
