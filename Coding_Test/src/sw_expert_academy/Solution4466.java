package sw_expert_academy;

import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;


class Solution4466 {
	public static void main(String args[]) throws Exception {
		/*
		 * 아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다. 여러분이 작성한 코드를
		 * 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후, 이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때
		 * 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다. 따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		 * 단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
		System.setIn(new FileInputStream("res/input4466.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];
			int answer = 0;

			for(int i=0; i<n; i++)
				arr[i] = sc.nextInt();

			Arrays.sort(arr);

			
			for (int i = n - 1; i >= n - k; i--) {
				answer += arr[i];
			}

			System.out.println("#" + test_case + " " + answer);

		}
	}
}