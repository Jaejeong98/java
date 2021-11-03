package 트리를_사용한_집합과_맵;

import java.io.*;
import java.util.*;

public class n_4158 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=new String();
		while(!(str=br.readLine()).equals("0 0")) {
			String st[]=str.split(" ");
			TreeSet<Integer> set=new TreeSet<>();
			int count=0;
			for(int i=0; i<Integer.parseInt(st[0]); i++)
				set.add(Integer.parseInt(br.readLine()));
			for(int i=0; i<Integer.parseInt(st[1]); i++) {
				if(set.contains(Integer.parseInt(br.readLine()))) count++;
			}
			System.out.println(count);
		}
	}
}