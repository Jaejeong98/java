package ¹®ÀÚ¿­;

import java.util.*;

public class n_14915 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt(), n=sc.nextInt();
		String st=new String(), al[]= {"A","B","C","D","E","F"};
		if(m==0) System.out.println(0);
		else {
			while(m!=0) {
				if(m%n>=10) st+=al[(m%n)%10];
				else st+=m%n;
				m/=n;
			}
			for(int i=st.length()-1; i>=0; i--)
				System.out.print(st.charAt(i));
		}
	}
}