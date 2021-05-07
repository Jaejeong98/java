package ÀüÃ¼;

import java.util.*;

public class n_1076 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] st=new String[3];
		for(int i=0; i<3; i++)
			st[i]=sc.nextLine();
		ArrayList<String>list=new ArrayList<String>();
		list.add("black");
		list.add("brown");
		list.add("red");
		list.add("orange");
		list.add("yellow");
		list.add("green");
		list.add("blue");
		list.add("violet");
		list.add("grey");
		list.add("white");
		long num=(long) ((list.indexOf(st[0])*10+list.indexOf(st[1]))
				*Math.pow(10,list.indexOf(st[2])));
		System.out.println(num);
	}
}
