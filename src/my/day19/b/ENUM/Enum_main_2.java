package my.day19.b.ENUM;

public class Enum_main_2 {

	public static void main(String[] args) {

		// 모든 enum(열거형)은 추상 클래스 Enum 의 자손이다.
		// 즉, enum(열거형)의 조상은 java.lang.Enum 클래스이다.
		// 그러므로 enum(열거형)타입은 클래스이며 java.lang.Enum 클래스에서 정의되어진 메소드를 사용할 수 있게 되어있다.

		// *** enum(열거형) 타입인 SeasonType_1 에 열거되어진 데이터 값이 뭐가 있는지 확인하고 한다. *** //
		SeasonType_1[] seasonArr = SeasonType_1.values();
		// value() 메소드 enum(열거형)의 모든 상수를 배열에 담아 반환해주는 것이다.

		System.out.println("1.~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		for(SeasonType_1 season : seasonArr) {
			String str_seasonName = season.name();
			// name() 메소드는 enum(열거형) 상수의 값을 문자열(String)로 반환해 주는것이다.
		
			System.out.println(str_seasonName);
		} // end of for -------------------------
		/*
			봄
			여름
			가을
			겨울
		*/
		System.out.println("2.~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		for(SeasonType_1 season : seasonArr) {
			
			int order = season.ordinal();
			// ordinal() 메소드는 enum(열거형) 상수가 정의된 순서를 반환해주는 것이다.
			
			String str_seasonName = season.name();
			// name() 메소드는 enum(열거형) 상수의 값을 문자열(String)로 반환해 주는것이다.
		
			System.out.println(order + "."+ str_seasonName);
		} // end of for -------------------------
	/*
		0.봄
		1.여름
		2.가을
		3.겨울
	*/

		
		
	}

}
