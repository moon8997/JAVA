package my.day05.f.For;

import java.util.Scanner;

import my.util.MyUtil;

public class MemberMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 회원가입 하기(유효성 검사) ===\n");
		
		
		String userid = "";
		for(;;) {
				System.out.print("1. 아이디 => ");
				userid = sc.nextLine();
				if(userid.length() == 0) {
				System.out.println("아이디는 공란일수 없습니다.\n");
				}
		
		else
			break;
		}
		String passwd = "";
		for(;;) {
			System.out.print("2. 암호 => ");
			passwd = sc.nextLine();
	
			if(!MyUtil.isCheckPasswd(passwd)) { // ! == false
				System.out.println(" [경고]암호는 8글자 이상 15글자 이하의 대문자, 소문자, 숫자, 특수문자가 혼합되어져있어야만 통과합니다.\n");
			}
		
			
			else {
				break;
			}
		}// end of for -=====
		

		String name = "";
		for(;;) {
			System.out.print("3. 성명 => ");
			name = sc.nextLine();
			if(name.length()==0) {
				System.out.println("성명은 공란일 수 없습니다.\n");
			}
			else
				break;
		
		} // end of for ====================
		
		Member mbr = new Member();
		mbr.userid = userid;
		mbr.passwd = passwd;
		mbr.name = name;
		
		mbr.showinfo();
		
		sc.close();
		

	}

}
