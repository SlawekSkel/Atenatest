package com.nauka.app.Atenatest;

public class Solution {
	
	 public int solution(String S) {
	        
		 int resent = 0;
		 int max = 0;
		 boolean isUpper = false;
		 boolean globlUpper=false;
		 
		 if(S.isEmpty()){
			 return -1;
		 }
		 
		 for (int i = 0; i < S.length(); i++) {
			
			 if(!Character.isDigit( S.charAt(i) ) ){
			 
				 if( Character.isUpperCase( S.charAt(i)) ) {
					 isUpper = true;
					 globlUpper=true;
				 }
				 resent +=1;
			 }
			 if (S.length()==i+1 || Character.isDigit( S.charAt(i+1) )){
				 
				 if(max<resent && isUpper){
					 max = resent;
				 	}
				 	resent=0;
				 	isUpper =false; 
			 }		
			 
		 }
		
		 if(globlUpper){
			 return max;
		 }else{
			 return -1;
		 }
	 }
	    

}
