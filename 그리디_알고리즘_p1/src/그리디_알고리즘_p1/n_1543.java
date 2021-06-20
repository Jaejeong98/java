package 그리디_알고리즘_p1;

import java.util.*;

public class n_1543 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine(), st2=sc.nextLine();
		int count=0;
		for(int i=0; i<st.length()-st2.length()+1; i++) {
			if(st.substring(i,i+st2.length()).equals(st2)) {
				count++;
				i += (st2.length()-1);
			}
            else continue;
		}
		System.out.println(count);
	}
}
