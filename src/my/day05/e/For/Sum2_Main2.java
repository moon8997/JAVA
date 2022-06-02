package my.day05.e.For;

import java.util.Iterator;
import java.util.Scanner;

public class Sum2_Main2 {

	public static void main(String[] args) {

		
		String str = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("누적해야할 시작 숫자 => ");
		int startNo = Integer.parseInt(sc.nextLine());
		
		System.out.print("누적해야할 마지막 숫자 => ");
		int endNo = Integer.parseInt(sc.nextLine());
		
		if (endNo <= startNo) {
			System.out.println("마지막 숫자가 시작숫자 보다 작을 수 없습니다.");
		}
		
		int count = endNo - startNo + 1;
		int sum = 0;
		int start = startNo;
		
		for(int i=0; i < count; i++) {
			if(start == endNo) {
				str += (i+startNo); 
			}
			else {
				str += (i+startNo) + "+";
			}
			
			
			sum += start++;
		}
		
		System.out.println(str);
		
		System.out.println(str + "=" + sum);
		
		sc.close();
	}

}
