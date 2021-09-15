package ¼öÇÐp6;

import java.io.*;

public class n_7523 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			long n1=Long.parseLong(st[0]), n2=Long.parseLong(st[1]), result=(n2-n1+1)*(n1+n2);
			bw.write("Scenario #"+(i+1)+":\n"+result/2+"\n\n");
		}
		bw.flush();bw.close();
	}
}