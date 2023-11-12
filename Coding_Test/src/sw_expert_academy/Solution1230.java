package sw_expert_academy;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution1230 {
	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("res/input1230.txt"));

		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			int before = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<>();

			for (int i = 0; i < before; i++)
				list.add(sc.nextInt());

			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				String type = sc.next();

				if (type.equalsIgnoreCase("I")) {
					int idx = sc.nextInt();
					int n2 = sc.nextInt();
					for (int j = 0; j < n2; j++) {
						list.add(idx + j, sc.nextInt());
					}
				}
				else if(type.equalsIgnoreCase("D")) {
					int idx = sc.nextInt();
					int n2 = sc.nextInt();
					for(int j=0; j<n2; j++) {
						list.remove(idx);
					}
				}
				else if(type.equalsIgnoreCase("A")) {
					int n2 = sc.nextInt();
					for(int j=0; j<n2; j++) {
						list.add(sc.nextInt());
					}
				}
			}

			System.out.print("#" + test_case);
			for (int i = 0; i < 10; i++)
				System.out.print(" " + list.get(i));

			System.out.println();
		}
	}
}
