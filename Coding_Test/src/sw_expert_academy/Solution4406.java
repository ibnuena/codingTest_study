package sw_expert_academy;

import java.util.Scanner;
import java.io.FileInputStream;

/*
   ����ϴ� Ŭ�������� Solution �̾�� �ϹǷ�, ������ Solution.java �� ����� ���� �����մϴ�.
   �̷��� ��Ȳ������ �����ϰ� java Solution ������� ���α׷��� �����غ� �� �ֽ��ϴ�.
 */
class Solution4406
{
	public static void main(String args[]) throws Exception
	{
		
		System.setIn(new FileInputStream("res/input4406.txt"));

		/*
		   ǥ���Է� System.in ���κ��� ��ĳ�ʸ� ����� �����͸� �о�ɴϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   ���� ���� �׽�Ʈ ���̽��� �־����Ƿ�, ������ ó���մϴ�.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
//			 ��a��, ��e��, ��i��, ��o��, ��u��
			 String str = sc.next();
			 
			 str = str.replace("a", "");
			 str = str.replace("e", "");
			 str = str.replace("i", "");
			 str = str.replace("o", "");
			 str = str.replace("u", "");

			 System.out.println("#" + test_case + " " + str);
		}
	}
}
