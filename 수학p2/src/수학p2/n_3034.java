package ¼öÇÐp2;

import java.util.*;

public class n_3034 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), w=sc.nextInt(), h=sc.nextInt();
		for(int i=0; i<n; i++) {
			int num=sc.nextInt();
			if(w*w+h*h>=num*num)
				System.out.println("DA");
			else
				System.out.println("NE");
		}
	}
}
