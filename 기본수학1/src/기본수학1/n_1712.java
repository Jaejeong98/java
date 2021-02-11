package 기본수학1;

import java.util.*;

public class n_1712 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt(), B=sc.nextInt(), C=sc.nextInt();
		
		if(B-C>0) 
			System.out.println(A/(C-B)+1);
		else
			System.out.println("-1");
	}
}

