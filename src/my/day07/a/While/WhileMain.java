package my.day07.a.While;

public class WhileMain {
	/*
    === while 문 형식 ===
    
    변수의 초기화;
       
    while(조건식) {
       조건식이 참(true)이라면 반복해서 실행할 명령문을 실행하고,
       조건식이 거짓(false)이라면 while의 { } 이부분을 빠져나간다. 
       
       반복해서 실행할 명령문;
       증감식;
    }
 */   
	public static void main(String[] args) {
	
		int cnt=5, loop=0;
		while(loop < cnt) { // 0<5		1<5		2<5		3<5		4<5
			System.out.println((loop+1)+".안녕 자바~");
			loop++;
		}// end of while===================
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		cnt=5; loop=0;
		while(loop++ < cnt) { // 0<5		1<5		2<5		3<5		4<5
			System.out.println(loop+".Hello Java~");
			
		}// end of while===================

		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		cnt=5; loop=0;
		while(loop < cnt) { // 0<5		1<5		2<5		3<5		4<5
			System.out.println(++loop+".안녕 이클립스~");
			
		}// end of while===================
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		loop=0;
		while(true) {
			System.out.println(++loop+".안녕 Eclipse~");
			if(loop==5)
				break;
		}// end of while===================
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		loop=0;
		while(!(++loop > 5)) {
			// !( ) ==> 괄호()속에는 while 반복문을 빠져나갈 조건식의 정의를 내리는 것이다. 
			System.out.println(loop+".안녕 오라클~");

		}// end of while===================
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~`\n");
		
		loop=0;
		while(true) {
			
			if(++loop>10) {
				break;
			}
			
			if(loop%2 == 0){
				continue;
			}
			
			System.out.println(loop+".Hi Oracle~~~" );
		}
		
		/*
		 * 1. Hi Oracle~~
		 * 3. Hi Oracle~~
		 * 5. Hi Oracle~~
		 * 7. Hi Oracle~~
		 * 9. Hi Oracle~~
		 */
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~\n");
		System.out.println("\n=== 5단 ===");
		
		loop=0;
		while(++loop<10) {
			System.out.println("5*"+loop+"="+(5*loop));
		}
		
		System.out.println("\n=== 6단 ===");
		
		loop=0;
		while(true) {
			if(++loop>9)	break;
			System.out.println("6*"+loop+"="+(6*loop));
	
		}	
		
		System.out.println("\n=== 7단 ===");
		
		loop=0;
		while(!(++loop>9)) {	// while문의 탈출 조건을 쓴다.
			System.out.println("7*"+loop+"="+(7*loop));
		}
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.printf("%-35s\n","=== 구구단 ===");
		
		// 9행 	8열
		// jul 	dan
		int jul = 0, dan = 1;
		
		while(!(++jul>9)) {  // 9행
			
			while(!(++dan > 9)) { // 8열
				String str = (dan<9)?"\t":"\n"; 
				System.out.print( dan +"*"+jul+"="+(dan*jul + str));
			
			}
			
			dan = 1; // 다시 한번 초기화
			
		} // end of while ==============
		
		
		System.out.println("\n>> 프로그램 종료 <<");
		
	}	// end of main

}
