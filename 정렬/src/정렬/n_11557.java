package Á¤·Ä;

import java.io.*;

public class n_11557 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int C=Integer.parseInt(br.readLine()), max=0;
			String name=new String();
			for(int j=0; j<C; j++) {
				String st[]=br.readLine().split(" ");
				if(max<Integer.parseInt(st[1])) {
					max=Integer.parseInt(st[1]);
					name=st[0];
				}
			}
			bw.write(name+"\n");
		}
		bw.flush();
		bw.close();
	}
}
