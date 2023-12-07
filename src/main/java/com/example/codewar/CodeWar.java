package com.example.codewar;

public class CodeWar {
    public static int[]squared(int [] original){
	int [] newArray = new int [original.length];

	for(int i =0; i < original.length; i++){
		int value = original[i] ;
		int squaredValue = value * value;
		newArray[i] = squaredValue;
	}
	return newArray;
    }


    public static void main(String[] args) {
        
	int[] original = {3,4,5,6,7};
	System.out.print(Arrays.toString(squared(original)));	
    }


}
