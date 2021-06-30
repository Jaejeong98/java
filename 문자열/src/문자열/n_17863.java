package ¹®ÀÚ¿­;

import java.util.*;

public class n_17863 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st[]=sc.nextLine().split("");
		boolean b=false;
		for(int i=0; i<3; i++) {
			if(st[i].equals("5")==false)
				b=true;
		}
		System.out.println(b?"NO":"YES");
	}
}
