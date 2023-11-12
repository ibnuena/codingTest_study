package sw_expert_academy;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution1234
{
	public static void main(String args[]) throws Exception
	{
		
		System.setIn(new FileInputStream("res/input1234.txt"));

		Scanner sc = new Scanner(System.in);
		
		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int n = sc.nextInt();
			String s = sc.next();
			ArrayList<Integer> list = new ArrayList<>(); 
			
			for(int i=0; i<n; i++) {
				list.add(Character.getNumericValue(s.charAt(i)));
			}
			
			for(int i=0; i<list.size()-1; i++) {
				if(list.get(i)==list.get(i+1)) {
//					System.out.println("i " + i);
					list.remove(i);
					list.remove(i);
					if(i - 2 < 0)
						i = -1;
					else
						i -= 2;
				}
				
			}
			
			System.out.print("#" + test_case + " ");
			for(int i=0; i<list.size(); i++)
				System.out.print(list.get(i));
			System.out.println();
			

		}
	}
}