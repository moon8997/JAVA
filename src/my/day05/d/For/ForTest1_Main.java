package my.day05.d.For;

import java.util.Iterator;

/*
 **** 반복문(loop) ==> for 문 ****
  
          ※ for 문의 형식
   
    for(초기화; 조건식; 증감식) {
          반복해서 실행할 문장;
    }  
    
               ▣ 순서
    1) 초기화; // int i=0;
    2) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.)
    3) 증감식
    4) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.) 
    5) 증감식
    6) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.)                                                  
    
*/

public class ForTest1_Main {

	public static void main(String[] args) {
		
	    for(int i=0; i<10; i++) {
	    	System.out.println((i+1)+".안녕자바~~");
	    }  	
		
	/*
       1.안녕자바~~
       2.안녕자바~~
       3.안녕자바~~
       4.안녕자바~~
       5.안녕자바~~
       6.안녕자바~~
       7.안녕자바~~
       8.안녕자바~~
       9.안녕자바~~
       10.안녕자바~~ 
     */

	    
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    
	    for (int i = 0; i < 10; i+=1) {  // i+=1; --> i=i+1
			System.out.println((i+1)+". 안녕자바^^");
			
		}
		/*
	       1.안녕자바^^
	       2.안녕자바^^
	       3.안녕자바^^
	       4.안녕자바^^
	       5.안녕자바^^
	       6.안녕자바^^
	       7.안녕자바^^
	       8.안녕자바^^
	       9.안녕자바^^
	       10.안녕자바^^ 
	     */
	    
	
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
		for (int i = 0; i<10; i+=2) {
			System.out.println((i+1)+". 안녕 이클립스~~~");
		}
	    
	    /*
	       1.안녕 이클립스~~
	       3.안녕 이클립스~~
	       5.안녕 이클립스~~
	       7.안녕 이클립스~~
	       9.안녕 이클립스~~
	     */    
		
		
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
		for (int i = 0; i<10; i++) {
			System.out.println(++i +". 안녕 이클립스^^");
		}
	    
	    /*
	       1.안녕 이클립스~~
	       3.안녕 이클립스~~
	       5.안녕 이클립스~~
	       7.안녕 이클립스~~
	       9.안녕 이클립스~~
	     */    

	    System.out.println("~~~~~~~123123123~~~~~~~~~~");  
			for (int i = 2; i<10; i++) {
				System.out.println(i++ +". 안녕 이클립스^^");
			}
		    
		    /*
				2. 안녕 이클립스^^
				4. 안녕 이클립스^^
				6. 안녕 이클립스^^
				8. 안녕 이클립스^^
		     */   		
		
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
			for (int i = 0; i<20; i++) {
				System.out.println(++i +". 안녕 오라클~~");
			}
	    /*
	       1.안녕 오라클~~
	       3.안녕 오라클~~
	       5.안녕 오라클~~
	       7.안녕 오라클~~
	       9.안녕 오라클~~
	       11.안녕 오라클~~
	       13.안녕 오라클~~
	       15.안녕 오라클~~
	       17.안녕 오라클~~
	       19.안녕 오라클~~
	     */   		
	
			
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
			for (int i=0, j=0; i<10; i++, j+=2) {
				System.out.println((j+1) +". 안녕 ORACLE~~");
			}
		/*
	       1.안녕 ORACLE~~
	       3.안녕 ORACLE~~
	       5.안녕 ORACLE~~
	       7.안녕 ORACLE~~
	       9.안녕 ORACLE~~
	       11.안녕 ORACLE~~
	       13.안녕 ORACLE~~
	       15.안녕 ORACLE~~
	       17.안녕 ORACLE~~
	       19.안녕 ORACLE~~
	     */   				
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    for(int i=10; i>0; i--) {
	    	System.out.println(i+".안녕 ORACLE~~");
	    }  	
		/*
	       10.안녕 ORACLE~~
	       9.안녕 ORACLE~~
	       8.안녕 ORACLE~~
	       7.안녕 ORACLE~~
	       6.안녕 ORACLE~~
	       5.안녕 ORACLE~~
	       4.안녕 ORACLE~~
	       3.안녕 ORACLE~~
	       2.안녕 ORACLE~~
	       1.안녕 ORACLE~~
	     */   	
			
	    
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    for(int i=10; i>0; i-=1) {
	    	System.out.println(i+".안녕 스프링ㅋ");
	    }  	
		/*
	       10.안녕 스프링ㅋ
	       9.안녕 스프링ㅋ
	       8.안녕 스프링ㅋ
	       7.안녕 스프링ㅋ
	       6.안녕 스프링ㅋ~
	       5.안녕 스프링ㅋ
	       4.안녕 스프링ㅋ
	       3.안녕 스프링ㅋ
	       2.안녕 스프링ㅋ
	       1.안녕 스프링ㅋ
	     */  
	    
	    
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    for(int i=10; i>0; i--) {
	    	if(i%2!=0) { // i%2 는 i를 2로 나누었을때의 나머지를 나타내는 것이다.
	    	System.out.println(i+".안녕 springㅋ");
	    	}
	    	}  	
		/*
		9.안녕 springㅋ
		7.안녕 springㅋ
		5.안녕 springㅋ
		3.안녕 springㅋ
		1.안녕 springㅋ

	     */  
	
	    
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    for(int i=10; i>0; i-=2) {
	    	System.out.println((i-1)+".안녕하세요~~");
	    	
	    	}  	
		/*
		9.안녕하세요~~
		7.안녕하세요~~
		5.안녕하세요~~
		3.안녕하세요~~
		1.안녕하세요~~

	     */  
	    
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    for(int i=10; i>0; i--) {
	    	System.out.println(--i+".Hello~~");
	    	
	    	}  	
		/*
		9.Hello~~
		7.Hello~~
		5.Hello~~
		3.Hello~~
		1.Hello~~

	     */  
	  
	    
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
	    for (int i = 10; i > 0; i-=2) {
	    	System.out.println(i+". 제발 올라줘");	
		}
	    /*
		10. 제발 올라줘
		8. 제발 올라줘
		6. 제발 올라줘
		4. 제발 올라줘
		2. 제발 올라줘

	    */
	    
	    System.out.println("=============================");
	    int n=0; // 초기화
	    for (; n <5 ; n++) { //for 문 밖에 초기화를 넣어두 댐
			System.out.println((n+1) + ". 반복문");
		} // end of  for (int n = 0; n <5 ; n++)  ===
	    
	    //System.out.println(" >> 반복횟수 : " +n);	// n은 지역변수였기 때문에 안됐고,    
	    System.out.println(" >> 반복횟수 : " +n); // for 문 바깥에서 초기화를 해야함
	    
	    /*
	    	1. 반복문
	    	2. 반복문
	    	3. 반복문
	    	4. 반복문
	    	5. 반복문
	    	
	    	>> 반복횟수 : 5
	     */
	    
	    
	    
	}

}
