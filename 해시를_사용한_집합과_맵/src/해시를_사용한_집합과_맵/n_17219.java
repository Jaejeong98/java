package 해시를_사용한_집합과_맵;

import java.io.*;
import java.util.*;

public class n_17219 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st[]=br.readLine().split(" ");
		HashMap<String, String> map=new HashMap<String, String>();
		for(int i=0; i<Integer.parseInt(st[0]); i++) {
			String[] st1=br.readLine().split(" ");
			map.put(st1[0], st1[1]);
		}
		for(int i=0; i<Integer.parseInt(st[1]); i++) {
			String st1=br.readLine();
			bw.write(map.get(st1)+"\n");
		}
		bw.flush();bw.close();
	}
}
