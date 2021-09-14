package com.java.module;

public class Divide implements CalModule {

	@Override
	public int exeute(int a, int b) throws Exception {		
		return a/b;
	}

}
