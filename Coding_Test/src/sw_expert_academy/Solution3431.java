package sw_expert_academy;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution3431
{
	public static void main(String args[]) throws Exception
	{
		
		System.setIn(new FileInputStream("res/input3431.txt"));

		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int min = sc.nextInt();
			int max = sc.nextInt();
			int time = sc.nextInt();
			int answer = 0;
			
			if(min > time)
				answer = min - time;
			else if(max < time)
				answer = -1;
			else
				answer = 0;
			
			System.out.println("#" + test_case + " " + answer);
			
		}
	}
}
