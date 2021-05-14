package ±¸Çö;

import java.util.*;

public class n_11721 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] st=sc.nextLine().split("");
		String ans=new String();
		for(int i=0; i<st.length; i++) {
			ans+=st[i];
			if((i+1)%10==0)
				ans+="\n";
		}
		System.out.println(ans);
	}
}
