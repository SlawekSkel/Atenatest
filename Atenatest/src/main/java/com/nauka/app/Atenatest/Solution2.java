package com.nauka.app.Atenatest;

import javax.naming.spi.DirStateFactory.Result;

public class Solution2 {
	
	public int solution(int[] A) {
		int result=0;
		int max =0;
		int min =0;
		
		
		for (int a : A) {
			
			if(a>max){
				max = a;
			}
			if(a<min){
				min =a;
			}
		}
		
	
		if(min<0){
			result =max - min;
		}else {
			result = max + min;
		}
		
       return result;
    }

}
