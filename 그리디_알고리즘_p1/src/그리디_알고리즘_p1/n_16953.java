package 그리디_알고리즘_p1;

import java.util.*;

public class n_16953 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n1=sc.nextLong(), n2=sc.nextLong();
		int result=1;
		while(n1!=n2) {
			String n2_s=Long.toString(n2);
			if(n1>n2||n2_s.charAt(n2_s.length()-1)!='1'&&n2%2!=0) {
				result=-1;
				break;
			}
			if(n2%2==0)
				n2/=2;
			else {
				String st=new String();
				for(int i=0; i<n2_s.length()-1; i++)
					st+=n2_s.charAt(i);
				n2=Long.parseLong(st);
			}
			result++;
		}
		System.out.println(result);
	}
}