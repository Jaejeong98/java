package ±¸Çö2;

import java.io.*;
import java.util.*;

public class n_20299 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken()),k = Integer.parseInt(st.nextToken()),
				l = Integer.parseInt(st.nextToken()), count = 0;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken()), x2 = Integer.parseInt(st.nextToken()),
					x3 = Integer.parseInt(st.nextToken()), sum = x1 + x2 + x3;
			if(l<=x1 && l<=x2 && l<=x3 && k<=sum) {
				sb.append(x1 + " "+x2+" "+x3+" ");
				count++;
			}
		}
		System.out.println(count+"\n"+sb);
	}
}