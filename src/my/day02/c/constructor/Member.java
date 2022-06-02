package my.day02.c.constructor;

public class Member {

	//filed, attribute, property, 속성
	String userid;
	String passwd;
	String name;
	int age;
	int point;
	// 생성자(constructor) ==> 인스턴스(객체)화 할 때에 사용되어지는 일종의 메소드라고 보면 된다.
	// 파라메타가 없는 생성자를 기본생성자(default constructor)라고 부른다.
	// 모든클래스는 아래와같이 기본생성자를 명기하지 않으면, 기본생성자가 없는 것이 아니라 생략되어져 안보이는 것이다.\
	// ● 모든 클래스는 기본생성자가 없는 것이 아니라 생략되어져 있다. ●
	
	public Member() {
		System.out.println(">>> 기본생성자 Member() 이 호출됨 <<<");
	}
	
	// >>> 파라메타가 있는 생성자의 주목적은 필드를 초기화시켜주는 것이다.
	// ● 파라메타가 있는 생성자를 만들면 자동적으로 생략되어져 있던 기본생성자가 삭제가 되어져 버린다. !●
	public Member(String userid, String passwd, String name) {
		
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		// this 는 클래스를 가지고 생성되는 인스턴스(객체)를 말한다.(==대명사)
	
		
	}
	
	// >>> 파라메타가 있는 생성자
	// ● 파라메타가 있는 생성자를 만들면 자동적으로 생략되어져 있던 기본생성자가 삭제가 되어져 버린다. !●
	public Member(String userid, String passwd, String name, int age, int point) {
		// String userid, Stirng passwd, String name, int age, int point 을 파라메터(parameter) 또는 매개변수 또는 인자 라고 부른다.
	/*
		this.userid = userid;
		// 지역변수명과 필드명이 동일할 경우 지역변수명이 더 우선이므로 모두 지역변수명으로 되어져 버린다.
		// this 는 클래스를 가지고 생성되는 인스턴스(객체)를 말한다.(==대명사)
	
		this.passwd = passwd;
		this.name = name;
		*/
		// 또는
		this(userid, passwd, name); // 또 다른 생성자를 호출한 것임.
		
		this.age = age;
		this.point = point;
		
		
	}
	
	
	// behavior, 행위, operation, 기능, 함수, method
	void showInfo() {

		System.out.println("===" + name + "님의 회원정보 ===\n"
						+ "1. 아이디 : " + userid + "\n"
						+ "2. 암호 : " + passwd + "\n"
						+ "3. 이름 : " + name + "\n"
						+ "4. 나이 : " + age + "\n"
						+ "5. 포인트 : " + point + "\n"
						);
		
	}
	
	// == return 타입이 void 인 메소드 생성 == //
	// 암호를 변경하려는 기능
	void updatePasswd(String currentPasswd, String newPasswd) {	//메소드 생성시 void는 리턴타입이 없는 타입이다.
		if (passwd != currentPasswd) {	// 같지 않다 != / 현재 인스턴스의 암호인 passwd와 입력받은 currentPasswd 값이 서로 다르다면 //
			System.out.println(">> '" + name +"'님의 현재 사용중인 암호와 다른 암호를 입력해서 암호 변경이 불가합니다. << \n");
		}	
		else {  // 현재 인스턴스의 암호인 passwd와 입력받은 currentPasswd 값이 서로 다르지 않다면
			passwd = newPasswd;
			
			System.out.println(">> \""+ name +"\"암호가 성공적으로 변경되었습니다.<<\n");
			showInfo() ;
		}
	}
	
	
	// == return 타입이 있는 메소드 생성 == //
	// 포인트 사용후 포인트를 차감해주는 기능(메소드)
	// 리턴값은 결제하고 남은 포인트 잔고를 돌려주려고 한다.
	int pointPayment(int point) {
		
		int jangoPoint = this.point;
		
		if(this.point == 0) {
			System.out.println(">> \""+ name +"\" 님 현재 포인트가 0 이므로 포인트 결제가 불가합니다.<<");
		}
		else if( this.point < point ) {
			System.out.println(">> \""+ name +"\" 님 현재 포인트 잔액이 부족하므로 결제가 불가합니다.<<");

		}
		else {
			System.out.println(">> \""+ name +"\" 님 "+ point +"포인트를 사용하여 결제가 완료되었습니다.<<");
			jangoPoint = jangoPoint - point;
		}
		return jangoPoint;
	}// end of int pointPayment(int point) =======================
	
	
	String memberInfo(int n){
		String title = "";
		if(n==0) {
			title = "=== "+ name +"님의 회원정보 수정하기전 ===\n";
		}
		else if(n==1) {
			title = "=== "+ name +"님의 회원정보 수정후 ===\n";
		}
		return title
				+ "1. 아이디 : "+userid+"\n"
				+ "2. 암호 : "+passwd+"\n"
				+ "3. 이름 : "+name+"\n"
				+ "4. 나이 : "+age+"\n"
				+ "5. 포인트 : "+point;
	}// end of String memberInfo() ===============================
	
	String changeInfo(String passwd, String name, int age, int point) {
		
		String befor_info = memberInfo(0); // 변경전 정보
		this.name = name;
		this.passwd = passwd;
		this.age = age;
		this.point = point;
		
		String after_info = memberInfo(1); // String 변경후 정보
		return befor_info + "\n\n" + after_info;
		
	} // end of String changeInfo(String passwd, String name, int age, int point)==================

	
	// !! 메소드의 오버로딩(overloading) !!
	// 1. 메소드의 이름은 같더라도 파라미터의 개수가 다르면 다른 메소드로 취급하므로 메소드 중복이 아니다.
	// 2. 메소드의 이름이 같고, 파라미터의 개수도 같더라도, 파라미터의 데이터타입의 순서가 다르면 다른 메소드로 취급하여 메소드 중복이 아니다.
	// 3. 메소드의 이름이 같고, 파라미터의 개도 같고, 파라미터의 데이터타입의 순서도 같고, return 타입만이 다를 경우엔 메소드 중복이라고 본다.
	// 4. 그러므로 이름이 같은 메소드 중복이 안되려면 return 타입은 필요가 없고 오로지 파라미터가 달라야 한다.
	String changeInfo(String passwd, int age, int point) {
		
		String befor_info = memberInfo(0); // 변경전 정보
		this.passwd = passwd;
		this.age = age;
		this.point = point;
		
		String after_info = memberInfo(1); // String 변경후 정보
		return befor_info + "\n\n" + after_info;
		
	} // end of String changeinfo(String passwd, int age, int point)==================	
	
}
