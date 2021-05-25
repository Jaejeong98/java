package ±¸Çö2;

import java.io.*;
import java.util.*;

public class n_9047 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String num=br.readLine();
			int count=0;
			while(num.equals("6174")==false) {
				int arr[]=new int[num.length()];
				String st1=new String(), st2=new String();
				for(int j=0; j<num.length(); j++)
					arr[j]=num.charAt(j)-'0';
				Arrays.sort(arr);
				for(int j=num.length()-1; j>=0; j--) {
					st1+=arr[j];
					st2+=arr[num.length()-1-j];
				}
				num=Integer.toString(Integer.parseInt(st1)-Integer.parseInt(st2));
				if (num.length() != 4) {
					if (num.length() == 1)
						num = num + "000";
					else if (num.length() == 2)
						num = num + "00";
					else
						num = num + "0";
				}
				count++;
			}
			bw.write(count+"\n");
		}
		bw.flush();
		bw.close();
	}
}