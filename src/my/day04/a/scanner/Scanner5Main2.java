package my.day04.a.scanner;

import java.util.Scanner;

public class Scanner5Main2 {

	public static void main(String[] args) {
		
		System.out.println("== 2개의 숫자를 입력받아서 사칙연산(+ - * /) 결과 알아보기 == \n");
		String inputStr ="";
		
		Scanner sc = new Scanner(System.in);
	try {	
		System.out.print(">> 첫번째 정수 입력 : ");
		inputStr = sc.nextLine(); // "25"
					   // "ㅋㅋ"
		// "문자열"을 int 타입으로 형변환 시켜주는 방법
		int num1 = Integer.parseInt(inputStr);
		
		System.out.print(">> 두번째 정수 입력 : ");
		inputStr = sc.nextLine() ; // 2
		
		int num2 = Integer.parseInt(inputStr);
		
		/* [참고] int 타입을 문자열로 형변환 시켜주는 방법
		String str_num1 = Integer.toString(num1);
		String str_num2 = String.valueOf(num2);
		*/
		
		System.out.print(">> 사칙연산(+ - * /) 선택 : "); // "+" , "-", "*", "/"
		
		String operator = sc.nextLine();
	
		double result = 0;
		boolean b_flag = false;
		
		switch (operator) {	//byte short int char String
			case "+":
				result = num1 + num2;
				break;
	
			case "-":
				result = num1 - num2;
				break;
				
			case "*":
				result = num1 * num2;
				break;
				
			case "/":
				result = (double)num1 / num2;
				break;
				
			default:
				b_flag = true;
				break;
		} // end of switch (operator)============================
		
			if(b_flag==false) {

		System.out.println(">> 결과 : " + num1 + operator + num2 + "="+ result );
				
				}
			else {
		System.out.println(operator+" 은(는) 올바르지 않은 사칙연산이므로 계산이 불가합니다.");
			}
		} catch(NumberFormatException e) {
		System.out.println(">> "+inputStr+" 은(는) 정수가 아닙니다. 정수만 입력하세요!<<");
	}
	
	
		
		sc.close();
	}

}
