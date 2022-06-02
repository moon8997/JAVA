package my.day11.b.stringbuilder;

public class StringBuilder_main {

	public static void main(String[] args) {
		String name = "일순신";    // 메모리상에  name 1개 소모
				name += ",이순신";  // 메모리상에  name 1개 소모
				name += ",삼순신";  // 메모리상에  name 1개 소모
				name += ",사순신";  // 메모리상에  name 1개 소모
				name += ",오순신";  // 메모리상에  name 1개 소모
				name += ",육순신";  // 메모리상에  name 1개 소모
				name += ",칠순신";  // 메모리상에  name 1개 소모
				name += ",팔순신";  // 메모리상에  name 1개 소모 
				name += ",구순신";  // 메모리상에  name 1개 소모
				 
                            // 누적되어진 메모리상의 name은 9개 소모된다고 한다. 
		System.out.println(name);
		// 일순신,이순신,삼순신,사순신,오순신,육순신,칠순신,팔순신,구순신
		
		name = "초기화";
		System.out.println(name);
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	
		StringBuilder sb = new StringBuilder(); 
		// StringBuilder가 StringBuffer 보다 가볍고 빠르다.
		// StringBuilder는 단일 쓰레드에서만 사용가능하다.
		// 단일 쓰레드 => 웹용
		
	//	StringBuffer sbf = new StringBuffer();
		// StringBuffer는 StringBuilder 보다 무겁고 다소 느리다.
		// StringBuffer는 단일 쓰레드 및 다중 쓰레드 모두 사용 가능하다.
		// 다중 쓰레드 => 게임용
		
		sb.append("일순신");
		sb.append(",이순신");
		sb.append(",삼순신");
		sb.append(",사순신");
		sb.append(",오순신");
		sb.append(",육순신");
		sb.append(",칠순신");
		sb.append(",팔순신");
		sb.append(",구순신");
				
		System.out.println(sb.toString());
		// 일순신,이순신,삼순신,사순신,오순신,육순신,칠순신,팔순신,구순신
		
		// StringBuilder 의 초기화 방법 1
		sb.setLength(0); // 길이를 0 으로 하면 된다.
		sb.append("초기화1");
		
		System.out.println(sb.toString());
		// 초기화
		
		
		// StringBuilder 의 초기화 방법 2
		sb = new StringBuilder();	
		sb.append("초기화2");
		
		System.out.println(sb.toString());
		// 초기화2
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		StringBuilder sb1 = new StringBuilder("Programming");

		System.out.println("sb1.toString() => " + sb1.toString());
		// sb1.toString() => Programming
			
		System.out.println("sb1 => " + sb1);
		// sb1 => Programming
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		StringBuilder sb2 = sb1.replace(2, 6, "AAA");
		// sb1 인 "Programming" 에서 2번째 index 인 "o"부터 6번째 index인 "m"의 앞까지를 
		// 즉, "ogra"를 지우고 그자리에 "AAA"를 넣어서 바꾸어라
		System.out.println("sb1 => " + sb1);
		// sb1 => PrAAAmming
		System.out.println("sb2 => " + sb2);
		// sb2 => PrAAAmming
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		System.out.println("sb1.toString() => " + sb1.toString());
		// sb1.toString() => PrAAAmming
		System.out.println("sb2.toString() => " + sb2.toString());
		// sb2.toString() => PrAAAmming
		
		// "PrAAAmming"
	}

}
