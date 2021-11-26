package ¼öÇĞp3;

import java.util.*;

public class n_15080 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st1[]=sc.nextLine().split(" "), st2[]=sc.nextLine().split(" ");
		int s=Integer.parseInt(st2[4])-Integer.parseInt(st1[4]);
		int m=Integer.parseInt(st2[2])-Integer.parseInt(st1[2]);
		int h=Integer.parseInt(st2[0])-Integer.parseInt(st1[0]);
		if(s<0) {s+=60; m--;}
		if(m<0) {m+=60; h--;}
		if(h<0) h+=24;
		System.out.println((int)Math.pow(60, 2)*h+m*60+s);
	}
}