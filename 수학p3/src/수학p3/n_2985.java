package ¼öÇÐp3;

import java.util.*;

public class n_2985 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt(), n3=sc.nextInt();
		if(n1+n2==n3)
			System.out.println(n1+"+"+n2+"="+n3);
		else if(n1-n2==n3)
			System.out.println(n1+"-"+n2+"="+n3);
		else if(n1*n2==n3)
			System.out.println(n1+"*"+n2+"="+n3);
		else if(n1/n2==n3)
			System.out.println(n1+"/"+n2+"="+n3);
		else if(n1==n2-n3)
			System.out.println(n1+"="+n2+"-"+n3);
		else if(n1==n2/n3)
			System.out.println(n1+"="+n2+"/"+n3);
	}
}
