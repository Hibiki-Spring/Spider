package com.day01.spider;

import java.io.IOException;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Spider {
public static void main(String[] args) throws IOException{
String url = "https://www.baidu.com/";
Document document = Jsoup.connect(url).timeout(3000).get();


//ͨ��Document��select������ȡ���Խ�㼯��
Elements elements = document.select("a");
//�õ��ڵ�ĵ�һ������
//Element element = elements.get(0);
System.out.println(elements);

}
}