package com.nauka.app.Atenatest;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution3 {
	
	public int solution(int[] A) {
		
		Integer[] IntA = Arrays.stream( A ).boxed().toArray( Integer[]::new );
		
		int result=0;
		int max = Stream.of(IntA).max(Integer::compare).get();
		int min =Stream.of(IntA).min(Integer::compare).get();;
		
		result =max - min;
		
		return result;
    }
	

}
