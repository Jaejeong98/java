package ¼öÇÐp2;

import java.math.BigInteger;
import java.util.*;

public class n_1225 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String A=sc.next(), B=sc.next();
		BigInteger sum=BigInteger.valueOf(0);
		for(int i=0; i<A.length(); i++) {
			for(int j=0; j<B.length(); j++) {
				BigInteger A_=BigInteger.valueOf(Character.getNumericValue(A.charAt(i)));
				BigInteger B_=BigInteger.valueOf(Character.getNumericValue(B.charAt(j)));
				sum=sum.add(A_.multiply(B_));
			}
		}
		System.out.println(sum);
	}
}
