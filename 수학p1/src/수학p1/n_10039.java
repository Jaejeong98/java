package ����p1;

import java.util.*;

public class n_10039 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=0; i<5; i++) {
			int score=sc.nextInt();
			if(score<40)
				score=40;
			sum+=score;
		}
		System.out.println(sum/5);
	}
}
