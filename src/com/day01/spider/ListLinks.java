package com.day01.spider;

import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListLinks {
	public static void main(String[] args) throws IOException {
		
		String url = "http://www.win4000.com/wallpaper_detail_147753_2.html";
		
		String doc = Jsoup.connect(url).get().toString();
		// System.out.println(doc);

		try {
			Pattern p = Pattern.compile("<(img)(.*?)(>|></img>|/>)");// 匹配字符串中的img标签
			Matcher matcher = p.matcher(doc);
//			System.out.println(doc);
//			System.out.println(matcher.group(2));
			boolean hasPic = matcher.find();
			if (hasPic == true)// 判断是否含有图片
			{
				while (hasPic) // 如果含有图片，那么持续进行查找，直到匹配不到
				{
					String group = matcher.group(2);// 获取第二个分组的内容，也就是 (.*?)匹配到的
					Pattern srcText = Pattern.compile("(class|CLASS)=(\"|\')(pic-large)(\"|\')(.*?)(src|SRC)=(\"|\')(.*?)(\"|\')");// 匹配图片的地址
					Matcher matcher2 = srcText.matcher(group);
					if (matcher2.find()) {
						 System.out.println(matcher2.group(8));
					}
					hasPic = matcher.find();// 判断是否还有img标签
				}
			}
		} catch (Exception e) {
			System.out.println("查找完成！");
			System.out.print(e.getMessage());
		}
	}
	
	public void increment(String imgList) {
		String url1 = "http://img.ivsky.com/img/bizhi/pre/201801/21/fate_zero-00";
		String url2 = ".jpg";
		int a;
		for (a = 2; a < 12; a++) {
			System.out.println(url1 + a + url2);
		}
	}
}
