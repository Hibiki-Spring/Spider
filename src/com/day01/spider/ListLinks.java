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
			Pattern p = Pattern.compile("<(img)(.*?)(>|></img>|/>)");// ƥ���ַ����е�img��ǩ
			Matcher matcher = p.matcher(doc);
//			System.out.println(doc);
//			System.out.println(matcher.group(2));
			boolean hasPic = matcher.find();
			if (hasPic == true)// �ж��Ƿ���ͼƬ
			{
				while (hasPic) // �������ͼƬ����ô�������в��ң�ֱ��ƥ�䲻��
				{
					String group = matcher.group(2);// ��ȡ�ڶ�����������ݣ�Ҳ���� (.*?)ƥ�䵽��
					Pattern srcText = Pattern.compile("(class|CLASS)=(\"|\')(pic-large)(\"|\')(.*?)(src|SRC)=(\"|\')(.*?)(\"|\')");// ƥ��ͼƬ�ĵ�ַ
					Matcher matcher2 = srcText.matcher(group);
					if (matcher2.find()) {
						 System.out.println(matcher2.group(8));
					}
					hasPic = matcher.find();// �ж��Ƿ���img��ǩ
				}
			}
		} catch (Exception e) {
			System.out.println("������ɣ�");
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
