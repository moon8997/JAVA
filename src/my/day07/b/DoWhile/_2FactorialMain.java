package my.day07.b.DoWhile;

import java.util.Scanner;

public class _2FactorialMain {

	// === 입사문제 === //
	/*
	  
	 >> 알고 싶은 팩토리얼 수 입력 => 5엔터
	 >> 5! = 120
	 
	  5! ==> 5*4*3*2*1
	  
	 */
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		outer:	// outer: 은 레이블 이다. 반복문 앞에 쓰면된다.
		do {
			try {
				System.out.print(">> 알고 싶은 팩토리얼 수 입력 => " );
				int num = Integer.parseInt(sc.nextLine());	// "5" => 가능
															// "1.234"	"안녕" => 불가
															// "-7", "0" => 불가
		
				if(num <= 0) {
					System.out.println(">> [경고] 자연수만 입력해 주세요! << \n");
					continue;
					// continue; 를 만나면 아래로 떨어지지 않고 do~while(조건식); 의 조건식으로 들어간다.
				}

				long result = 1;
				for(int i=num ; i>0; i--) {	// 5*4*3*2*1
				
					result *=i; 	// result = result*i
									// result = 1*5;
									// result = 1*5*4;
									// result = 1*5*4*3;
									// result = 1*5*4*3*2;
									// result = 1*5*4*3*2*1;
					
				
				} // end of for ==================
				
				System.out.println(num+"! = "+result );
				
				do {
					System.out.print(">> 또 하시겠습니까? [Y/N] = > ");
					String yn = sc.nextLine();
			
					if("Y".equalsIgnoreCase(yn)) {
						break;	// 가장 가까운 do while 문 탈출
					}
					
					else if ("N".equalsIgnoreCase(yn)) {
						break outer; // outer 반복문탈출
					}
					
					else {
						System.out.println(">> [경고] Y 또는 N만 입력하세요. \n");
					}
				
				} while (true);
				 // end of do~while========================
				
				
				
				
				
				
			}catch( NumberFormatException e) {
					System.out.println(">> [경고] 정수만 입력해 주세요! <<\n");
			}
		} while (true);
			

		sc.close();
		
		System.out.println("\n~~~~ 프로그램 종료 ~~~~");
		
	} // end of main ===============

}
