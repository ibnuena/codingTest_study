package sw_expert_academy;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution1209 {

	public static void main(String args[]) throws Exception
	{
		
		System.setIn(new FileInputStream("res/input1209.txt"));

		/*
		   ǥ���Է� System.in ���κ��� ��ĳ�ʸ� ����� �����͸� �о�ɴϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		
		/*
		   ���� ���� �׽�Ʈ ���̽��� �־����Ƿ�, ������ ó���մϴ�.
		*/

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int[][] arr = new int[100][100]; 
			int n = sc.nextInt();
			int answer = 0;
			
			for(int i=0; i<100; i++) 
				for(int j=0; j<100; j++) 
					arr[i][j] = sc.nextInt();
			
			for(int i=0; i<100; i++) { // ��
				int sum = 0;
				for(int j=0; j<100; j++){
					sum += arr[i][j];
				}
				answer = Math.max(answer, sum);
			}
			
			for(int i=0; i<100; i++) { // ��
				int sum = 0;
				for(int j=0; j<100; j++) {
					sum += arr[j][i];
				}
				answer = Math.max(answer, sum);
			}
			
			int sum = 0;
			
			for(int i=0; i<100; i++) { // �밢��
				int j = 0;
				
				sum = arr[i][j];
				j++;
			}
			
			answer = Math.max(answer, sum);
			sum = 0;
			
			for(int i=99; i>=0; i--) { // �밢��
				int j = 9;
				
				sum = arr[i][j];
				j--;
			}
			
			answer = Math.max(answer, sum);
			
			System.out.println("#" + n + " " + answer);
		}
	}
}