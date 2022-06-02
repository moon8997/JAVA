package my.day02.c.constructor;

public class MemberMain {

	public static void main(String[] args) {
		
		Member hongMbr = new Member();  // 파라메타가 없는 생성자를 기본생성자(default constructor)라고 부른다.
		
		hongMbr.userid = "hongkd";
		hongMbr.passwd = "1234";
		hongMbr.name = "홍길동";
		hongMbr.age = 20;
		hongMbr.point = 100;
		
		
		hongMbr.showInfo();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Member iyouMbr = new Member("iyou", "abcd", "아이유", 29, 300);
		
		iyouMbr.showInfo();

		System.out.println("=============================\n");
	
		Member chaewMbr = new Member("chaew", "qwer", "차은우");
		chaewMbr.showInfo();		
		
		
		System.out.println("###########################\n");
		
		// == return 타입이 void 인 메소드 호출 == //
		
		// hongMbr 인스턴스(객체)의 암호를 변경해주는 메소드 호출
		hongMbr.updatePasswd("12314", "0070$");  // parameter, argument, 매개변수, 인자
		
		// 아이유 인스턴스(객체)의 암호를 변경해주는 메소드 호출
		iyouMbr.updatePasswd("abcd", "asdf!");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		// == return 타입이 void 인 메소드 호출 == //
		int jangoPoint = hongMbr.pointPayment(30);
		System.out.println("남은 포인트 : " +jangoPoint);
		
		System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
		
		String info = hongMbr.changeInfo("5678", 30, 400); 
					 //				      암호  , 나이, 포인트
		System.out.println(info);
		/*
		 	=== 홍길동님의 회원정보 수정하기전 ===
		 	1. 아이디 : hongkd
		 	2. 암호 : 1234
		 	3. 이름 : 홍길동
		 	4. 나이 : 20
		 	5. 포인트 : 70
		 
			=== 홍길동님의 회원정보 수정 후 ===
		 	1. 아이디 : hongkd
		 	2. 암호 : 5678
		 	3. 이름 : 홍길동
		 	4. 나이 : 30
		 	5. 포인트 : 400	 
		 
		 */
		
		
		System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
		
		info = iyouMbr.changeInfo("5678", "이지은", 20, 900); 
				  //			   암호  ,   이름  ,나이, 포인트
		System.out.println(info);
	}
	/*
 	=== 아이유님의 회원정보 수정하기전 ===
 	1. 아이디 : iyou
 	2. 암호 : asdf!
 	3. 이름 : 아이유
 	4. 나이 : 29
 	5. 포인트 : 300
 
	=== 이지은님의 회원정보 수정 후 ===
 	1. 아이디 : iyou
 	2. 암호 : 5678
 	3. 이름 : 이지은
 	4. 나이 : 20
 	5. 포인트 : 900	 
 
 */

	
	
}
