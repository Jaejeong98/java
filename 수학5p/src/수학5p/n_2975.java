package ¼öÇÐ5p;

import java.io.*;

public class n_2975 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String[] st=br.readLine().split(" ");
			if(st[0].equals("0")&&st[2].equals("0"))
				break;
			if(st[1].equals("W"))
				if(Integer.parseInt(st[0])-Integer.parseInt(st[2])<-200)
					bw.write("Not allowed\n");
				else
					bw.write(Integer.parseInt(st[0])-Integer.parseInt(st[2])+"\n");
			else
				bw.write(Integer.parseInt(st[0])+Integer.parseInt(st[2])+"\n");
		}
		bw.flush();
		bw.close();
	}
}
