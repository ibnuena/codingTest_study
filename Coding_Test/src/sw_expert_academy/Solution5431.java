package sw_expert_academy;

import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Comparator;

class Solution5431
{
	public static void main(String args[]) throws Exception
	{
		
		System.setIn(new FileInputStream("res/input5431.txt"));

		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
			int submit = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			System.out.print("#" + test_case);

			for(int i=0; i<submit; i++) {
				list.add(sc.nextInt());
			}
			
			for(int i=1; i<=n; i++) {
				if(!list.contains(i))
					System.out.print(" " + i);
			}
			
			System.out.println();
		}
	}
}