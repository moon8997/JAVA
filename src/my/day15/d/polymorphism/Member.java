package my.day15.d.polymorphism;

import my.util.MyUtil;

public abstract class Member {  // 부모클래스. 미완성 클래스(추상 클래스, abstract class)

	// field(속성) 생성
	private String id;     // 아이디
	private String passwd; // 비밀번호

	public static int count;
	
	// method 생성(==> field(속성)를 어떤 방식으로 처리하고자 할때 메소드를 통해서 처리한다.)
	protected String getId() {
		return id;
	}
	
	protected void setId(String id) {
		// 아이디 (글자수가 2글자 이상 10글자 이하)
		
		if( id != null && !id.trim().isEmpty() ) {
		
			int len = id.length();
			
			if(2 <= len && len <= 10)
				this.id = id;
			else 
				System.out.println(">> [경고] 아이디는 2글자 이상 10글자 이하이어야 합니다. << \n");
		}
		else {
			System.out.println(">> [경고] 아이디는 null 또는 공백만으로 될 수는 없습니다. << \n");	
		}
		
	}
	
	protected String getPasswd() {
		return passwd;
	}
	
	
	protected void setPasswd(String passwd) {
		
		if( MyUtil.isCheckPasswd(passwd) ) 
			this.passwd = passwd;
		
		else
			System.out.println(">> [경고] 비밀번호는 8글자 이상 15글자 이하의 대,소문자 및 숫자, 특수기호가 혼합되어야만 합니다. << \n"); 		
	}
	
	
	/////////////////////////////////////////////////////////////////
	
	public abstract void showInfo();  // 미완성 메소드(추상 메소드, abstract method)
	
	public abstract void viewInfo();  // 미완성 메소드(추상 메소드, abstract method)
	
	public abstract String getInfo(); // 미완성 메소드(추상 메소드, abstract method)
	
}
