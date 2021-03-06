package ¼öÇÐp2;

import java.util.*;

public class n_1297 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dia=sc.nextInt(), h=sc.nextInt(), w=sc.nextInt();
		double ratio=Math.sqrt(dia*dia/(h*h+w*w));
		System.out.println((int)Math.floor(h*ratio)+" "+(int)Math.floor(w*ratio));
	}
}
