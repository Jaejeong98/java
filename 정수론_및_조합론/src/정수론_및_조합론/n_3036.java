package 정수론_및_조합론;

import java.io.*;
import java.util.*;

public class n_3036 {
	public static int gcd(int num1, int num2) {
		if(num2==0)
			return num1;
		else
			return gcd(num2, num1%num2);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		String[] st=br.readLine().split(" ");
		int r1=Integer.parseInt(st[0]);
		for(int i=1; i<num;i++) {
			int gcdn=gcd(r1,Integer.parseInt(st[i]));
			System.out.println(r1/gcdn+"/"+Integer.parseInt(st[i])/gcdn);
		}
	}
}
