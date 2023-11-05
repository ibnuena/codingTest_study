package sw_expert_academy;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution1225 {
	public static void main(String args[]) throws Exception {
		/*
		 * 아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다. 여러분이 작성한 코드를
		 * 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후, 이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때
		 * 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다. 따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		 * 단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
		System.setIn(new FileInputStream("res/input1225.txt"));

		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			int n = sc.nextInt();
			int[] arr = new int[8];

			for (int i = 0; i < 8; i++)
				arr[i] = sc.nextInt();

			int j=1;
			while (true) {
				int temp;
				
				if(j==6)
					j = 1;
				
				arr[0] -= j;
				if(arr[0] <= 0)
					arr[0] = 0;
				
				temp = arr[0];
				j++;
				
				for (int i = 0; i < 7; i++) {
					arr[i] = arr[i+1];
				}
				
				arr[7] = temp;
				
				if(arr[7] <= 0)
					break;
			}
			
			System.out.print("#" + n);
			for(int i : arr)
				System.out.print(" " + i);
			System.out.println();
		}
	}
}