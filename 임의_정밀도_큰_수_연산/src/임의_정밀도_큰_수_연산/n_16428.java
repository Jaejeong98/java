package 임의_정밀도_큰_수_연산;

import java.math.BigInteger;
import java.util.*;

public class n_16428 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BigInteger n1=sc.nextBigInteger(), n2=sc.nextBigInteger(), r1,r2;
		if(n1.compareTo(BigInteger.ZERO)==-1&&n2.compareTo(BigInteger.ZERO)==1) {
			r1=(n1.divide(n2)).subtract(BigInteger.ONE); r2=(n1.remainder(n2)).add(n2);
			System.out.println(r1+"\n"+r2);
		}else if(n1.compareTo(BigInteger.ZERO)==-1&&n2.compareTo(BigInteger.ZERO)==-1) {
				r1=(n1.divide(n2)).add(BigInteger.ONE); r2=(n1.remainder(n2)).subtract(n2);
				System.out.println(r1+"\n"+r2);
		}else {
			r1=n1.divide(n2);r2=n1.remainder(n2);
			System.out.println(r1+"\n"+r2);
		}
	}
}