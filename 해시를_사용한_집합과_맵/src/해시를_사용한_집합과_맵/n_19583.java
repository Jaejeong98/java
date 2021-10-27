package 해시를_사용한_집합과_맵;

import java.io.*;
import java.util.*;

public class n_19583 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" "), l=new String();
		HashSet<String> set=new HashSet<>();
		int arr[]=new int[3], count=0;
		for(int i=0; i<3; i++) {
			String str[]=st[i].split(":");
			arr[i]=60*Integer.parseInt(str[0])+Integer.parseInt(str[1]);
		}
		while((l=br.readLine())!=null) {
			String s[]=l.split(" "), s2[]=s[0].split(":");
			int t=60*Integer.parseInt(s2[0])+Integer.parseInt(s2[1]);
			if(t<=arr[0]) set.add(s[1]);
			else if(t>=arr[1]&&t<=arr[2]) {
				if(set.contains(s[1])) {count++; set.remove(s[1]);}
			}
		}
		System.out.println(count);
	}
}