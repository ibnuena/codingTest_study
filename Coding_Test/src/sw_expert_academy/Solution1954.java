package sw_expert_academy;

import java.util.Scanner;
import java.io.FileInputStream;

/*
   ����ϴ� Ŭ�������� Solution �̾�� �ϹǷ�, ������ Solution.java �� ����� ���� �����մϴ�.
   �̷��� ��Ȳ������ �����ϰ� java Solution ������� ���α׷��� �����غ� �� �ֽ��ϴ�.
 */
class Solution1954
{
	public static void main(String args[]) throws Exception
	{
		/*
		   �Ʒ��� �޼ҵ� ȣ���� ������ ǥ�� �Է�(Ű����) ��� input.txt ���Ϸκ��� �о���ڴٴ� �ǹ��� �ڵ��Դϴ�.
		   �������� �ۼ��� �ڵ带 �׽�Ʈ �� ��, ���Ǹ� ���ؼ� input.txt�� �Է��� ������ ��,
		   �� �ڵ带 ���α׷��� ó�� �κп� �߰��ϸ� ���� �Է��� ������ �� ǥ�� �Է� ��� ���Ϸκ��� �Է��� �޾ƿ� �� �ֽ��ϴ�.
		   ���� �׽�Ʈ�� ������ ������ �Ʒ� �ּ��� ����� �� �޼ҵ带 ����ϼŵ� �����ϴ�.
		   ��, ä���� ���� �ڵ带 �����Ͻ� ������ �ݵ�� �� �޼ҵ带 ����ų� �ּ� ó�� �ϼž� �մϴ�.
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
			int j=0;          // ����, �Ʒ���, ������, ����
			boolean[] flag = {true, false, false, false};
			
			while(idx <= n*n) {
				if(flag[0] && arr[i][j] == 0) { // ����
					arr[i][j] = idx;
					if(j+1==n || arr[i][j+1]!=0) {
						flag[1] = true;
						flag[0] = false;
						i++;
					}
					else
						j++;

				}
				else if(flag[1] && arr[i][j]==0) { // �Ʒ���
					arr[i][j] = idx;

					if(i+1==n || arr[i+1][j]!=0) {
						flag[2] = true;
						flag[1] = false;
						j--;
					}
					else
						i++;

				}
				else if(flag[2] && arr[i][j]==0) { // ������
					arr[i][j] = idx;

					if(j-1==-1 || arr[i][j-1]!=0) {
						flag[3] = true;
						flag[2] = false;
						i--;
					}
					else
						j--;

				}
				else if(flag[3] && arr[i][j]==0) { // ����
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