package my.day18.a.generic;

import java.util.*;

// == 타입에 제한이 없는 제네릭 클래스 === //

public class Box_Anything<T> { // 클래스 이름 다음에 제네릭 타입 T를 선언한다.
							   // T는 type 이라는 뜻으로 쓴 것으로서 T 대신에 아무 글자가 와도 괜찮다.
							 
	private List<T> list = new ArrayList<>();

	public List<T> getList() {
		return list;
	}

	public void register(T item) {
		list.add(item);
	}

}
