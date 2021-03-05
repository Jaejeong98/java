package ¼öÇÐp2;

import java.math.BigInteger;
import java.util.*;

public class n_1271 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BigInteger n=sc.nextBigInteger(), m=sc.nextBigInteger();
		System.out.println(n.divide(m)+" "+n.remainder(m));
	}
}
