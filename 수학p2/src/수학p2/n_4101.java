package ¼öÇÐp2;

import java.util.*;

public class n_4101 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			int n1=sc.nextInt(), n2=sc.nextInt();
			if(n1==0&&n2==0)
				break;
			if(n1>n2)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
