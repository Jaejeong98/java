package ¼öÇĞp3;

import java.util.*;

public class n_4299 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=sc.nextInt(), sub=sc.nextInt();
		int A=(sum+sub)/2, B=(Math.max(sum,sub)-(sum+sub)/2);
		if((sum+sub)%2!=0||sum<sub)
			System.out.println(-1);
		else
			System.out.println((int)A+" "+(int)B);
	}
}
