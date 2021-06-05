package 자료구조;

import java.io.*;
import java.util.*;

public class n_1269 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st=br.readLine().split(" "), st1=br.readLine().split(" "), st2=br.readLine().split(" ");
		HashSet<Integer> set = new HashSet<Integer>();
		int count=Integer.parseInt(st[0])+Integer.parseInt(st[1]);
		for(int i=0; i<st1.length; i++)
			set.add(Integer.parseInt(st1[i]));
		for(int i=0; i<st2.length; i++) {
			if(set.contains(Integer.parseInt(st2[i])))
				count-=2;
		}
		System.out.println(count);
	}
}
