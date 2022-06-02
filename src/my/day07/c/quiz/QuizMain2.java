package my.day07.c.quiz;

public class QuizMain2 {
/*
	== 입사문제 == 
	*********1
	********2
	*******3
	******4
	*****5
	****6
	***7
	**8
	*9
	
	위와 같이 나오도록 하세요.
	1. for 문을 사용해서 출력
	2. while 문을 사용해서 출력
	3. do~while 문을 사용해서 출력
	
 */
	public static void main(String[] args) {
		int n = 0;
		for (int i = 9; i > 0; i--) {
			n += 1;
			String a = "";
			for (int j = 0; j < i; j++) {
				a += "*";		
			} // end of for =======================
			System.out.println(a+n);
		} // end of for ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		//////////////////////////////////////////////////
		System.out.println("----------------------------------");

		int i = 10, j = 0, b = 9;
		String a = "";
		
		
		while(true)
		{
			i = 10;
			a= "";
			j=0;
		while(j<b) {
			i--;
			a += "*";
			j++;
		} // end of while ===============================
		--b;
		System.out.println(a+i);
		if(b==0) break;

		}// end of while ===============================
		
	/////////////////////////////////////////////////////////////	
		i = 10; 
		j = 0;
		b = 9;
		a = "";
		
		System.out.println("----------------------------------");
		
		int loop = 0, cnt = 9, c=10;
		do {
		do {
			a+="*";
			++loop;
			--c;
		} while (loop!=cnt); // end of do~while=========================
		System.out.println(a+c);
		loop = 0;
		cnt--;
		a = "";
		c=10;
		}while(cnt!=0);
			// end of do~while=========================
		
	}
}

