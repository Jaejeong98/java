package ¼öÇÐp2;

import java.util.*;

public class n_13300 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int st=sc.nextInt(), k=sc.nextInt(), sum=0;
		double[][] student=new double[2][7];
		for(int i=0; i<st;i++) {
			int ge=sc.nextInt(), gr=sc.nextInt();
			student[ge][gr]++;
		}
		for(int i=1; i<=6; i++) {
			for(int j=0; j<2; j++) 
				sum+=Math.ceil(student[j][i]/k);
		}
		System.out.println(sum);
	}
}
