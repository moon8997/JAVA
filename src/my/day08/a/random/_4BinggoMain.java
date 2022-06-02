package my.day08.a.random;

import java.util.Random;
import java.util.Scanner;

public class _4BinggoMain {
	/*
    PC가 만들수 있는 숫자는  1 ~ 100 까지중 아무거나 1개를 만든다.

      예> 59 (PC가 랜덤하게 만든 숫자)
         
    1 부터 100 사이의 숫자입력 => 50엔터  1번시도
    >> 50보다 큰값입니다.

    1 부터 100 사이의 숫자입력 => 71엔터  2번시도
    >> 71보다 적은값입니다. 

    1 부터 100 사이의 숫자입력 => 60엔터  3번시도
    >> 60보다 적은값입니다.

    1 부터 100 사이의 숫자입력 => 58엔터  4번시도
    >> 58보다 큰값입니다.

    1 부터 100 사이의 숫자입력 => 59엔터  5번시도 
    #### 빙고!!  5번만에 맞추었습니다. ####       
*/   
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int userNum = 0;
		int cnt = 1;
		int start = 1, end = 100;
		
		
		int pcNum = rnd.nextInt(100 - 1 + 1) + 1;
		
		while(!(pcNum==userNum)) {
		do {
		System.out.print(start +"부터 "+end+"사이의 숫자입력 => ");
			try {
				userNum = Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력해주세요.");
			}
		
			if(start<=userNum && userNum<=end) {
				if(userNum>pcNum) {
					System.out.println(">> "+userNum+"보다 적은값입니다.\n");
					// end = userNum;
				}
				else if(pcNum>userNum) {
					System.out.println(">> "+userNum+"보다 큰값입니다.\n");
					// start = userNum;
				}
				else System.out.println(">> #### 빙고!! "+cnt+"번만에 맞추었습니다. #### ");
				
				break;	
			}
			else System.out.println("[경고] "+start+"부터 "+end+"까지의 숫자만 입력해주세요.\n");
		}while(true);
		cnt++;
		}
		
		
		
		
		

	}

}
