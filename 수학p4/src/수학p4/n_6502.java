package ¼öÇÐp4;

import java.io.*;

public class n_6502 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int i=0;
		while(true) {
			String[] st=br.readLine().split(" ");
			if(st[0].charAt(0)=='0') break;
			i++;
			double r=Double.parseDouble(st[0]), w=Double.parseDouble(st[1]), l=Double.parseDouble(st[2]);
			if(r*2>=Math.sqrt(Math.pow(w, 2)+Math.pow(l, 2)))
				bw.write("Pizza "+i+" fits on the table.\n");
			else
				bw.write("Pizza "+i+" does not fit on the table.\n");
		}
		bw.flush();
		bw.close();
	}
}