package sw_expert_academy;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution3499
{
	public static void main(String args[]) throws Exception
	{
		System.setIn(new FileInputStream("res/input3499.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
			String[] arr = new String[n];
			
			for(int i=0; i<n; i++) {
				arr[i] = sc.next();
			}
			
			System.out.print("#" + test_case);
			
			int j = 0;
			int i = 0;

			if(n%2 == 0)
				j = n/2;
			else
				j = n/2 + 1;
			
			
			boolean flag = true;
			
			for(int k=0; k<n; k++) {
				if(flag) {
					System.out.print(" " + arr[i]);
					flag = false;
					i++;
				}
				else {
					System.out.print(" " + arr[j]);
					flag = true;
					j++;
				}
			}
			
			System.out.println();
			
			
		}
	}
}
