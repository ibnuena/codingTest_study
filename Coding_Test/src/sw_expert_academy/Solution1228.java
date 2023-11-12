package sw_expert_academy;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution1228 {
	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("res/input1228.txt"));

		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			int before = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<>();

			for (int i = 0; i < before; i++)
				list.add(sc.nextInt());

			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				sc.next();

				int idx = sc.nextInt();
				int n2 = sc.nextInt();
				for (int j = 0; j < n2; j++) {
					list.add(idx+j, sc.nextInt());
				}
			}
			
			System.out.print("#" + test_case);
			for(int i=0; i<10; i++)
				System.out.print(" " + list.get(i));
			
			System.out.println();
		}
	}
}
