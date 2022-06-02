package my.day19.e.ENUM;

import java.util.*;

public class Main_3 {

	public static void main(String[] args) {
		
		 List<Member_1> mbrList = new ArrayList<>();
		 
		 for(int i=0; i<30; i++) {
			 
		 } // end of for -------------------
		
		  Member_1 mbr1 = new Member_1();
	      mbr1.setName("어린이");
	      mbr1.setJubun("1910203");
	      
	      mbrList.add(mbr1);
	      
	      Member_1 mbr2 = new Member_1();
	      mbr2.setName("청소년");
	      mbr2.setJubun("0910204");
	      
	      mbrList.add(mbr2);
	      
	      Member_1 mbr3 = new Member_1();
	      mbr3.setName("성년");
	      mbr3.setJubun("9410201");

	      mbrList.add(mbr3);
	      
	      Member_1 mbr4 = new Member_1();
	      mbr4.setName("어르신");
	      mbr4.setJubun("4510202");

	      mbrList.add(mbr4);
	      
	      Member_1[] mbrArr = {mbr1, mbr2, mbr3, mbr4};
	      
	      for(Member_1 mbr : mbrArr) {
	    	
	    	  System.out.println(mbr);
	      
	    	  int age = mbr.getAge();
	    	  EntranceFee_2 fee = null;
	    	  
	    	  if(age < 10) {
	    		  fee = EntranceFee_2.CHILD;
	    	  }
	    	  else if(10 <= age && age < 20) {
	    		  fee = EntranceFee_2.TEENAGER;
	    	  }
	    	  else if(20 <= age && age < 70) {
	    		  fee = EntranceFee_2.ADULT;
	    	  }
	    	  else {
	    		  fee = EntranceFee_2.OLD;
	    	  }
	    	  
	    	  System.out.println("4.입장료 : "+fee.getFee()+" 원\n");
	    	  System.out.println("~~~~~~~~~~~~~~~\n");
	      } // end of for(Member_1 mbr : mbrArr) 
	      
	      
	      
	      
	      
	} 	// end of main ---------------------

}
