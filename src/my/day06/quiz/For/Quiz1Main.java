package my.day06.quiz.For;

import java.util.Scanner;

public class Quiz1Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("▷ 문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		int length = str.length();

		   int upper_cnt=0, lower_cnt=0,  digit_cnt=0, special_cnt=0;


		   for(int i=0; i<str.length(); i++) {
			   
			    if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			    	lower_cnt++;
				else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
					upper_cnt++;
				else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
					digit_cnt++;
				else
					special_cnt++;
		   } // end of  for==========================

		
		
		System.out.println("입력한 문자열 : " + str);
		System.out.println("입력한 문자열의 길이 : "+length);
		System.out.println("대문자 개수 : "+upper_cnt + "개");
		System.out.println("소문자 개수 : "+lower_cnt + "개");
		System.out.println("숫자 개수 : "+digit_cnt + "개");
		System.out.println("특수문자 개수 : "+special_cnt + "개");
		
	sc.close();	
	}

}
