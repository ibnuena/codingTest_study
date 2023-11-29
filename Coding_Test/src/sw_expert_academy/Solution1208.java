package sw_expert_academy;

import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

class Solution1208 {
	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("input1208.txt"));

		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * ���� ���� �׽�Ʈ ���̽��� �־����Ƿ�, ������ ó���մϴ�.
		 */

		for (int test_case = 1; test_case <= 10; test_case++) {
			int n;
			int answer = 0;
			int[] arr = new int[100];
			
			n = sc.nextInt();
			
			for(int i=0; i<100; i++)
				arr[i] = sc.nextInt();
			
			for(int i=0; i<n; i++) {
				Arrays.sort(arr);
				arr[99] -= 1;
				arr[0] += 1;
			}
			
			Arrays.sort(arr);
			answer = arr[99] - arr[0];
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
