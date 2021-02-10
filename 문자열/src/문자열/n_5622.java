package ¹®ÀÚ¿­;

import java.util.*;

public class n_5622 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		int sum=0;
		for(int i=0; i<st.length(); i++) {
			char a=st.charAt(i);
			if(a>='A'&&a<='C')
				sum+=3;
			else if(a>='D'&&a<='F')
				sum+=4;
			else if(a>='G'&&a<='I')
				sum+=5;
			else if(a>='J'&&a<='L')
				sum+=6;
			else if(a>='M'&&a<='O')
				sum+=7;
			else if(a>='P'&&a<='S')
				sum+=8;
			else if(a>='T'&&a<='V')
				sum+=9;
			else if(a>='W'&&a<='Z')
				sum+=10;
		}
		System.out.println(sum);
	}
}
