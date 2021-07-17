package ±¸Çö2;

import java.io.*;

public class n_10093 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st[]=br.readLine().split(" ");
		long num1=Long.parseLong(st[0]), num2=Long.parseLong(st[1]), count=0;
		if(num1==num2)
			bw.write(0);
		else if(num1>num2) {
			bw.write(num1-num2-1+"\n");
			for(long i=num2+1; i<num1; i++)
				bw.write(i+" ");
		}
		else {
			bw.write(num2-num1-1+"\n");
			for(long i=num1+1; i<num2; i++)
				bw.write(i+" ");
		}
		bw.flush();bw.close();
	}
}
