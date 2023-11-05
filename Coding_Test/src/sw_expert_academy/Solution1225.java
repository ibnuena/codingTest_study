package sw_expert_academy;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution1225 {
	public static void main(String args[]) throws Exception {
		/*
		 * �Ʒ��� �޼ҵ� ȣ���� ������ ǥ�� �Է�(Ű����) ��� input.txt ���Ϸκ��� �о���ڴٴ� �ǹ��� �ڵ��Դϴ�. �������� �ۼ��� �ڵ带
		 * �׽�Ʈ �� ��, ���Ǹ� ���ؼ� input.txt�� �Է��� ������ ��, �� �ڵ带 ���α׷��� ó�� �κп� �߰��ϸ� ���� �Է��� ������ ��
		 * ǥ�� �Է� ��� ���Ϸκ��� �Է��� �޾ƿ� �� �ֽ��ϴ�. ���� �׽�Ʈ�� ������ ������ �Ʒ� �ּ��� ����� �� �޼ҵ带 ����ϼŵ� �����ϴ�.
		 * ��, ä���� ���� �ڵ带 �����Ͻ� ������ �ݵ�� �� �޼ҵ带 ����ų� �ּ� ó�� �ϼž� �մϴ�.
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