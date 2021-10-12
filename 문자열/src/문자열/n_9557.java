package ¹®ÀÚ¿­;

import java.io.*;

public class n_9557 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int num=Integer.parseInt(br.readLine()), n=0;
			String st[]=br.readLine().split(" "), st1="",st2="";
			boolean b=false;
			for(int j=0; j<num; j++) {
				if(!st[j].contains("#")) {n=j; b=true;}
				else if(!b) st1+=st[j]+" ";
				else st2+=st[j]+" ";
			}
			if(!b)bw.write(st2+st1+"\n");
			else bw.write(st2+st[n]+" "+st1+"\n");
		}
		bw.flush();bw.close();
	}
}
