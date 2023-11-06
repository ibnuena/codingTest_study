package sw_expert_academy;

import java.util.Scanner;
import java.io.FileInputStream;

public class Solution1215 {
	public static void main(String args[]) throws Exception
	{
		
		System.setIn(new FileInputStream("res/input1215.txt"));

		
		Scanner sc = new Scanner(System.in);
		

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int answer = 0;
			int n = sc.nextInt();
			String[] arr = new String[8];
			
			for(int i=0; i<8; i++)
				arr[i] = sc.next();
			
			for(int k=0 ; k<8; k++) {   // За
				for(int i=0; i<8-n+1; i++) { 
	
					int idx = 0;
					
					for(int j=0; j<n/2; j++) {	
						if(arr[k].charAt(i+j)==arr[k].charAt(i+n-j-1)) {
							idx++;
						}
					}
					if(idx==n/2)
						answer++;
				}
			}
			
			for(int k=0 ; k<8; k++) {   // ї­
				for(int i=0; i<8-n+1; i++) { 
	
					int idx = 0;
					
					for(int j=0; j<n/2; j++) {	
						if(arr[i+j].charAt(k)==arr[i+n-j-1].charAt(k)) {
							idx++;
						}
					}
					if(idx==n/2)
						answer++;
				}
			}
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
