package ¼öÇÐp3;

import java.io.*;

public class n_4880 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String[] st=br.readLine().split(" ");
			int n1=Integer.parseInt(st[0]), n2=Integer.parseInt(st[1]), n3=Integer.parseInt(st[2]);
			if(n1==0&&n2==0&&n3==0)
				break;
			if(n2-n1==n3-n2)
				bw.write("AP "+(n3+n2-n1)+"\n");
			else if(n2/n1==n3/n2)
				bw.write("GP "+n3*(n3/n2)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
