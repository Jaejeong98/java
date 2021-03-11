package ¼öÇÐp3;

import java.io.*;

public class n_2702 {
	public static int gcd(int n1, int n2) {
		if(n2==0)
			return n1;
		else
			return gcd(n2, n1%n2);
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String[] st=br.readLine().split(" ");
			int n1=Integer.parseInt(st[0]),n2=Integer.parseInt(st[1]);
			bw.write(n1*n2/gcd(n1,n2)+" "+gcd(n1,n2)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
