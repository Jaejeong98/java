package 해시를_사용한_집합과_맵;

import java.io.*;
import java.util.*;

public class n_13414 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st[]=br.readLine().split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for(int i=0; i<Integer.parseInt(st[1]); i++) {
			String str=br.readLine();
			if(set.contains(str)) set.remove(str);
			set.add(str);
		}
		Iterator<String> iter=set.iterator();
		int c=Integer.parseInt(st[0]);
		while(iter.hasNext()) {
			bw.write(iter.next()+"\n");
			if(--c==0) break;
		}
		bw.flush();bw.close();
	}
}