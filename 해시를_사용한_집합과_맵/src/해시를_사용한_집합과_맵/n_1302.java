package 해시를_사용한_집합과_맵;

import java.io.*;
import java.util.*;

public class n_1302 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		HashMap<String, Integer> hash=new HashMap<String, Integer>();
		for(int i=0; i<T; i++) {
			String st=br.readLine();
			if(hash.containsKey(st)) {
				int num=hash.get(st);
				hash.replace(st, num+1);
			}
			else {
				hash.put(st, 1);
			}
		}
		int max = 0;
		String str = "";
		for(String key: hash.keySet()) {
			if(max<hash.get(key)) {
				max = hash.get(key);
				str = key;
			}
			else if(max == hash.get(key)) {
				if(key.compareTo(str)<0)
					str = key;
			}
		}
		System.out.println(str);
	}
}
