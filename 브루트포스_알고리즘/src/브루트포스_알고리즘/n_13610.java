package 브루트포스_알고리즘;

import java.util.*;

public class n_13610 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt(),c=1;
		while(true) {
			if(n2*c-n1*c>=n2) break;
			c++;
		}
		System.out.println(c);
	}
}
