package ÀüÃ¼;

import java.util.*;

public class n_11549 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int answer=sc.nextInt(),num=0, count=0;
		for(int i=0; i<5; i++) {
			num=sc.nextInt();
			if(num==answer)
				count++;
		}
		System.out.println(count);
	}
}
