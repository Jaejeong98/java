package ����_���е�_ū_��_����;

import java.util.*;

public class n_14928 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int num=0;
		for(int i=0; i<st.length(); i++)
			num=(num*10+st.charAt(i)-'0')%20000303;
		System.out.println(num);
	}
}