package Á¤·Ä;

import java.io.*;
import java.util.*;

public class n_2204 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=0;
		while((T=Integer.parseInt(br.readLine()))!=0){
			String st[]=new String[T];
			HashMap<String, String>hash=new HashMap<>();
			for(int i=0; i<T; i++) {
				String str=br.readLine();
				st[i]=str.toLowerCase();
				hash.put(st[i], str);
			}
			Arrays.sort(st);
			bw.write(hash.get(st[0])+"\n");
		}
		bw.flush();bw.close();
	}
}
