package ¼öÇÐp2;

import java.util.*;

public class n_4766 { 
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayList <Double> list=new ArrayList<>();
		while(true) {
			double num=sc.nextDouble();
			if(num==999)
				break;
			else
				list.add(num);
		}
		for(int i=1; i<list.size(); i++)
			System.out.println(String.format(Locale.getDefault(),"%.2f", list.get(i)-list.get(i-1)));
	}
}
