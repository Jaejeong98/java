package 해시를_사용한_집합과_맵;

import java.io.*;
import java.util.*;

public class n_10546 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		HashMap<String,Integer> map=new HashMap<>();
		for(int i=0; i<T; i++) {
			String st=br.readLine();
			map.put(st, map.getOrDefault(st, 0)+1);
		}
		for(int i=0; i<T-1; i++) {
			String st=br.readLine();
			if(map.get(st)==1) map.remove(st);
			else map.put(st, map.get(st)-1);
		}
		Iterator<String> iter=map.keySet().iterator();
		System.out.println(iter.next());
	}
}