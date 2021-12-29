package 해시를_사용한_집합과_맵;

import java.io.*;
import java.util.*;

public class n_11652 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), max=1;
		HashMap<Long, Integer> map=new HashMap<>();
		for(int i=0; i<T; i++) {
			long num=Long.parseLong(br.readLine());
			map.put(num, map.getOrDefault(num, 0)+1);
			max=max<map.get(num)?map.get(num):max;
		}
		ArrayList<Long>list=new ArrayList<>();
		for(Map.Entry<Long, Integer>m:map.entrySet()) {
			if(m.getValue()==max)
				list.add(m.getKey());
		}
		Collections.sort(list);
		System.out.println(list.get(0));
	}
}
