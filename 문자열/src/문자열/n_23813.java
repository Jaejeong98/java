package ¹®ÀÚ¿­;

import java.util.*;

public class n_23813 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		long sum=0;
		int len=st.length();
		for(int i=0; i<len; i++) {
			st=st.substring(len-1)+st.substring(0,len-1);
			sum+=Integer.parseInt(st);
		}
		System.out.println(sum);
	}
}
