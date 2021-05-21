package ±¸Çö;

import java.util.*;

public class n_18406 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int sum1=0, sum2=0;
		for(int i=0; i<st.length(); i++) {
			if(i<st.length()/2)
				sum2+=st.charAt(i)-'0';
			else
				sum1+=st.charAt(i)-'0';
		}
		System.out.println(sum1==sum2?"LUCKY":"READY");
	}
}
