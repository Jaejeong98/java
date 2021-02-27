package ¼öÇÐp2;

import java.util.*;

public class n_10833 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(), sum=0;
		for(int i=0; i<T; i++) {
			int stu=sc.nextInt(), ap=sc.nextInt();
			sum+=ap%stu;
		}
		System.out.println(sum);
	}
}
