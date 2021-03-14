package ¼öÇÐp3;

import java.util.*;

public class n_14916 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num==1||num==3)
			System.out.println(-1);
		else {
			switch(num%5) {
				case 1:
					System.out.println((num/5)+2); break;
				case 2:
					System.out.println(num/5+1); break;
				case 3:
					System.out.println(num/5+3); break;
				case 4:
					System.out.println(num/5+2); break;
				default:
					System.out.println(num/5); break;
			}
		}
	}
}
