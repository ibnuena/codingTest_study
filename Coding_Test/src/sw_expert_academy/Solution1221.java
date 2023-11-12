package sw_expert_academy;

import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;

class Solution1221
{
	public static void main(String args[]) throws Exception
	{
		
		System.setIn(new FileInputStream("res/input1221.txt"));

		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("ZRO");
		list.add("ONE");
		list.add("TWO");
		list.add("THR");
		list.add("FOR");
		list.add("FIV");
		list.add("SIX");
		list.add("SVN");
		list.add("EGT");
		list.add("NIN");

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String test_num = sc.next();
			int n =  sc.nextInt();
			int[] arr = new int[n];

			for(int i=0; i<n; i++) {
				arr[i] = list.indexOf(sc.next());
			}
			
			Arrays.sort(arr);
			System.out.print(test_num);

			for(int i=0; i<n; i++) {
				System.out.print(" " + list.get(arr[i]));
			}
			System.out.println();

		}
	}
}
