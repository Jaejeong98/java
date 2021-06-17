package 브루트포스_알고리즘;

import java.io.*;

public class n_14426 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" "), arr[]=new String[Integer.parseInt(st[0])];
		int count=0;
		for(int i=0; i<arr.length; i++)
			arr[i]=br.readLine();
		for(int i=0; i<Integer.parseInt(st[1]); i++) {
			String str=br.readLine();
			boolean t=false;
			for(int j=0; j<arr.length; j++) {
				for(int k=0; k<str.length(); k++) {
					if(arr[j].charAt(k)==str.charAt(k)) {
						if(k==str.length()-1) {
							count++;
							t=true;
						}
					}
					else
						break;
				}
				if(t==true) break;
			}
		}
		System.out.println(count);
	}
}
