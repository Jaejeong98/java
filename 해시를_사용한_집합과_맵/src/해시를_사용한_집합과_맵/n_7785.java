package 해시를_사용한_집합과_맵;

import java.io.*;
import java.util.*;

public class n_7785 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		Set<String> set=new TreeSet<>();
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			if(st[1].equals("enter")) set.add(st[0]);
			else set.remove(st[0]);
		}
		Iterator<String> des=((TreeSet<String>)set).descendingIterator();
		while(des.hasNext()) {
			bw.write(des.next()+"\n");
		}
		bw.flush();bw.close();
	}
}