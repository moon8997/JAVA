package my.day19.d.ENUM;

// 아래는 조금전 my.day19.c.ENUM.EntranceFee_2 클래스를 enum 을 사용하여 변경한 것이다.

// >> === enum(열거형)에 멤버(field, method) 추가하기 === <<
// 모든 enum(열거형)은 추상클래스 Enum 의 자손이다. 그러므로 field 및 생성자와 method 를 만들 수 있다.


public enum EntranceFee_2 {

	CHILD(0), TEENAGER(150), ADULT(300), OLD(100); // 끝에 ; 을 붙여야 한다.
	// !!! 사실은 열거형 상수 CHILD, TEENAGER, ADULT, OLD 하나 하나가 자기 자신인 EntracdeFee_2 객체
	
	private final int FEE;
	// 외부에서 FEE 에 접근하지 못하도록 접근제한자에 private 를 준다.
	// FEE는 열거형 상수값을 저장하기 위한 용도이므로 final 을 붙인것이다.
	
	EntranceFee_2(int fee) {
	// enum의 생성자는 접근제한자 private 가 생략되어있다.
		this.FEE = fee;
	
	}
	
	public int getFee() {
	// 외부에서 FEE값을 읽을수 있도록 접근제한자를 public 으로 준다.
		return FEE;
	}
	
}
