package my.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyUtil {

	// === 현재시각을 출력해주는 static 메소드 생성하기 === //
	public static void currentTime() {
		
		Date now = new Date();
		
		SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String today = sdfrmt.format(now);
		
		System.out.println(">> 현재시각 : " + today);
		// 2021-12-07 10:43:50
	}
	
	
	   // === 비밀번호가 규칙에 맞는지 틀리는지 알려주는 static 메소드 생성하기 === // 
	   // 비밀번호 규칙은 비밀번호의 길이는 8글자 이상 15글자 이하이어야 하고,
	   // 또한 비밀번호는 영문대문자, 영문소문자, 숫자, 특수기호가 혼합되어야만 한다.
	   // 우리는 규칙에 맞으면 true , 규칙에 틀리면  false 를 리턴해주도록 만든다.
	
	public static boolean isCheckPasswd(String passwd) {
		
		// passwd => "qwEr1234$" 이라면 
		// 문자열 "qwEr1234$" 의 문자열 길이는 "qwEr1234$".length(); 이다.
		// "qwEr1234$".length(); 은 9가 나온다.
		
		int length = passwd.length();
		
		if(length < 8 || length > 15) {	
			return false;
		}
		else { // 암호의 길이가 8글자 이상 15글자 이하인 경우 (조건 충족)
			
			boolean flagUpper = false;	// 대문자임을 표시하는 것
			boolean flagLower = false;	// 소문자임을 표시하는 것
			boolean flagDigit = false;	// 숫자임을 표시하는 것
			boolean flagSpecial = false;// 특수문자임을 표시하는 것
			
			for(int i=0; i<length; i++) {
				// 암호가 "qwEr1234$" 이라면
				// index 012345678
				
				char ch = passwd.charAt(i);
				
				if(Character.isUpperCase(ch)) 
					flagUpper = true;
				else if (Character.isLowerCase(ch))
					flagLower = true;
				else if (Character.isDigit(ch))
					flagDigit = true;
				else 
					flagSpecial = true;
				
			}//end of for =============
		
			return (flagUpper && flagLower && flagDigit && flagSpecial);
			
			
		}
		

	} // end of public static boolean isCheckPasswd(String passwd)============
	
	
	// === ,가 들어있는 숫자로 되어진 문자열을 ,를 제거해서 정수로 리턴시켜주는 메소드 생성하기 === //
	public static int delComma(String str) {
		
		do {	
			int commaIndex = str.indexOf(",");
			
			if(commaIndex == -1) break;
			
			str = str.substring(0, commaIndex) + str.substring(commaIndex+1);
			
		} while (true);
		
		return Integer.parseInt(str);
		
		
	} // end of public static int delComma(String str) ==============
	
	
	// === 주민번호 7자리를 입력받아서 올바른 데이터 인지 검사해주는 메소드 생성 === //
	public static boolean isCheckJubun(String jubun) {
		
		if(jubun == null)
			return false;
		
		// 정규표현식(Regular Expression)이란?
	    // ==> 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰이는 형식언어
		
		// == 1. 정규표현식(Regular Expression) 패턴을 작성한다. == //
	//	Pattern p = Pattern.compile("^[0123456789][0-9][01][0-9][0-3][0-9][1-4]$");
		// ^ 은 시작을 의미한다.
		// $ 는 끝을 의미한다.
		// [] 는 글자 1개가 들어오는 것을 의미한다.
		// [0123456789] 은 0또는 1또는 2또는 .... 8또는 9만 들어온다는 뜻이다.
		// [0123456789] 은 [0-9] 와 같다.
		
		// [0-9]와 \\d 은 같은 것이다.
		Pattern p = Pattern.compile("^\\d{2}[01]\\d[0-3][0-9][1-4]$");
		// \\d{2} 은 \\d 이 연속적으로 2번 나온다는 뜻으로 [0-9][0-9] 와 같은 말이다.
		
		// == 2. 문자열이 주어진 정규식 패턴과 일치하는지 판별하는 객채를 생성한다. ==
		Matcher m = p.matcher(jubun);
		
		// == 3. 판별하도록 한다. == //
		// 주어진 정규식 패턴과 일치하면 true, 일치하지않으면 false 를 리턴시켜준다
		boolean bool = m.matches();
		
		return bool;
		
		
	} // end of public static boolean isCheckJubun(String jubun) ----
	
	
	
	
}
