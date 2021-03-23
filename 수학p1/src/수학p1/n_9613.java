package ¼öÇÐp1;

import java.io.*;

public class n_9613 {
	public static int gcd(int num1, int num2) {
		if(num2==0)
			return num1;
		else
			return gcd(num2, num1%num2);
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			String[] st=br.readLine().split(" ");
			long sum=0;
			for(int j=1; j<Integer.parseInt(st[0]); j++) {
				for(int k=j+1; k<=Integer.parseInt(st[0]); k++)
					sum+=gcd(Integer.parseInt(st[j]), Integer.parseInt(st[k]));
			}
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}
