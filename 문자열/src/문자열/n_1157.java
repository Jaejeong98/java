package ¹®ÀÚ¿­;

import java.util.*;

public class n_1157 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int max=0, count=0;
		int[] array=new int[26];
		Arrays.fill(array, 0);
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			if((int)ch>=97)
				ch=(char) (ch-97);
			else
				ch=(char) (ch-65);
			array[ch]++;
		}
		for(int i=0; i<26; i++) {
			if(array[max]<array[i])
				max=i;
		}
		for(int i=0; i<26; i++) {
			if(array[max]==array[i]) {
				count++;
			}
		}
		if(count>1)
			System.out.println("?");
		else
			System.out.println((char)(max+65));
	}
}
