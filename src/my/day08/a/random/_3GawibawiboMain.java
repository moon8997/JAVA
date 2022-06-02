package my.day08.a.random;

import java.util.*;

public class _3GawibawiboMain {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int userNum = 0;	
		do {
			System.out.println("============= 메뉴 ============== \n"
							 + "1. 가위\t2.바위\t3.보\t4.게임종료\n"
							 + "================================");
			
			System.out.print(">> 선택하세요 => ");
			
			try {
			userNum = Integer.parseInt(sc.nextLine());
			}catch( NumberFormatException e) {
				System.out.println("▷ [경고] 숫자로만 입력하세요.\n");
				continue;
			}
			if( !(1<= userNum && userNum <=4) ) {
				System.out.println("▷ [경고] 메뉴에 존재하지 않는 번호 입니다.\n");	
				continue;
			}
			
			if (userNum!=4) { // 사용자가 1 또는 2 또는 3 을 입력한 경우이다.
			//	System.out.println("입력받은 값을 가지고 가위 바위 보 결과를 알아본다.");
				
				// 컴퓨터가 1 또는 2 또는 3 중에 하나를 랜덤하게 갖는다.
				int pcNum = rnd.nextInt(3 - 1 + 1) + 1;
			
				System.out.println("사용자 : "+userNum+" 컴퓨터 : "+pcNum);
				
				String msg = "";
				// 사용자가 이긴경우
				if(pcNum==1 && userNum==2 ||
				   pcNum==2 && userNum==3 ||
				   pcNum==3 && userNum==1) {					
					msg = ">> 사용자님이 이겼습니다!! << \n";	
				}
				// PC가 이긴경우(사용자가 진경우)
				else if(pcNum==2 && userNum==1 ||
					    pcNum==3 && userNum==2 ||
						pcNum==1 && userNum==3) {					
						msg = ">> 사용자님이 졌습니다!! << \n";	
						}
				// 사용자와 PC가 비긴경우
				else {
					msg = ">> 비겼습니다!! << \n";
				}
				System.out.println(msg);
			}
		
		} while(!(userNum==4));
		// end of do~while ===========================
		
		sc.close();
		System.out.println("\n========= 프로그램 종료 ============");
		
	} // end of main=================================

}
