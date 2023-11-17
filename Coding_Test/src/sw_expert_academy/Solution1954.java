package sw_expert_academy;

import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution1954
{
	public static void main(String args[]) throws Exception
	{
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
		System.setIn(new FileInputStream("res/input1954.txt"));

		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					arr[i][j] = 0;
				}
			}
			
			
			
			int idx = 1;
			int i=0;
			int j=0;          // 왼쪽, 아래쪽, 오른쪽, 위쪽
			boolean[] flag = {true, false, false, false};
			
			while(idx <= n*n) {
				if(flag[0] && arr[i][j] == 0) { // 왼쪽
					arr[i][j] = idx;
					if(j+1==n || arr[i][j+1]!=0) {
						flag[1] = true;
						flag[0] = false;
						i++;
					}
					else
						j++;

				}
				else if(flag[1] && arr[i][j]==0) { // 아래쪽
					arr[i][j] = idx;

					if(i+1==n || arr[i+1][j]!=0) {
						flag[2] = true;
						flag[1] = false;
						j--;
					}
					else
						i++;

				}
				else if(flag[2] && arr[i][j]==0) { // 오른쪽
					arr[i][j] = idx;

					if(j-1==-1 || arr[i][j-1]!=0) {
						flag[3] = true;
						flag[2] = false;
						i--;
					}
					else
						j--;

				}
				else if(flag[3] && arr[i][j]==0) { // 위쪽
					arr[i][j] = idx;

					if(i-1==-1 || arr[i-1][j]!=0) {
						flag[0] = true;
						flag[3] = false;
						j++;
					}
					else
						i--;

				}
				idx++;
			}
			System.out.println("#" + test_case);
			
			for(int k=0; k<n; k++) {
				for(int t=0; t<n; t++) {
					System.out.print(arr[k][t] + " ");
				}
				System.out.println();
			}
			
		}
	}
}