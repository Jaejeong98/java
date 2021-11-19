package 브루트포스_알고리즘;

import java.io.*;

public class n_11170 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			int n1=Integer.parseInt(st[0]), n2=Integer.parseInt(st[1]), count=0;
			for(int j=n1; j<=n2; j++) {
				int n=j;
				while(n>1) {
					if(n%10==0) count++;
					n/=10;
				}
			}
			bw.write((n1==0?count+1:count)+"\n");
		}
		bw.flush();bw.close();
	}
}