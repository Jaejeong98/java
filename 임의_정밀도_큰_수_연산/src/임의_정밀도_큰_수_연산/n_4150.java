package 임의_정밀도_큰_수_연산;

import java.math.BigInteger;
import java.util.*;

public class n_4150 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		BigInteger arr[]=new BigInteger[n+1];
		for(int i=0; i<=n; i++) {
			if(i<2) arr[i]=BigInteger.valueOf(i);
			else arr[i]=arr[i-1].add(arr[i-2]);
		}
		System.out.println(arr[n]);
	}
}