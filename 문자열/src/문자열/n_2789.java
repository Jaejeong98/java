package ¹®ÀÚ¿­;

import java.util.*;

public class n_2789 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st[]=sc.nextLine().split(""), str="CAMBRIDGE";
		String ans=new String();
		for(int i=0; i<st.length; i++) {
			if(str.contains(st[i]))
				continue;
			else
				ans+=st[i];
		}
		System.out.println(ans);
	}
}
