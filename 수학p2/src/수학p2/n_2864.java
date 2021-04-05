package ¼öÇÐp2;

import java.util.*;

public class n_2864 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num1=sc.next(), num2=sc.next(), num1_max="", num1_min="", num2_max="", num2_min="";
		for(int i=0; i<num1.length(); i++) {
			if(num1.charAt(i)=='5'||num1.charAt(i)=='6') {
				num1_max+=6;
				num1_min+=5;
			}
			else {
				num1_max+=num1.charAt(i);
				num1_min+=num1.charAt(i);
			}
		}
		for(int i=0; i<num2.length(); i++) {
			if(num2.charAt(i)=='5'||num2.charAt(i)=='6') {
				num2_max+=6;
				num2_min+=5;
			}
			else {
				num2_max+=num2.charAt(i);
				num2_min+=num2.charAt(i);
			}			
		}
		System.out.println((Integer.parseInt(num1_min)+Integer.parseInt(num2_min))+" "+
				(Integer.parseInt(num1_max)+Integer.parseInt(num2_max)));
	}
}
