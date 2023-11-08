package sw_expert_academy;

import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
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