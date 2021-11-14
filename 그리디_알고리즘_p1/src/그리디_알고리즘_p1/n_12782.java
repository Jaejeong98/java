package 그리디_알고리즘_p1;

import java.io.*;

public class n_12782 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			int n0=0, n1=0;
			for(int j=0; j<st[0].length(); j++) {
				if(st[0].charAt(j)!=st[1].charAt(j)) {
					if(st[0].charAt(j)=='0') n0++;
					else n1++;
				}
			}
			bw.write(Math.max(n0, n1)+"\n");
		}
		bw.flush();bw.close();
	}
}