package my.day17.d.collection;

import java.util.*;


public interface InterCompanyCtrl extends InterController {

	// == 구인회사 메뉴를 보여주는 메소드 생성하기 == //
	void showMenu(Scanner sc, List<Member> mbrList);
	
	// == 구인회사(Company) 신규 회원가입을 해주는 메소드 생성하기 == //
	void register(Scanner sc, List<Member> mbrList);
	
	// 관리자전용 메소드 생성하기 //
    void showAdminMenu(Scanner sc, List<Member> mbrList);
    
    // 모든 구인회사 정보조회 해주는 메소드 생성하기 //
 	void showAllCompany_info(List<Member> mbrList);
 	
    // 구인회사 업종별 검색 해주는 메소드 생성하기 //
 	void searchJobtype(List<Member> mbrList, Scanner sc);
    
	
}
