package ¼öÇÐp6;

import java.util.*;

public class n_23037 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		int result=0;
		for(int i=0; i<st.length(); i++) {
			int num=st.charAt(i)-'0';
			result+=Math.pow(num, 5);
		}
		System.out.println(result);
	}
}