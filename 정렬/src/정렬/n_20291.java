package Á¤·Ä;

import java.io.*;
import java.util.*;

public class n_20291 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<>();
		HashMap<String,Integer>hash=new HashMap<String,Integer>();
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split("\\.");
			if(hash.containsKey(st[1])) {
				int num=hash.get(st[1]);
				hash.replace(st[1], num+1);
			}
			else {
				hash.put(st[1],1);
				list.add(st[1]);
			}
		}
		Collections.sort(list);
		for(int i=0; i<list.size(); i++)
			bw.write(list.get(i)+" "+hash.get(list.get(i))+"\n");
		bw.flush();bw.close();
	}
}
