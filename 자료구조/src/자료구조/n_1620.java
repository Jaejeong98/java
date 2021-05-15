package 자료구조;

import java.io.*;
import java.util.*;

public class n_1620 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] st=br.readLine().split(" ");
		HashMap<String, String> hash=new HashMap<String, String>();
		for(int i=0;  i<Integer.parseInt(st[0]); i++) {
			String str=br.readLine();
			hash.put(Integer.toString(i+1), str);
			hash.put(str, Integer.toString(i+1));
		}
		for(int i=0; i<Integer.parseInt(st[1]); i++) {
			String str=br.readLine();
			bw.write(hash.get(str)+"\n");
		}
		bw.flush();bw.close();
	}
}
