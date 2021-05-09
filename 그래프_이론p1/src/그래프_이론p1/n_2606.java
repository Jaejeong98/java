package 그래프_이론p1;

import java.io.*;

public class n_2606 {
	static int num1, num2, count;
	static boolean arr[][], arr2[];
	static void func(int n) {
		arr2[n] = true;
		for (int i = 1; i<=num1; i++) {
			if (arr[n][i] == true && arr2[i] == false) {
				count++;
				func(i);
			}
		}
	}
	public static void main(String[] agrs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num1 = Integer.parseInt(br.readLine());
		num2= Integer.parseInt(br.readLine());
		arr = new boolean[num1+1][num1+1];
		arr2 = new boolean[num1+1];
		for (int i = 1; i<=num2; i++) {
			String str[] = br.readLine().split(" ");
			int n1 = Integer.parseInt(str[0]), n2 = Integer.parseInt(str[1]);
			arr[n1][n2] = true;
			arr[n2][n1] = true;
		}
		func(1);
		System.out.println(count);
	}
}