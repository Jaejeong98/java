package ť;

import java.io.*;
import java.util.*;

public class n_15828 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine()), num=0;
		Queue<Integer> queue=new LinkedList<>();
		while((num=Integer.parseInt(br.readLine()))!=-1) {
			if(num==0) queue.remove();
			else if(queue.size()==T) continue;
			else queue.add(num);
		}
		if(queue.isEmpty()) bw.write("empty");
		else {
			while(!queue.isEmpty())
				bw.write(queue.poll()+" ");
		}
		bw.flush();bw.close();
	}
}