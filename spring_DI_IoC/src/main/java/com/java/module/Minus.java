package com.java.module;

public class Minus implements CalModule {

	@Override
	public int exeute(int a, int b) throws Exception {
		return a-b;
	}

}
