package ¹®ÀÚ¿­;

import java.util.*;

public class n_1718 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st1=sc.nextLine(), st2=sc.nextLine();
		for(int i=0; i<st1.length(); i++) {
			char ch1=st1.charAt(i), ch2=st2.charAt(i%st2.length());
			if(ch1==' ')
				System.out.print(" ");
			else {
				int num=ch1-ch2;
				if(num<=0) num+=26;
				System.out.print((char)(num-1+'a'));
			}
		}
	}
}