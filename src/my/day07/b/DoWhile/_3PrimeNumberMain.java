package my.day07.b.DoWhile;

import java.util.*;

public class _3PrimeNumberMain {
	   // === 소수란? === 
	   // 소수란? 1과 자기 자신으로밖에 나누어지지 않는 1 이외의 정수 
	   // 예> 1 부터 10까지의 소수를 나타내면 
	   //       2%2 ==> 0   2 는 소수
	   //       3%3 ==> 0   3 는 소수
	   //       4%2 ==> 0   4 는 소수가 아님
	   //       5%5 ==> 0   5 는 소수
	   //       6%2 ==> 0   6 는 소수가 아님
	   //       7%7 ==> 0   7 는 소수
	   //       8%2 ==> 0   8 는 소수가 아님
	   //       9%3 ==> 0   9 는 소수가 아님
	   //      10%2 ==> 0  10 는 소수가 아님  
	
	
/*
		    ==실행결과==
		  ▷시작 자연수 : 1엔터
		  ▷끝 자연수 : 20엔터 
		  1 부터 20 까지의 소수는?
		  2,3,5,7,11,13,17,19
		  
		  1부터 20 까지의 소수의 개수? 8개  
		  
		  1부터 20 까지의 소수들의 합? 77 
		  
		  === 프로그램 종료 ===      
*/
	public static void main(String[] args) {
		String str_result = "";
		Scanner sc = new Scanner(System.in);
		int startNo = 0, endNo = 0;
		
		do {
			try {
				System.out.print("▷ 시작 자연수 : ");
				startNo = sc.nextInt(); // 1엔터 or 1.345엔터 or ㅋㅋ엔터
				sc.nextLine();
				
				System.out.print("▷ 끝 자연수 : ");
				endNo = sc.nextInt(); // 20엔터 or 2.345엔터 or ㅎㅎ엔터
				sc.nextLine();
				
				if(startNo <1 || endNo <1) {
					System.out.println("[경고] 입력하시는 값은 모두 자연수이어야 합니다.\n");
				}
				else if(startNo >= endNo) {
					System.out.println("[경고] 끝 자연수는 시작 자연수보다 커야합니다.\n");
				}
				else {
					break;
				}
				
				
			}catch(InputMismatchException e) {
				System.out.println("[경고] 자연수만 넣어주세요.\n");
			}
		} while (true);
		// end of do while =============================
		
		/*
		  ▷시작 자연수 : 1
		  ▷끝 자연수 : 20
			// 1부터 20까지의 소수를 구해야 한다.
		*/
		int cnt=0 ; // 소수의 누적 개수
		int sum=0; // 소수들의 누적 합계
		
		for(int i =startNo; i<=endNo; i++ ) {
			
			if(i==1) 	//i 가 소수인지 아닌지를 검사할 대상이다.
				continue; // 1은 소수가 아니므로 검사할 필요가 없기에 continue; 를 해야한다.
			
			/*
			
			나누기를 했을때 나머지가 얼마가 되는지 일일히 검사를 한다.
			만약에 i가 2 이라면 ==> 2%2==0 2는 소수이다.
			만약에 i가 3 이라면 ==> 3%2!=0 3%3==0 3은 소수이다.
			만약에 i가 4 이라면 ==> 4%2==0 4는 소수가 아니다.
			만약에 i가 5 이라면 ==> 5%2!=0 5%3!=0 5%4!=0 5%5==0 5는 소수이다. 
			.................
			만약에 i가 9 이라면 ==> 9%2!=1 9%3==0 9는 소수가 아니다.
			
			*/
			boolean isSosu = true;
			
			
			for(int j=2; j<i; j++) { 	// j가 분모에 들어갈 값이다.
				if(i%j == 0) {  // 검사 대상인 i가 소수가 아닌경우
					isSosu = false; // 소수가 아님을 표시
					break;					
				}
				
			} // end of for========
			
			if(isSosu) {
				String str_add = (!"".equals(str_result))?",":"";
				str_result += str_add + i;
				
				cnt++; // 소수의 개수를 누적
				sum += i; // 소수들의 누적의 합계
			}
		
			
			
		}// end of for ================
		System.out.println(startNo+" 부터 "+endNo+" 까지의 소수는?\n" + str_result);
		
		System.out.println("\n"+startNo+"부터 "+endNo+" 까지의 소수의 개수? "+ cnt +"개" );
		
		System.out.println(startNo+"부터 "+endNo+" 까지의 소수의들의 합? " + sum+"\n");
		
		sc.close();
		System.out.println("=== 프로그램 종료 ===");
	} // end of main============================

}
