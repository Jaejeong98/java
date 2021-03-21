package ¼öÇĞp3;

import java.io.*;

public class n_17087 {
	public static int gcd(int num1, int num2) {
		if(num2==0)
			return num1;
		else
			return gcd(num2, num1%num2);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st1=br.readLine().split(" "), st2=br.readLine().split(" ");
		int[] num=new int[Integer.parseInt(st1[0])];
		for(int i=0; i<Integer.parseInt(st1[0]); i++)
			num[i]=Math.abs(Integer.parseInt(st1[1])-Integer.parseInt(st2[i]));
		int gcd=num[0];
		for(int i=0; i<Integer.parseInt(st1[0]); i++)
			gcd=gcd(gcd,num[i]);
		System.out.println(gcd);
	}
}
