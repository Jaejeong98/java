package 기본수학1;

import java.util.*;

public class n_2869 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt(), B=sc.nextInt(), V=sc.nextInt();
		if((V-B)%(A-B)==0)
			System.out.println((V-B)/(A-B));
		else
			System.out.println((V-B)/(A-B)+1);
	}
}
