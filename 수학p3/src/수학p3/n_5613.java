package ¼öÇĞp3;

import java.util.*;

public class n_5613 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String>list=new ArrayList<>();
		while(true) {
			String st=sc.nextLine();
			list.add(st);
			if(st.charAt(0)=='=')
				break;
		}
		int sum=Integer.parseInt(list.get(0)), num=0;
		for(int i=1; i<list.size(); i+=2) {
			if(i+1>=list.size())
				break;
			num=Integer.parseInt(list.get(i+1));
			switch(list.get(i)) {
			case "+":
				sum+=num; break;
			case "-":
				sum-=num; break;
			case "*":
				sum*=num; break;
			case "/":
				sum/=num; break;
			default: break;
			}
		}
		System.out.println(sum);
	}
}
