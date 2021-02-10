package ¹®ÀÚ¿­;

import java.util.*;

public class n_2941 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String[] cro= {"c=","c-","dz=","d-","lj","nj","s=","z="};
		for(int i=0; i<cro.length; i++) {
			if(str.contains(cro[i]))
				str=str.replace(cro[i], "a");
		}
		System.out.println(str.length());
	}
}
