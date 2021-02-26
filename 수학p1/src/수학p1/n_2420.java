package ¼öÇÐp1;

import java.math.BigInteger;
import java.util.*;

public class n_2420 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BigInteger N=sc.nextBigInteger(), M=sc.nextBigInteger();
		if(N.compareTo(M)==-1)
			System.out.println(M.subtract(N));
		else
			System.out.println(N.subtract(M));
	}
}
