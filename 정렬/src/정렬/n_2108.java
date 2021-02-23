package Á¤·Ä;

import java.util.*;

public class n_2108 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), sum=0;
		int arr[]=new int[N];
		for(int i=0; i<N; i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		Arrays.sort(arr);
		boolean flag = false;
		int mode_max = 0, mode = 10000;
		for(int i = 0; i < N; i++) {
			int jump = 0, count = 1;
			int i_value = arr[i];
			for(int j = i + 1; j < N; j++){
				if(i_value != arr[j])
					break;
				count++;
				jump++;
			}
			if(count > mode_max) {
				mode_max = count;
				mode = i_value;
				flag = true;
			}
			else if(count == mode_max && flag == true) {
				mode = i_value;
				flag = false;
			}
			i += jump;
		}
		System.out.println((int)Math.round((double)sum/N)+"\n"+
		arr[(N+1)/2-1]+"\n"+mode+"\n"+(arr[N-1]-arr[0]));
	}
}
