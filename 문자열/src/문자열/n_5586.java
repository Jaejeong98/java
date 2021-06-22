package ¹®ÀÚ¿­;

import java.util.*;

public class n_5586 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int num1=0, num2=0;
		for(int i=0; i<st.length()-2; i++) {
			if(st.charAt(i)=='J'&& st.charAt(i+1)== 'O' && st.charAt(i+2)=='I')
				num1++;
			else if(st.charAt(i)=='I'&& st.charAt(i+1)== 'O' && st.charAt(i+2)=='I')
				num2++;
		}
		System.out.println(num1+"\n"+num2);
	}
}
