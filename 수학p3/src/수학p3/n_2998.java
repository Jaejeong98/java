package 수학p3;

import java.util.*;

public class n_2998 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		StringBuffer sb= new StringBuffer();
		int length = 3 - n.length()%3;
		if(length == 3)
			length = 0;
		for(int i = 0 ; i < length ; i++)
			sb.append("0");
		sb.append(n);
		length = sb.length();
		for(int i = 0 ; i < length ; i += 3) {
			String st = "";
			for(int j = 0 ; j < 3 ; j++)
				st += sb.charAt(i+j);
			System.out.print(Integer.parseInt(st,2));
		}
	}
}
/* 다른 풀이
public static void main(String[] args) {
var sc = new Scanner(System.in);
var big = new BigInteger(sc.next(), 2);
System.out.println(big.toString(8));
}*/