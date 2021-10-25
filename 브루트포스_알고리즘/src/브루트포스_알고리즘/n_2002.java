package 브루트포스_알고리즘;

import java.io.*;
import java.util.*;

public class n_2002 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), count=0;
		ArrayList<String> list=new ArrayList<>();
		for(int i=0; i<T; i++) 
			list.add(br.readLine());
		for(int i=0; i<T; i++) {
			String st=br.readLine();
			if(!st.equals(list.get(0)))
				count++;
			list.remove(st);
		}
		System.out.println(count);
	}
}