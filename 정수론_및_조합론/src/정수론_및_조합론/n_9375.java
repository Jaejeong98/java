package 정수론_및_조합론;

import java.util.*;

public class n_9375 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0; i<T; i++) {
			HashMap<String, Integer>map=new HashMap<>();
			int n=sc.nextInt();
			for(int j=0; j<n; j++) {
				String name=sc.next();
				String type=sc.next();
				map.put(type, map.getOrDefault(type,0)+1);
			}
			int answer=1;
			for(String key:map.keySet())
				answer*=(map.get(key)+1);
			System.out.println(answer-1);
		}
	}
}
