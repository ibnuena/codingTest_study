package sw_expert_academy;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution1289
{
	public static void main(String args[]) throws Exception
	{
		
		System.setIn(new FileInputStream("res/input1289.txt"));

		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String s = sc.next();
			int answer = 0;
	//		System.out.println(s);
			
			if(s.charAt(0)=='1')
				answer++;
			
			for(int i=0; i<s.length()-1; i++) {
				if(s.charAt(i)!=s.charAt(i+1))
					answer++;
			}
			
			System.out.println(answer);

		}
	}
}