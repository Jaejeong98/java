package ¼öÇÐp2;

import java.util.*;

public class n_2754 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		double score=0.0;
		if(st.charAt(0)=='F') {
			System.out.println(score);
		}
		else {
			if(st.charAt(0)=='A')
				score+=4;
			else if(st.charAt(0)=='B')
				score+=3;
			else if(st.charAt(0)=='C')
				score+=2;
			else if(st.charAt(0)=='D')
				score+=1;
			
			if(st.charAt(1)=='+')
				score+=0.3;
			else if(st.charAt(1)=='-')
				score-=0.3;
			else
				score+=0;
			
			System.out.println(score);
		}
	}
}
