package ¼öÇÐp4;

import java.io.*;

public class n_6322 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int i=0;
		while(true) {
			String[] st=br.readLine().split(" ");
			if(st[0].charAt(0)=='0'&&st[1].charAt(0)=='0'&&st[2].charAt(0)=='0')
				break;
			i++;
			bw.write("Triangle #"+i+"\n");
			int n1=Integer.parseInt(st[0]),n2=Integer.parseInt(st[1]),n3=Integer.parseInt(st[2]);
			if(n1==-1) {
				if(Math.pow(n3, 2)-Math.pow(n2, 2)<=0)
					bw.write("Impossible.\n");
				else
					bw.write("a = "+String.format("%.3f", Math.sqrt(Math.pow(n3, 2)-Math.pow(n2, 2)))+"\n");
			}
			else if(n2==-1) {
				if(Math.pow(n3, 2)-Math.pow(n1, 2)<=0)
					bw.write("Impossible.\n");
				else
					bw.write("b = "+String.format("%.3f", Math.sqrt(Math.pow(n3, 2)-Math.pow(n1, 2)))+"\n");
			}
			else
				bw.write("c = "+String.format("%.3f", Math.sqrt(Math.pow(n1, 2)+Math.pow(n2, 2)))+"\n");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
