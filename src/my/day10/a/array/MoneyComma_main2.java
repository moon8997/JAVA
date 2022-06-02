package my.day10.a.array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MoneyComma_main2 {
	
/*
	▷ 금액을 입력하세요(정수로만) => 123456790
	1,234,567,890 원

	▷ 금액을 입력하세요(정수로만) => 100
	100 원
*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("▷ 금액을 입력하세요(정수로만) => ");
		
		/*
		String str = sc.nextLine();
		System.out.println("입력시작:"+str+"입력끝");
		System.out.println("입력시작:"+str.trim()+"입력끝");
		// "   문자열   ".trim() 은 좌우쪽에 있는 공백을 없애준다. 중간에 있는 공백은 제거 x
		*/
		long money = Long.parseLong(sc.nextLine().trim());
		
		DecimalFormat df = new DecimalFormat("#,###");
		String smoney = df.format(money);
			
		System.out.println(smoney+"원");
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.print("▶ 금액을 입력하세요(정수로만) => ");
		String inputStr = sc.nextLine().trim();
		
		int len = inputStr.length() ; 
		
		int commaCount = len/3;
		
		if(len%3 == 0) commaCount-=1;
		
		char[] inputChArr = inputStr.toCharArray();
		/*
		          ------------------    -----------------
		데이터값 => |1|2|3|4|5|6|7|8|9|    |2|3|4|5|6|7|8|9|
				  ------------------    -----------------
		index =>  0 1 2 3 4 5 6 7 8      0 1 2 3 4 5 6 7 
		 
		 */
		
		char[] outputChArr = new char[len+commaCount]; // new char[9+2] new char[8+2]
		/*
        		  ----------------------    ----------------------
		데이터값 => |1|2|3|,|4|5|6|,|7|8|9|    |2|3|,|4|5|6|,|7|8|9|
		 		  ----------------------    ----------------------
		index =>  0 1 2 3 4 5 6 7 8      0 1 2 3 4 5 6 7 

		콤마가들어올자리 = > 7번 3번				 6번 2번 
		*/
		
		int cnt=0;		
		for(int i = outputChArr.length-1, j=inputChArr.length-1;i>=0;i--,j--) {
			cnt++;
			if(cnt%4 != 0){ // 값을 넣어주는 것이다
				outputChArr[i] = inputChArr[j];
			}
			else {	
				outputChArr[i] =','; // 콤마(,)를 넣어주는 것이다.
				j++;
			}
		}	// end of for=====
		
		String result = "";
		for(int i=0; i<outputChArr.length;i++) {
			result += outputChArr[i];
		}
		System.out.println(result +"원");
		sc.close();
	} // end of main(String[] args)==================

}
