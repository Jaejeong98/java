package ¼öÇÐp6;

import java.util.*;

public class n_2877 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt()+1;
		String st=new String();
		while(n!=0) {
			st+=Integer.toString(n%2);
			n/=2;
		}
		for(int i=st.length()-2; i>=0; i--) {
			if(st.charAt(i)=='0') System.out.print(4);
			else System.out.print(7);
		}
	}
}