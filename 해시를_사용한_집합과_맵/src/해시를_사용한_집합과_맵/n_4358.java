package 해시를_사용한_집합과_맵;

import java.io.*;
import java.util.*;

public class n_4358 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st=new String();
		Map<String,Integer> map=new TreeMap<>();
		int count=0;
		while((st=br.readLine())!=null) {
			if(map.containsKey(st)) map.replace(st, map.get(st)+1);
			else map.put(st, 1);
			count++;
		}
		double r=100/(double)count;
		Iterator<Map.Entry<String, Integer>> entries=map.entrySet().iterator();
		while(entries.hasNext()) {
			Map.Entry<String,Integer> entry=entries.next();
			bw.write(entry.getKey()+" "+String.format("%.4f", entry.getValue()*r)+"\n");
		}
		bw.flush();bw.close();
	}
}