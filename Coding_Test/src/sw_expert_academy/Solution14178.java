package sw_expert_academy;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution14178
{
	public static void main(String args[]) throws Exception
	{
		
		System.setIn(new FileInputStream("res/input14178.txt"));

		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   ���� ���� �׽�Ʈ ���̽��� �־����Ƿ�, ������ ó���մϴ�.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
			int d = sc.nextInt();
			int answer = 0;
			
			d = d*2 + 1;
			
			if (n%d == 0)
				answer = n/d;
			else
				answer = n/d + 1;
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
