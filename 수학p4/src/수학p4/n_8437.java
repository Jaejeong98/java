package ¼öÇÐp4;

import java.math.BigInteger;
import java.util.*;

public class n_8437 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BigInteger total=sc.nextBigInteger(), sub=sc.nextBigInteger();
		BigInteger result=total.subtract(sub).divide(BigInteger.valueOf(2));
		System.out.println(result.add(sub)+"\n"+result);
	}
}
