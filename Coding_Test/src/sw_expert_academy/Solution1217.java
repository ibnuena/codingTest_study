package sw_expert_academy;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution1217
{
	public static void main(String args[]) throws Exception
	{
		
		System.setIn(new FileInputStream("res/input1217.txt"));

		Scanner sc = new Scanner(System.in);
		
		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int n = sc.nextInt();
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			System.out.println("#" + test_case + " " + pow(n1, n2));
		} 
	}
	
	public static int pow(int a, int b) {
		if(b==0)
			return 1;
		return pow(a, b-1) * a; 
	}
}
