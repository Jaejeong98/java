package 자료구조;

import java.io.*;
import java.util.*;

public class n_1764 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		HashSet<String> hash = new HashSet();
		ArrayList<String> list = new ArrayList<>();
		String[] st=br.readLine().split(" "), str=new String[Integer.parseInt(st[1])];
		for(int i=0; i<Integer.parseInt(st[0]); i++)
			hash.add(br.readLine());
		for(int i=0; i<Integer.parseInt(st[1]); i++) {
			str[i]=br.readLine();
			if(hash.contains(str[i])==true)
				list.add(str[i]);
		}
		Collections.sort(list);
		bw.write(list.size()+"\n");
		for(int i=0; i<list.size(); i++)
			bw.write(list.get(i)+"\n");
		bw.flush();
		bw.close();
	}
}