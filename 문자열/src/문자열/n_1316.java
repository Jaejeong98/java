package ¹®ÀÚ¿­;

import java.util.*;

public class n_1316 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count=N;
		
		for(int i=0; i<N; i++) {
			String str=sc.next();
			int[] word=new int[26];
			for(int j=1; j<str.length(); j++) {
				if(str.charAt(j-1)!=str.charAt(j)) {
					if(word[str.charAt(j)-97]==1) {
						count--;
						break;
					}
					word[str.charAt(j-1)-97]=1;
				}
			}
		}
		System.out.println(count);
	}
}
