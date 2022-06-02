package my.day05.b.IF;

public class Member {

	String id;
	String name;
	String nickName;
	
	void showinfo() {
		System.out.println("\n === "+name+"님의 회원정보=== \n"
						+ "1. 아이디 : " + id+"\n"
						+ "2. 성명 : " + name + "\n"
						+ "3. 별명 : " + nickName
						);
	
	}
	
	
}
