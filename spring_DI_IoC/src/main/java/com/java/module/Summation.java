package com.java.module;

public class Summation implements CalModule {

	@Override
	public int exeute(int a, int b) throws Exception {		
		return a+b;
	}

}
