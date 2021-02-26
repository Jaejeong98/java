package ¼öÇÐp1;

import java.util.*;

public class n_1212 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] st=sc.next().split("");
		StringBuffer sb=new StringBuffer();
		for(int i=0; i<st.length; i++) {
			int Oct=Integer.parseInt(st[i]);
			if(i!=0&&Oct<=1)
				sb.append("00");
			else if(i!=0&&(Oct==2||Oct==3))
				sb.append("0");
			sb.append(Integer.toBinaryString(Oct));
		}
		System.out.println(sb);
	}
}
