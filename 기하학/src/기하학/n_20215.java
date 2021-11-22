package ±‚«œ«–;

import java.text.DecimalFormat;
import java.util.*;

public class n_20215 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt();
		double n3=Math.sqrt(Math.pow(n1, 2)+Math.pow(n2, 2)), r=(n1+n2)*2-(n1+n2+n3);
		DecimalFormat df=new DecimalFormat("#.#########");
		System.out.println(df.format(r));
	}
}