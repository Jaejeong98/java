package ¹®ÀÚ¿­;

import java.util.*;

public class n_7567 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st[]=sc.nextLine().split("");
		int result=0;
		for(int i=1; i<st.length;i++) {
			if(st[i].equals(st[i-1]))
				result+=5;
			else
				result+=10;
		}
		System.out.println(result+10);
	}
}
