package ¼öÇÐp3;

import java.io.*;

public class n_10474 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String[] st=br.readLine().split(" ");
			int n1=Integer.parseInt(st[0]), n2=Integer.parseInt(st[1]);
			if(n1==0&&n2==0)
				break;
			bw.write(n1/n2+" "+n1%n2+" / "+n2+"\n");
		}
		bw.flush();
		bw.close();
		
	}
}
