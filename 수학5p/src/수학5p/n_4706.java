package ¼öÇÐ5p;

import java.util.*;

public class n_4706 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			double n1=sc.nextDouble(), n2=sc.nextDouble();
			if(n1==0&&n2==0)
				break;
			double v=Math.sqrt(1-Math.pow(n2/n1, 2));
			System.out.println(String.format("%.3f", v));
		}
	}
}
