package ±¸Çö3;

import java.io.*;
import java.util.*;

public class n_14467{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), count=0;
		HashMap<Integer,Integer> hash=new HashMap<>();
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			int n1=Integer.parseInt(st[0]), n2=Integer.parseInt(st[1]);
			if(!hash.containsKey(n1)) hash.put(n1, n2);
			else if(hash.get(n1)!=n2){
				hash.replace(n1, n2);
				count++;
			}
		}
		System.out.println(count);
	}
}