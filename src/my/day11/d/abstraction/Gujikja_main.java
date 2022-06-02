package my.day11.d.abstraction;

import java.util.Scanner;

import my.util.MyUtil;

public class Gujikja_main {

	public static void main(String[] args) {

		Gujikja[] guArr = new Gujikja[5];
		
		Gujikja gu1 = new Gujikja();
		gu1.userid = "eomjh";
		gu1.passwd = "qwer1234$A";
		gu1.name = "엄정화";
		
	//	String jubun = null;       // ==> false
	//	String jubun = "951220";   // ==> false
	//	String jubun = "95122012"; // ==> false
	//  String jubun = "9512401";  // ==> false
	//	String jubun = "9512t01";  // ==> false
	//	String jubun = "9512207";  // ==> false
		
		String jubun = "9512202";  // ==> true
				
		boolean bool = MyUtil.isCheckJubun(jubun);
	//	System.out.println(bool);  // false
		
		if(bool) {
			gu1.jubun = jubun;
			guArr[Gujikja.count++] = gu1;
		}
		
		
		Gujikja gu2 = new Gujikja();
		gu2.userid = "leess";
		gu2.passwd = "qwer1234$B";
		gu2.name = "이순신";
		gu2.jubun = "9710201";
		
		guArr[Gujikja.count++] = gu2;
				
		
		Gujikja gu3 = new Gujikja();
		gu3.userid = "youks";
		gu3.passwd = "qwer1234$C";
		gu3.name = "유관순";
		gu3.jubun = "8510202";
		
		guArr[Gujikja.count++] = gu3;
				
		////////////////////////////////////////////////////////
		GujikjaCtrl ctrl = new GujikjaCtrl();
		
		Scanner sc = new Scanner(System.in);
	
		String smenuNo = "";
		do {
			
			System.out.println(" === 메인메뉴 === \n"
			                 + "1.구직자 회원가입   2.구직자 모두 보기  3.검색   4.프로그램 종료 \n"); 
	
			System.out.print("▷ 메뉴번호 선택 => ");
			smenuNo = sc.nextLine();
			
			switch (smenuNo) {
				case "1": // 구직자 회원가입
					if( Gujikja.count < guArr.length ) {
						
						Gujikja gu = ctrl.register(sc, guArr);
						guArr[Gujikja.count++] = gu;
						System.out.println(">> 회원가입 성공!! << \n");
						
					}
					
					else {
						System.out.println(">> [경고] 정원"+guArr.length+"명이 다차서 더이상 회원가입은 불가합니다.!! << \n"); 
					}
					
					break;
				
					
				case "2": // 구직자 모두 보기
					ctrl.showAll(guArr);
					break;
					
				case "3": // 검색메뉴를 보여주도록 호출
					searchMenu(sc, guArr, ctrl);
					break;
					
				case "4": // 프로그램 종료
					
					break;					
	
				default:  // 메뉴번호에 없는 값 
					System.out.println(">> [경고] 선택하신 번호는 메뉴에 없습니다. << \n");
					break;
			}// end of switch (key)-----------------
			
			
		} while ( !("4".equals(smenuNo) ));
		// end of do~while------------------------
		
		sc.close();
		
		System.out.println("\n~~~~~ 프로그램 종료 ~~~~~~");

	}// end of main(String[] args)----------------------------
	
	
	//////////////////////////////////////////////////////////////
	
	
	static void searchMenu(Scanner sc, Gujikja[] guArr, GujikjaCtrl ctrl) {
		
		String sMenoNo = "";
		
		do {
			System.out.println(" === 검색메뉴 === \n"
	                + "1.연령대검색   2.성별검색  3.연령대및성별검색   4.메인메뉴로 돌아가기 \n"); 
	
			System.out.print("▷ 검색메뉴번호 선택 => ");
			sMenoNo = sc.nextLine();
			
			switch (sMenoNo) {
				
				case "1": // 연령대검색
					int ageline = 0;
					
					for(;;) {
						System.out.print("▷ 검색할 연령대[예: 20] => "); 
						String sAgeline = sc.nextLine(); // "20" 또는 "30" 또는 "강아지"
					
						try {
							  ageline = Integer.parseInt(sAgeline);
							  break;
						} catch(NumberFormatException e) {
							System.out.println(">> [경고] 숫자만 입력하세요!! << \n");
						}
					}// end of for---------------------------------
					
					ctrl.showByAgeline(guArr, ageline);
										
					break;
					
					
				case "2": // 성별검색
					
					for(;;) {
						System.out.print("▷ 검색할 성별[남/여] => "); 
						String gender = sc.nextLine(); // "남" 또는 "여" 또는 "10" 또는 "똘똘이"
					
						if( !"남".equals(gender) && !"여".equals(gender)) {
							System.out.println(">> [경고] 남 또는 여 만 입력하세요!! << \n");
						}
						
						else {
							ctrl.showByGender(guArr, gender);
							
							break;
						}
						
					}// end of for---------------------------------
					
					break;	
					
					
				case "3": // 연령대및성별검색
					String gender = "";
					for(;;) {
					
						try {
							System.out.print("▷ 검색할 연령대[예: 20] => "); 
							String sAgeline = sc.nextLine(); // "20" 또는 "30" 또는 "강아지"
							ageline = Integer.parseInt(sAgeline);
							
						} catch(NumberFormatException e) {
							System.out.println(">> [경고] 숫자만 입력하세요!! << \n");
							continue;
						}
						
						System.out.print("▷ 검색할 성별[남/여] => "); 
						gender = sc.nextLine(); // "남" 또는 "여" 또는 "10" 또는 "똘똘이"
					
						if( !"남".equals(gender) && !"여".equals(gender)) {
							System.out.println(">> [경고] 남 또는 여 만 입력하세요!! << \n");
						}
						
						else {
							break;
						}
						
					}// end of for---------------------------------
					
					// 특정 연령대에 속하는 특정 성별을 가지는 구직자들만 조회가 되도록 한다.
					ctrl.showByAgeline(guArr, ageline, gender);
					
					
					break;	
					
					
				case "4": // 메인메뉴로 돌아가기
					
					break;					
	
				default:  // 메뉴에 없는 번호를 입력할 경우 
					System.out.println(">> [경고] 검색메뉴에 없는 번호입니다!! <<\n");
					break;
			}// end of swith()---------------------------------
			
		} while( !("4".equals(sMenoNo)) );
		
	}// end of void searchMenu()------------------------------
	

}
