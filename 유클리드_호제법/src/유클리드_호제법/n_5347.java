package 유클리드_호제법;

import java.io.*;

public class n_5347 {
	public static long gcd(long n1, long n2) {
		if(n2==0)
			return n1;
		else
			return gcd(n2, n1%n2);
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		long n1=0, n2=0;
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			n1=Long.parseLong(st[0]);
			n2=Long.parseLong(st[1]);
			bw.write(n1*n2/gcd(n1, n2)+"\n");
		}
		bw.flush();bw.close();
	}
}