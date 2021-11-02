package ±¸Çö2;

import java.util.*;

public class n_16674 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		HashMap<Integer, Integer> map=new HashMap<>();
		boolean b=false;
		for(int i=0; i<st.length(); i++) {
			int num=st.charAt(i)-'0';
			if(num==0||num==1||num==2||num==8) map.put(num, map.getOrDefault(num, 0)+1);
			else {b=true;break;}
		}
		if(b) System.out.println(0);
		else {
			if(map.containsKey(0)&&map.containsKey(1)&&map.containsKey(2)&&map.containsKey(8)) {
				Integer[] arr=map.values().toArray(new Integer[map.size()]);
				Arrays.sort(arr);
				if(arr[0]==arr[arr.length-1]) System.out.println(8);
				else System.out.println(2);
			}else System.out.println(1);
		}
	}
}