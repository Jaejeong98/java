package ¼öÇÐp2;

import java.math.BigInteger;
import java.util.*;

public class n_14623 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BigInteger n1=new BigInteger(sc.nextLine(),2);
		BigInteger n2=new BigInteger(sc.nextLine(),2);
		System.out.print(new BigInteger(n1.multiply(n2).toString(2)));
	}
}
