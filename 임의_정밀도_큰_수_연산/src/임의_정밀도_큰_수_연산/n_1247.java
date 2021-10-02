package 임의_정밀도_큰_수_연산;

import java.math.BigInteger;
import java.util.*;

public class n_1247 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<3; i++) {
			int T=sc.nextInt();
			BigInteger sum=BigInteger.valueOf(0);
			for(int j=0; j<T; j++) {
				BigInteger num=sc.nextBigInteger();
				sum=sum.add(num);
			}
			if(sum.equals(BigInteger.valueOf(0))) System.out.println(0);
			else System.out.println(sum.compareTo(BigInteger.valueOf(0))==1?"+":"-");
		}
	}
}