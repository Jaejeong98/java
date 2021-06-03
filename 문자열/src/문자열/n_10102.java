package ¹®ÀÚ¿­;

import java.util.*;

public class n_10102 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(), countA=0, countB=0;
		String st=sc.next();
		for(int i=0; i<st.length(); i++) {
			if(st.charAt(i)=='A')
				countA++;
			else if(st.charAt(i)=='B')
				countB++;
		}
		if(countA==countB)
			System.out.println("Tie");
		else
			System.out.println(countA>countB?"A":"B");
	}
}