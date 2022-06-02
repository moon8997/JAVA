package my.day04.b.scanner;

import java.util.Scanner;

public class SungjukMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Sungjuk lssSj = new Sungjuk(); // 기본생성자
		
		int progress = 0; // 진행상태
		
		try {
			System.out.print("1. 학번 : ");
			lssSj.hakbun = sc.nextLine(); // "091234"
			
			System.out.print("2. 성명 : ");
			lssSj.name = sc.nextLine(); // "이순신"
			
			System.out.print("3. 국어점수 : ");
			byte kor = Byte.parseByte(sc.nextLine()); // "90"
			
			// 원하는 숫자의 범위는 0~100
			// byte : -128 ~ 127
			
			if(lssSj.checkScore(kor)) {
				lssSj.kor = kor; //0~100
			}
			else { // -128~-1 || 101~127
			// System.exit(0); // 프로그램 종료(코드진행 여기서 끝)
			// 또는
				sc.close();
				return;
				// main()메소드내에서  return; 은  main()메소드에서 작업중인 것을 종료해라는 말이다. 
	            // 즉, 프로그램을 종료해라는 말이다.
			}
				
			
			System.out.print("4. 영어점수 : ");
			byte eng = Byte.parseByte(sc.nextLine()); // "90"
			
			if(lssSj.checkScore(eng)) {
				lssSj.eng = eng; //0~100
			}
			else { // -128~-1 || 101~127
				sc.close();
				return;
			}
			
			System.out.print("5. 수학점수 : ");
			byte math = Byte.parseByte(sc.nextLine()); // "90"
			
			if(lssSj.checkScore(math)) {
				lssSj.math = math; //0~100
			}
			else { // -128~-1 || 101~127
				sc.close();
				return;
			}
			
			progress = 1; // 진행상태
			
			System.out.print("6. 나이 : ");
			short age = Short.parseShort(sc.nextLine());
						// "20" "30" "50" ==> OK!
						// "ㅎㅎ" "8504141" ==> NumberFormatException ==> X
						// "10" "70" ==> short 로 가능하지만 나이제한(20~50)에 위반
			
			if(lssSj.checkAge(age)) {
				lssSj.age = age;
			}
			else {
				sc.close();
				return;
			}
			
			lssSj.showInfo();
			
			
		} catch(NumberFormatException e){
			if(progress == 0) {
				System.out.println(">> 점수 입력은 0부터 100까지만 가능합니다.\n");	
			}
			else {
				System.out.println(">> 나이 입력은 20부터 50까지만 가능합니다.\n");
			}
		
		}
				
		sc.close();

	}// end of public static void main(String[] args) -==-=-=-=-=-=========

}
