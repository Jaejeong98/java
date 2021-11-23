package ±¸Çö3;

import java.io.*;

public class n_4493 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int c=Integer.parseInt(br.readLine()), p1=0;
			for(int j=0; j<c; j++) {
				String st[]=br.readLine().split(" ");
				if(st[0].equals("R")) {
					if(st[1].equals("S"))p1++;
					else if(st[1].equals("P")) p1--;
				}else if(st[0].equals("S")) {
					if(st[1].equals("P")) p1++;
					else if(st[1].equals("R")) p1--;
				}else {
					if(st[1].equals("R")) p1++;
					else if(st[1].equals("S"))p1--;
				}
			}
			if(p1==0) bw.write("TIE\n");
			else bw.write(p1>0?"Player 1\n":"Player 2\n");
		}
		bw.flush();bw.close();
	}
}