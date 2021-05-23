package ¹®ÀÚ¿­;

import java.util.*;

public class n_11656 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st[]=sc.nextLine().split("");
		String str[]=st;
		for(int i=0; i<st.length; i++) {
			for(int j=i+1; j<st.length; j++)
				str[i]+=st[j];
		}
		Arrays.sort(str);
		for(int i=0; i<str.length; i++)
			System.out.println(str[i]);
	}
}
