package my.day06.quiz.For;

public class Quiz2Main {

	public static void main(String[] args) {
			int i=0;
		  char c= 'A';
		  for(i=0; i<26; i++){
			  if(i<=24){
				  if(i%2!=0) {
					 c = Character.toLowerCase(c);
				  }
		   System.out.print(c++ +","); 
		   c = Character.toUpperCase(c);
			  }
			  else {
				  c = Character.toLowerCase(c);
				  System.out.print(c++);  
			  }
			  

		           } // end of for~~~~~~~~~
	



	}

}
