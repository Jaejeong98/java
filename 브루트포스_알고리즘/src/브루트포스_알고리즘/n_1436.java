package ���Ʈ����_�˰���;

import java.util.*;

public class n_1436 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(), c=0;
		while(num>0) {
			c++;
			if(Integer.toString(c).contains("666"))
				num--;
		}
		System.out.println(c);
	}
}
