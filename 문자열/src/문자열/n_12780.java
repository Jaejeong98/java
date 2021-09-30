package ¹®ÀÚ¿­;

import java.util.*;

public class n_12780 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st1=sc.nextLine(), st2=sc.nextLine();
		int count=0, c=0;
		while(count<st1.length()-st2.length()+1) {
			if(st1.charAt(count)==st2.charAt(0)) {
				boolean b=false;
				for(int j=0; j<st2.length(); j++) {
					if(st1.charAt(j+count)!=st2.charAt(j)) {
						b=true; break;
					}
				}
				if(!b) {
					count+=st2.length();
					c++;
					continue;
				}
			}
			count++;
		}
		System.out.println(c);
	}
}