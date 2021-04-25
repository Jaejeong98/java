package ¼öÇÐ5p;

import java.io.*;

public class n_2553 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		long num=Integer.parseInt(br.readLine()), result=1;
		for(int i=2; i<=num; i++) {
			result*=i;
			result%=10000000;
			while (result % 10 == 0)
				result /= 10;
		}
		System.out.println(result%10);
	}
}