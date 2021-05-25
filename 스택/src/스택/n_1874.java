package Ω∫≈√;

import java.util.*;

public class n_1874 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(), arr[]=new int[T+1], num=1;
		Stack<Integer> st=new Stack<>();
		ArrayList list=new ArrayList();
		for(int i=1; i<=T; i++)
			arr[i]=sc.nextInt();
		for(int i=1; i<=T; i++) {
			st.push(i);
			list.add("+");
			while(st.empty()==false&&st.peek() == arr[num]) {
				st.pop();
				list.add("-");
				num++;
			}
		}
		if(st.empty()) {
			for(int j=0; j<list.size(); j++)
				System.out.println(list.get(j));
		}else
			System.out.println("NO");
	}
}
