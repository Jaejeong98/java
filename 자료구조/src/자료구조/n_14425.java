package 자료구조;

import java.io.*;
import java.util.*;

public class n_14425 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list=new ArrayList<String>();
		String[] st=br.readLine().split(" ");
		int count=0;
		for(int i=0; i<Integer.parseInt(st[0]); i++)
			list.add(br.readLine());
		for(int i=0; i<Integer.parseInt(st[1]); i++){
			if(list.contains(br.readLine()))
				count++;
		}
		System.out.println(count);
	}
}
