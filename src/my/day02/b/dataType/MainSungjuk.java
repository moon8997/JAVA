package my.day02.b.dataType;

public class MainSungjuk {

	public static void main(String[] args) {

		Sungjuk lssSj = new Sungjuk();  //lssSkj
		// lssSj 은 참조형 타입 (Reference type) 이다
		lssSj.hakbun = "091234";    //"091234"
		lssSj.name = "이순신";
		lssSj.korPoint = 68;
		lssSj.eng_point = 95;
		lssSj.mathPoint = 100;
		
		Sungjuk eomSj = new Sungjuk();  // eomSj
		// eomSj 은 참조형 타입 (Reference type) 이다
		eomSj.hakbun = "109876";
		eomSj.name = "엄정화";
		eomSj.korPoint = 100;
		eomSj.eng_point = 100;
		eomSj.mathPoint = 100;
		
		Sungjuk kangSj = new Sungjuk();
		lssSj.showSungjuk();
		/*
		  ==== 이순신 성적결과 ====
		  1. 학번 : 091234
		  2. 이름 : 이순신
		  3. 국어점수 : 68
		  4. 영어점수 : 95
		  5. 수학점수 : 100
		  6. 총점 : 263
		  7. 평균 : 87.66666666666666667
		 */
		
		eomSj.showSungjuk();
		/*
		  ==== 엄정화 성적결과 ====
		  1. 학번 : 109876
		  2. 이름 : 엄정화
		  3. 국어점수 : 78
		  4. 영어점수 : 88
		  5. 수학점수 : 95
		  6. 총점 : 261	 
		  7. 평균 : 87
		 */
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~\n");
		
		kangSj = lssSj;
		
		System.out.println("lssSj =>" + lssSj);
		//lssSj =>my.day02.dataType.Sungjuk@2401f4c3

		System.out.println("eomSj =>" + eomSj);
		//eomSj =>my.day02.dataType.Sungjuk@7637f22
		
		Sungjuk kangSj1 = new Sungjuk();
		System.out.println("kangSj =>" + kangSj);
		//kangSj =>my.day02.dataType.Sungjuk@4926097b
		
		System.out.println("\n#############\n");		
		
		kangSj.name = "강감찬";
		kangSj.korPoint = 5;
		
		lssSj.showSungjuk();
		
	}

}
