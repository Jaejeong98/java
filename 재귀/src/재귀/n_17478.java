package ���;

import java.util.*;

public class n_17478 {
	public static String st="";
	public static void func(int num) {
		String s=st;
		if(num==0) {
			System.out.println(s+"\"����Լ��� ������?\"");
			System.out.println(s+"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(s+"��� �亯�Ͽ���.");
			return;
		}
		System.out.println(s+"\"����Լ��� ������?\"");
		System.out.println(s+"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println(s+"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println(s+"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		st+="____";
		func(num-1);
		System.out.println(s+"��� �亯�Ͽ���.");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		func(num);
	}
}
