package com.day01.spider;

import java.io.IOException;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Spider {
public static void main(String[] args) throws IOException{
String url = "https://www.baidu.com/";
Document document = Jsoup.connect(url).timeout(3000).get();


//通过Document的select方法获取属性结点集合
Elements elements = document.select("a");
//得到节点的第一个对象
//Element element = elements.get(0);
System.out.println(elements);

}
}