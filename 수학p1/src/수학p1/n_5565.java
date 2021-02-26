package ¼öÇÐp1;

import java.util.*;

public class n_5565 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
		for(int i=1; i<10; i++) {
			int price=sc.nextInt();
			total-=price;
		}
		System.out.println(total);
	}
}
