package my.day13.a.capsulation;

import java.util.Scanner;

public class Gujikja_main {

	public static void main(String[] args) {
		
		Gujikja lss_gu = new Gujikja();
		lss_gu.setUserid("leess");
		lss_gu.setPasswd("qWer1234$");
		lss_gu.setName("이순신");
		lss_gu.setJubun("9005071");
		
		
		Gujikja ejh_gu = new Gujikja();
		ejh_gu.setUserid("eomjh");
		ejh_gu.setPasswd("qWer1234$");
		ejh_gu.setName("엄정화");
		ejh_gu.setJubun("9810072");
		
		Gujikja yks_gu = new Gujikja();
		yks_gu.setUserid("youks");
		yks_gu.setPasswd("qWer1234$");
		yks_gu.setName("유관순");
		yks_gu.setJubun("9110072");
		
		
		Gujikja admin_gu = new Gujikja();
		admin_gu.setUserid("admin");
		admin_gu.setPasswd("qWer1234$");
		admin_gu.setName("관리자");
		admin_gu.setJubun("8911072");
		
		Gujikja[] guArr = new Gujikja[5];
		
		guArr[Gujikja.count++] = lss_gu;
		guArr[Gujikja.count++] = ejh_gu;
		guArr[Gujikja.count++] = admin_gu;
		guArr[Gujikja.count++] = yks_gu;
		
		////////////////////////////////
		
		
		Scanner sc = new Scanner(System.in);

		GujikjaCtrl ctrl = new GujikjaCtrl();
		ctrl.showMenu(sc, guArr);
		
		sc.close();
		System.out.println(">> == 프로그램 종료 == <<");
	}// end of main ---------------------

}
