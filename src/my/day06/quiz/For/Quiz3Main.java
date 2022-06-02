package my.day06.quiz.For;

import java.util.Scanner;



public class Quiz3Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("▷ 휴대폰 번호를 입력하세요(예> 010-2345-6789) : ");
		String str = sc.nextLine();
		
		int length = str.length();
		String num = "";
				
		for(int i=0; i<length; i++) {			
				if(Character.isDigit(str.charAt(i))) { 				
					num += str.charAt(i); 
				}
				else {				
					continue;
				}
			
		}	// end of for ======
		
		System.out.println(num);
		
		sc.close();
		
	}

}
