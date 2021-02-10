package ¹®ÀÚ¿­;

import java.util.*;

public class n_10809 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int[] array=new int[26];
		Arrays.fill(array, -1);
		
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			int num=(int)ch-97;
			if(array[num]!=-1)
				continue;
			else
				array[num]=i;
		}
		
		for(int i=0; i<26; i++) {
			System.out.println(array[i]);
		}
	}
}
