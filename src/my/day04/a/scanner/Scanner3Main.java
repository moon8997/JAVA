package my.day04.a.scanner;

import java.util.Scanner;

public class Scanner3Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 => ");
		
		try {
			String inputStr = sc.nextLine(); // "2021"
											 // "안녕하세요"
			int n = Integer.parseInt(inputStr) + 10; // // 2021 + 10 ==> 2031 
			// "안녕하세요" 는 정수로 변경이 불가하다.
			// Integer.parseInt(inputStr) ; 은 문자열 inputStr을 int로 바꾸어 주는 것이다.
			System.out.println("입력한 정수에 10을 더한값 : " + n);
		} catch(NumberFormatException e) {
			System.out.println(">>> 정수만 입력하세요 <<< \n");
			
		//	e.printStackTrace();
		}

		sc.close();
	}

}
