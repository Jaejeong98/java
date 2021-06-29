package 값_좌표_압축;

import java.io.*;
import java.util.*;

public class n_18870 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T], count=0;
		String st[]=br.readLine().split(" ");
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(st[i]);
		int[] arr_copy=arr.clone();
		Arrays.sort(arr);
		HashMap<Integer, Integer> hash=new HashMap<>();
		for(int i=0; i<T; i++) {
			if(hash.get(arr[i])==null)
				hash.put(arr[i], count++);
		}
		for(int i=0; i<T; i++)
			bw.write(hash.get(arr_copy[i])+" ");
		bw.flush();bw.close();
	}
}
