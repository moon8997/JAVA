package my.day01;

public class Main {

	// 콘솔프로그램의 실행은 main(String[] args) 메소드에서 실행한다.
	public static void main(String[] args) {
		
		// 1명의 새로운 회원이 필요하다.
		Member lssmbr = new Member(); // 이순신
		// lssmbr 을 Member 클래스의 객체(==인스턴스)라고 부른다.
		
		lssmbr.id = "leess"; // = 은 어떤값을 어떤 변수에 대입한다라는 뜻
		lssmbr.pwd = "abcd";
		lssmbr.name = "이순신";
		lssmbr.email = "leess@naver.com";
		
		System.out.println("lssmbr : " + lssmbr);
		// lssmbr : my.day01.Member@379619aa
		// @다음에 나오는 16진수의 값은 메모리(RAM)상의 위치(주소)를 알려주는 것이다.
	
	
		// 또 1명의 새로운 회원이 필요하다.
		Member emojhmbr = new Member(); // 엄정화
		// emojhmbr 을 Member 클래스의 객체(==인스턴스)라고 부른다.
		
		emojhmbr.id = "eomjh"; // = 은 어떤값을 어떤 변수에 대입한다라는 뜻
		emojhmbr.pwd = "qwer1234";
		emojhmbr.name = "엄정화";
		emojhmbr.email = "eomjh@gmail.com";
		
		System.out.println("emojhmbr : " + emojhmbr);
		// emojhmbr : my.day01.Member@7de26db8

/*
 		==RAM(메모리)==
 		@379619aa == > lssmbr
 		id ==> "leess"
 		pwd ==> "abcd"
 		name ==> "이순신"
 		email ==> "leess@naver.com"
 		showinfo() method
 		
 				System.out.println("=== 회원정보 ====\n"  // \n 은 줄바꿈을 해주는 것
							+"1. 아이디 :" + id + "\n"		// 문자열 사이의 + 는 문자열 결합을 뜻한다.
							+"2. 비밀번호 :" + pwd + "\n"
							+"3. 성명 :" + name + "\n"
							+"4. 이메일 :" + email + "\n"	
 		
 		
 		@7de26db8 == > eomjhmbr
 		id ==> "eomjh"
 		pwd ==> "qwer1234"
 		name ==> "엄정화"
 		email ==> "eomjh@gmail.com"
 */
	
		
	lssmbr.showInfo(); // lssmbr 인스턴스(객체)에 대한 회원정보 출력하기
	emojhmbr.showInfo(); // emojhmbr 인스턴스(객체)에 대한 회원정보 출력하기
	
	//////////////////////////////////////////////
	
	System.out.println("\n~~~~~~~~~~~~~~~~~~~~");
	lssmbr.address = "인천광역시 송도구";
	
	lssmbr.showInfo();
	emojhmbr.showInfo();
	
	
	System.out.println("\n##############################");
	emojhmbr.address = "서울특별시 마포구";
	
	lssmbr.showInfo();
	emojhmbr.showInfo();
		

	System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	
	Member.address = "경기도 군포시";
	
	lssmbr.showInfo();
	emojhmbr.showInfo();
			
	}

	
	
}
