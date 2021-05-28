package ¹®ÀÚ¿­;

import java.util.*;

public class n_10987 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st[]=sc.nextLine().split(""), v="a e i o u";
		int count=0;
		for(int i=0; i<st.length; i++) {
			if(v.contains(st[i]))
				count++;
		}
		System.out.println(count);
	}
}
