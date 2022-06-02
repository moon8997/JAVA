package my.day03.b.operator;

public class Study {

	public static void main(String[] args) {
		System.out.println("\n~~~~~~ 퀴즈1 ~~~~~~~\n");
	      int i=1;  // i==1
	      int j=i++; // j==1 / i==2
	      
	      if( (i > ++j) & (i++ == j) ) { // 2>2  & 2==2 / i==3
	    	  // false true
	         i=i+j;
	      }
	      
	      System.out.println("i="+i);  // i=3
	///////////////////////////////////////////////////////////
	      i=1; 
	      j=i++;	// i==2 / j==1
	      
	      if( (i > ++j) && (i++ == j) ) { // 2 > 2 / 2==1
	    	  //false false
	         i=i+j;
	      }
	      
	      System.out.println("i="+i);  // i=?
	      
	      
	   /////////////////////////////////////////////////////
	      System.out.println("\n~~~~~~ 퀴즈2 ~~~~~~~\n");
	      
	      int m1=0, n1=1;
	      
	      if( (m1++ == 0) | (n1++ == 2) ) { // 0==0 / 1==2
	    	  // m1 = 1 / n1==2
	    	  // true / false
	         m1=42;
	      }
	      
	      System.out.println("m1=>"+m1 + ", n1=>"+n1); // m1=>? , n1=>?
	      
	      m1=0;
	      n1=1;
	      
	      if( (m1++ == 0) || (n1++ == 2) ) { // 0==0 / 1==2
	    	  // true    ||  false
	    	  // m1==1 / n1==1
	         m1=42;
	      }
	      
	      System.out.println("m1=>"+m1 + ", n1=>"+n1); // m1=>? , n1=>?	      
	}

}
