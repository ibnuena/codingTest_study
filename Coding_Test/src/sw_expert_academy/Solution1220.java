package sw_expert_academy;

import java.util.Scanner;
import java.util.Stack;
import java.io.FileInputStream;

class Solution1220 {
	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("res/input1220.txt"));

		Scanner sc = new Scanner(System.in);

		int T = 10;

		for (int test_case = 1; test_case <= 10; test_case++) {
			int n = sc.nextInt();
			int answer = 0;
			boolean flag = false;
			boolean isN = false;
			boolean zero = false;
			boolean set = false;
			Stack<Integer>[] stack = new Stack[100];
			

			for (int i = 0; i < n; i++) {
				stack[i] = new Stack<>();
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					stack[j].add(sc.nextInt());
				}
			}

			for (int i = 0; i < n; i++) {
				flag = false;
				for(int j=0; j<n; j++) {
					if(stack[i].peek()==2) {
						flag = true;
					}
					else if(flag==true && stack[i].peek()==1) {
						answer++;
						flag = false;
					}

					stack[i].pop();

				}
			}
			

			System.out.println("#" + test_case + " " + answer);

		}
	}
}
