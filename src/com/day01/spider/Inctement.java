package com.day01.spider;

public class Inctement {
	public static void main(String args[]) throws Exception {

		String url1 = "http://img.ivsky.com/img/bizhi/pre/201801/21/fate_zero-00";
		String url2 = ".jpg";
		int a;
		for (a = 2; a < 12; a++) {
			String url = url1 + a + url2;
			System.out.println(url);
		}
	}
}
