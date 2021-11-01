package 해시를_사용한_집합과_맵;

import java.io.*;
import java.util.*;

public class n_18679 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		HashMap<String,String>map=new HashMap<>();
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			map.put(st[0], st[2]);
		}
		int c=Integer.parseInt(br.readLine());
		for(int i=0; i<c; i++) {
			int num=Integer.parseInt(br.readLine());
			String st[]=br.readLine().split(" ");
			for(int j=0; j<num; j++) {
				bw.write(map.get(st[j]));
				if(j!=num-1)
					bw.write(" ");
			}
			if(i!=c-1)
				bw.write("\n");
		}
		bw.flush();bw.close();
	}
}
