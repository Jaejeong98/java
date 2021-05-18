package ±¸Çö;

import java.util.*;

public class n_21734 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] st=sc.nextLine().split("");
		for(int i=0; i<st.length; i++) {
			int num=st[i].charAt(0), n=0;
			if(num<10) {
				for(int j=0; j<num; j++)
					System.out.print(st[i]);
			}
			else {
				for(int j=0; j<Integer.toString(num).length(); j++)
					n+=Integer.toString(num).charAt(j)-'0';
				for(int j=0; j<n; j++)
					System.out.print(st[i]);
			}
			System.out.println("");
		}
	}
}