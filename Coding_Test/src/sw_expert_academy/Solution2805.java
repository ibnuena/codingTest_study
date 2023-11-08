package sw_expert_academy;

import java.util.Scanner;
import java.io.FileInputStream;

/*
   ����ϴ� Ŭ�������� Solution �̾�� �ϹǷ�, ������ Solution.java �� ����� ���� �����մϴ�.
   �̷��� ��Ȳ������ �����ϰ� java Solution ������� ���α׷��� �����غ� �� �ֽ��ϴ�.
 */
class Solution2805 {
	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("res/input2805.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			int answer = 0;
			int idx = 1;
			
			for(int i=0; i<n; i++) {
				String s = sc.next();

				for(int j=0; j<n; j++) {
					arr[i][j] = Character.getNumericValue(s.charAt(j));
				}
			}
			
			for (int i = 0; i < n; i++) {
					if (n / 2 >= i) {
						for (int k = n / 2 - i; k <= n / 2 + i; k++) {
							answer += arr[i][k];
					//		System.out.println("answer " + answer + "\t i  " + i + "\t  k " + k);
						}
					}
					else {
						
						for (int k = idx; k <= n-idx-1; k++) {
							answer += arr[i][k];
						//	System.out.println("answer " + answer + "\t i  " + i + "\t  k " + k);
						}
						idx++;
					}
			}

			System.out.println("#" + test_case + " " + answer);
			
		}
	}
}