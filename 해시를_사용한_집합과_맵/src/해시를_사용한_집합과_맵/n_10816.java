package 해시를_사용한_집합과_맵;

import java.io.*;
import java.util.*;

public class n_10816 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		String st[]=br.readLine().split(" ");
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0; i<T; i++) {
			int num=Integer.parseInt(st[i]);
			if(map.containsKey(num))
				map.replace(num, map.get(num)+1);
			else map.put(num, 1);
		}
		int c=Integer.parseInt(br.readLine());
		String str[]=br.readLine().split(" ");
		for(int i=0; i<c; i++) {
			int num=Integer.parseInt(str[i]);
			bw.write((map.get(num)==null?0:map.get(num))+" ");
		}
		bw.flush();bw.close();
	}
}