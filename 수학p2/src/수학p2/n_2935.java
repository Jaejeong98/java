package ¼öÇÐp2;

import java.math.BigInteger;
import java.io.*;

public class n_2935 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BigInteger n1=new BigInteger(br.readLine());
		char ch=br.readLine().charAt(0);
		BigInteger n2=new BigInteger(br.readLine());
		if(ch=='+')
			System.out.println(n1.add(n2));
		else
			System.out.println(n2.multiply(n1));
	}
}
