package sw_expert_academy;

import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution4406
{
	public static void main(String args[]) throws Exception
	{
		
		System.setIn(new FileInputStream("res/input4406.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
//			 ‘a’, ‘e’, ‘i’, ‘o’, ‘u’
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
