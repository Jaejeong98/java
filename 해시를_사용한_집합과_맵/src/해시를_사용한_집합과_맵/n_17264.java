package 해시를_사용한_집합과_맵;

import java.io.*;
import java.util.*;

public class n_17264 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" "), str[]=br.readLine().split(" ");
		int arr[]=new int[3], score=0;
		boolean b=false;
		for(int i=0; i<3; i++)
			arr[i]=Integer.parseInt(str[i]);
		HashMap<String, String> map=new HashMap<>();
		for(int i=0; i<Integer.parseInt(st[1]); i++) {
			String f[]=br.readLine().split(" ");
			map.put(f[0], f[1]);
		}
		for(int i=0; i<Integer.parseInt(st[0]); i++) {
			String n=br.readLine();
			if(map.containsKey(n)&&map.get(n).equals("W")) score+=arr[0];
			else score=score-arr[1]<0?0:score-arr[1];
			if(score>=arr[2]) {b=true; break;}
		}
		System.out.println(b?"I AM NOT IRONMAN!!":"I AM IRONMAN!!");
	}
}